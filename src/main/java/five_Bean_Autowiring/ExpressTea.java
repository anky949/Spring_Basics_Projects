package five_Bean_Autowiring;

public class ExpressTea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare express tea");
    }
}
