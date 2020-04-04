package pl.edu.wszib.springdemo.properties;

import org.springframework.stereotype.Component;

@Component
public class CustomPropertiesExample {
    private final CustomProperties customProperties;

    public CustomPropertiesExample(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }
}
