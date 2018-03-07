package twelve_create_bean_automatically_by_component_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component //here we can also use @Repository or @Controller
public class Restaurant {

    @Autowired
    private HotDrink hotDrink1;

    public HotDrink getHotDrink1() {
        return hotDrink1;
    }


//@Required //it must not used when we use @Autowire annotation
    public void setHotDrink1(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }
}
