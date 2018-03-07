package one_Initialisation_By_Setter;

public class Restaurant {

    private HotDrink hotDrink;
    private int orderNo;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) { // if we comment this method bean will not initialize in spring_config.xml

        this.hotDrink = hotDrink;
        System.out.println("setter method is called by restaurant bean for set value of hotDrink");
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo)
    {
        System.out.println("setter method is called by restaurant bean for set value of orderNo");
        this.orderNo = orderNo;
    }
}
