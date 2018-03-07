package seven_LifeCycle_Callback_By_interface;

public class ExpressTea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare express tea");
    }
}
