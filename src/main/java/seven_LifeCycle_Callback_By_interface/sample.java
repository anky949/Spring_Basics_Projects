package seven_LifeCycle_Callback_By_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class sample implements InitializingBean,DisposableBean {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method in sample is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set method in sample class is called");
    }
}
