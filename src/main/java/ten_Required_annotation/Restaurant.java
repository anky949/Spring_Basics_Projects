package ten_Required_annotation;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {

   // @Required  /* it should not here */
    private HotDrink hotDrink1;

    public HotDrink getHotDrink1() {
        return hotDrink1;
    }


@Required //this annotation tells set ref or value of hotDrink1 is mandatory otherwise it will throw compile time exception
    public void setHotDrink1(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }
}
