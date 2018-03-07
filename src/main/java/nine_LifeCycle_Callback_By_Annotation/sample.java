package nine_LifeCycle_Callback_By_Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class sample {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @PreDestroy
    public void destroy1() {
        System.out.println("destroy method in sample class is called");
    }

    @PostConstruct
    public void myinit1() {
        System.out.println("init method in sample class class is called");
    }
}
