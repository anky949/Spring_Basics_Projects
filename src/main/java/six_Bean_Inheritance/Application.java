package six_Bean_Inheritance;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("six_spring.xml");

        Triangle triangle=applicationContext.getBean(Triangle.class);
        System.out.println(triangle.getA());
        System.out.println(triangle.getB());
        System.out.println(triangle.getC());




    }
}
