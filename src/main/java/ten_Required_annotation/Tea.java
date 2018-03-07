package ten_Required_annotation;

public class Tea implements HotDrink {

    @Override
    public void prepareHotDrink() {
        System.out.println("prepare tea");
    }
}
