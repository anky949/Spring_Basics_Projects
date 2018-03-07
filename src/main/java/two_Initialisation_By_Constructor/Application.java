package two_Initialisation_By_Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("two_spring.xml");

        Restaurant restaurantx=applicationContext.getBean("restaurant1",Restaurant.class);
        System.out.println("restaurant 1 bean data");
        restaurantx.getHotDrink().prepare();
        System.out.println(restaurantx.getOrderNo());
        System.out.println();
        System.out.println();

    restaurantx=applicationContext.getBean("restaurant2",Restaurant.class);
        System.out.println("restaurant 2 bean data");
        restaurantx.getHotDrink().prepare();
        System.out.println(restaurantx.getOrderNo());

        System.out.println();
        System.out.println();

        restaurantx=applicationContext.getBean("restaurant3",Restaurant.class);
        System.out.println("restaurant 3 bean data");
        restaurantx.getHotDrink().prepare();
        System.out.println(restaurantx.getOrderNo());


    }
}
