package five_Bean_Autowiring;

public class Tea implements HotDrink {

    @Override
    public void prepare() {
        System.out.println("prepare tea");
    }
}
