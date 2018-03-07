package three_Inner_Bean;

public class ExpressTea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare express tea");
    }
}
