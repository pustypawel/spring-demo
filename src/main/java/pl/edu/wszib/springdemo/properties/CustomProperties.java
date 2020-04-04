package pl.edu.wszib.springdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@ConstructorBinding
@ConfigurationProperties(value = "custom.properties")
public class CustomProperties {
    private Boolean disabled = false;

    private String color;

    private CustomProperties2 customProperties2;

    public CustomProperties(Boolean disabled,
                            String color,
                            CustomProperties2 customProperties2) {
        this.disabled = disabled;
        this.color = color;
        this.customProperties2 = customProperties2;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public String getColor() {
        return color;
    }

    public CustomProperties2 getCustomProperties2() {
        return customProperties2;
    }

    public void setCustomProperties2(CustomProperties2 customProperties2) {
        this.customProperties2 = customProperties2;
    }

    private static class CustomProperties2 {
        private String test1;
        private String test2;
    }
}
