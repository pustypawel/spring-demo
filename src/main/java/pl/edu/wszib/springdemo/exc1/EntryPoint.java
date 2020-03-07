package pl.edu.wszib.springdemo.exc1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntryPoint implements CommandLineRunner {
    private final DataReader dataReader;
    private final DataWriter dataWriter;
    private final DataCalculator dataCalculator;

    public EntryPoint(DataReader dataReader,
                      DataWriter dataWriter,
                      DataCalculator dataCalculator) {
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
        this.dataCalculator = dataCalculator;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numbers = dataReader.read();
        Integer result = dataCalculator.calculate(numbers);
        dataWriter.writer(result);
    }
}
