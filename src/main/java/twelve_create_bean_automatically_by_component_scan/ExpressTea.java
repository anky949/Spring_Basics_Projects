package twelve_create_bean_automatically_by_component_scan;

public class ExpressTea  implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("prepare  express tea");
    }
}
