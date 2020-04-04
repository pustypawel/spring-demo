package pl.edu.wszib.springdemo;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

//@Component
public class OnStart implements CommandLineRunner {
    private final HelloPrinter helloPrinter;

    public OnStart(HelloPrinter helloPrinter) {
        this.helloPrinter = helloPrinter;
    }

    @Override
    public void run(String... args) throws Exception {
        helloPrinter.print();
        System.out.println("Argumenty: " + Arrays.asList(args));
    }
}
