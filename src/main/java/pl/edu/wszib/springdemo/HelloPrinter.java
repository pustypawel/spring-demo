package pl.edu.wszib.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HelloPrinter {
    public void print() {
        System.out.println("Hello");
    }
}
