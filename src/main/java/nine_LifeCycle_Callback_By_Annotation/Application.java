package nine_LifeCycle_Callback_By_Annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("nine_spring.xml");

        Restaurant restaurant=configurableApplicationContext.getBean(Restaurant.class);
        System.out.println("hot drink");
        restaurant.getHotDrink().prepare();
        System.out.println();
        System.out.println();

        System.out.println("hot drink x");
        restaurant.getHotDrinkx().prepare();

        sample sobj=configurableApplicationContext.getBean(sample.class);
        System.out.println(sobj.getX());

        configurableApplicationContext.registerShutdownHook();





    }
}
