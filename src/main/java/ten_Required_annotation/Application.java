package ten_Required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ten_spring.xml");
        Restaurant restaurant = applicationContext.getBean("restaurant1", Restaurant.class);
        restaurant.getHotDrink1().prepareHotDrink();


    }
}
