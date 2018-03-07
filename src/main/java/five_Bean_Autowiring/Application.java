package five_Bean_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("five_spring.xml");

        Restaurant restaurant=applicationContext.getBean(Restaurant.class);
        System.out.println("hot drink");
        restaurant.getHotDrink().prepare();
        System.out.println();
        System.out.println();

        System.out.println("hot drink x");
        restaurant.getHotDrinkx().prepare();


    }
}
