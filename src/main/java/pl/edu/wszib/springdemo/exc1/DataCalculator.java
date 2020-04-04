package pl.edu.wszib.springdemo.exc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class DataCalculator {

    private final boolean shouldSum;

    public DataCalculator(@Value("should.sum") String shouldSum) {
        this.shouldSum = Boolean.parseBoolean(shouldSum);
    }

    Integer calculate(List<Integer> numbers) {
        if (shouldSum) {
            return numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        } else {
            return (int) numbers.stream()
                    .mapToInt(Integer::intValue)
                    .count();
        }
    }
}
