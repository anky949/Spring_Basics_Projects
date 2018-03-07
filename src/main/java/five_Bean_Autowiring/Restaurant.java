package five_Bean_Autowiring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant{

    private HotDrink hotDrink;
    private HotDrink hotDrinkx;

    public HotDrink getHotDrinkx() {
        return hotDrinkx;
    }

    public void setHotDrinkx(HotDrink hotDrinkx) {
        this.hotDrinkx = hotDrinkx;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) { // if we comment this method bean will not initialize in spring_config.xml
        this.hotDrink = hotDrink;
    }


}
