package twelve_create_bean_automatically_by_component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("twelve_spring.xml");
        Restaurant restaurant = applicationContext.getBean( Restaurant.class);
        restaurant.getHotDrink1().prepareHotDrink();


    }
}
