package one_Initialisation_By_Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("one_spring.xml");

        Restaurant restaurant=applicationContext.getBean(Restaurant.class);
        restaurant.getHotDrink().prepare();
        System.out.println(restaurant.getOrderNo());

    }
}
