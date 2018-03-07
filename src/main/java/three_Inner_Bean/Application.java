package three_Inner_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("three_spring.xml");

        Restaurant restaurant=applicationContext.getBean("restaurant1",Restaurant.class);
        restaurant.getHotDrink().prepare();
        System.out.println(restaurant.getOrderNo());

    }
}
