package eleven_Autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Restaurant {

    @Autowired /* By Default it looks for type of bean in xml. If more than one type of bean is found  then it looks for bean by name. If it does not find any compatible bean then exception is generated. */
    private HotDrink hotDrink1;

    public HotDrink getHotDrink1() {
        return hotDrink1;
    }

    /*//@Autowired //it can be here
    public Restaurant(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }*/

    //@Autowired //it can be here
    public void setHotDrink1(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }
}
