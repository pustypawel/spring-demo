package pl.edu.wszib.springdemo;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

//@Component
public class OnStart implements CommandLineRunner {
    private final HelloPrinter helloPrinter;
    private final MyProperties myProperties;

    public OnStart(HelloPrinter helloPrinter,
                   MyProperties myProperties) {
        this.helloPrinter = helloPrinter;
        this.myProperties = myProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        helloPrinter.print();
        System.out.println("Argumenty: " + Arrays.asList(args));
        System.out.println("MyProperties: " + myProperties);
    }
}
