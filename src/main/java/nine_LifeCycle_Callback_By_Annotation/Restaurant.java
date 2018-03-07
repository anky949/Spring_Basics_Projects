package nine_LifeCycle_Callback_By_Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

@PreDestroy
    public void destroyx() {
        System.out.println("destroy method in Restaurant class is called");
    }

@PostConstruct
    public void initx() {
        System.out.println("init method in Restaurant class class is called");
    }

    }
