package pl.edu.wszib.springdemo.exc1;

import org.springframework.stereotype.Component;

@Component
class DataWriter {
    void writer(Integer result) {
        System.out.println("Result = " + result);
    }
}
