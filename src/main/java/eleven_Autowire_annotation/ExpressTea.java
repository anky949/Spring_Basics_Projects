package eleven_Autowire_annotation;

public class ExpressTea  implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("prepare  express tea");
    }
}
