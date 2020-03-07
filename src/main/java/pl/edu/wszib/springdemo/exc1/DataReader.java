package pl.edu.wszib.springdemo.exc1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
class DataReader {
    List<Integer> read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?");
        int count = scanner.nextInt();
        System.out.println("Wprowadź liczby");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(scanner.nextInt());
        }
        System.out.println("Wprowadziłeś: " + result);
        return result;
    }
}
