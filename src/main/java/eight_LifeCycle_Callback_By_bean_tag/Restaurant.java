package eight_LifeCycle_Callback_By_bean_tag;

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
        System.out.println("setter method is called");
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) { // if we comment this method bean will not initialize in spring_config.xml
        this.hotDrink = hotDrink;
    }


    public void mydestroy() {
        System.out.println("destroy method in Restaurant class is called");
    }


    public void myinit() {
        System.out.println("init method in Restaurant class class is called");
    }

    }
