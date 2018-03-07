package seven_LifeCycle_Callback_By_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean,DisposableBean {

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


/*
    For bean implemented DisposableBean, it will run destroy() after Spring container is released the bean.
*/
@Override
    public void destroy() throws Exception {
        System.out.println("destroy method in Restaurant class is called");
    }


   /* For bean implemented InitializingBean, it will run afterPropertiesSet() after all bean properties have been set.*/

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set method in Restaurant class is called");
    }

    }
