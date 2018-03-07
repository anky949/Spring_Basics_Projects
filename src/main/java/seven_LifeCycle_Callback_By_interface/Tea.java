package seven_LifeCycle_Callback_By_interface;

public class Tea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare tea");
    }
}
