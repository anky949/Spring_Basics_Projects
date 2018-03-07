package three_Inner_Bean;

public class Tea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare tea");
    }
}
