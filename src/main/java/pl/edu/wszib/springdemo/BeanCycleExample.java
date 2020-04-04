package pl.edu.wszib.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springdemo.properties.CustomProperties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class BeanCycleExample implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
