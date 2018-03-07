package four_Collection_Initialisation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("four_spring.xml");

        example ex=applicationContext.getBean(example.class);
        System.out.println("list is : "+ex.getList1());
        System.out.println("set is :"+ex.getSet1());
        System.out.println("map is :"+ex.getMap1());
    }
}
