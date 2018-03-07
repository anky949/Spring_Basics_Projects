package eight_LifeCycle_Callback_By_bean_tag;

public class Tea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare tea");
    }
}
