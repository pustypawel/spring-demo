package pl.edu.wszib.springdemo.exc1;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DataCalculator {

    Integer calculate(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
