package three_Inner_Bean;

public class Restaurant {

    private HotDrink hotDrink;
    private int orderNo;

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public int getOrderNo() {
        return orderNo;
    }
}
