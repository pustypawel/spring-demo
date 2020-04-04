package pl.edu.wszib.springdemo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueWay {
    @Value("${my.value}")
    private String myValue;

    @Override
    public String toString() {
        return "ValueWay{" +
                "myValue='" + myValue + '\'' +
                '}';
    }
}
