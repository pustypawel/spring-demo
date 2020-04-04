package pl.edu.wszib.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OnStartConfiguration {

    @Bean
    public OnStart on123Start(MyProperties myProperties) {
        return new OnStart(helloPrinter(), myProperties);
    }

    @Bean
    HelloPrinter helloPrinter() {
        return new HelloPrinter();
    }
}
//@Primary
//@Qualifier