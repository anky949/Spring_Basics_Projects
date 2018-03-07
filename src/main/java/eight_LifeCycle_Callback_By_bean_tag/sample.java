package eight_LifeCycle_Callback_By_bean_tag;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class sample {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

/*

    For bean implemented DisposableBean, it will run destroy() after Spring container is released the bean.
 */
    public void mydestroy() {
        System.out.println("destroy method in sample class is called");
    }

/* For bean implemented InitializingBean, it will run afterPropertiesSet() after all bean properties have been set. */
    public void myinit() {
        System.out.println("init method in sample class class is called");
    }
}
