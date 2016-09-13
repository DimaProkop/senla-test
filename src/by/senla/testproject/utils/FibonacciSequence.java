package by.senla.testproject.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dionp on 13.09.2016.
 */
public class FibonacciSequence {

    private static final int LIMIT = 10000;

    private int calculateFibonacci(int n) {
        return n <= 1 ? n : calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public List<Integer> getFibonacciSequence() {
        List<Integer> arrayFibonacci = new ArrayList<>();
        for (int i = 1; i < LIMIT; i++) {
            int value = calculateFibonacci(i);
            if (value > LIMIT) break;
            arrayFibonacci.add(value);
        }
        return arrayFibonacci;
    }


}
