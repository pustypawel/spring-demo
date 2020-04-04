package pl.edu.wszib.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OnStartConfiguration {

    @Bean
    public OnStart on123Start() {
        return new OnStart(helloPrinter());
    }

    @Bean
    HelloPrinter helloPrinter() {
        return new HelloPrinter();
    }
}
//@Primary - oznacza beana jako "główny"
//@Qualifier - pozwala wstrzyknąć beana przez nazwę (istotne gdy mamy kilka beanów tej samej klasy)
//@Value - wartość z properties