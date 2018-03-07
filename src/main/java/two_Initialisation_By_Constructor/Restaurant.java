package two_Initialisation_By_Constructor;

public class Restaurant {

    private HotDrink hotDrink;
    private int orderNo;

    Restaurant(HotDrink hd,int ono){
        hotDrink=hd;
        orderNo=ono;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public int getOrderNo() {
        return orderNo;
    }
}
