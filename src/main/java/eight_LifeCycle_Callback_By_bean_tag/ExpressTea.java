package eight_LifeCycle_Callback_By_bean_tag;

public class ExpressTea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare express tea");
    }
}
