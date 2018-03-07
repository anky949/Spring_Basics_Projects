package twelve_create_bean_automatically_by_component_scan;

import org.springframework.stereotype.Component;

@Component //here we can also use @Repository or @Controller
public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("prepare tea");
    }
}
