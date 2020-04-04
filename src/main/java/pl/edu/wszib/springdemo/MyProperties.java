package pl.edu.wszib.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {
    @Value("${my.property}")
    private String myProperty;

    @Override
    public String toString() {
        return "MyProperties{" +
                "myProperty='" + myProperty + '\'' +
                '}';
    }
}
