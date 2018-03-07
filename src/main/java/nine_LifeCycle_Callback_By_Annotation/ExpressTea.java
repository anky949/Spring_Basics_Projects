package nine_LifeCycle_Callback_By_Annotation;

public class ExpressTea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare express tea");
    }
}
