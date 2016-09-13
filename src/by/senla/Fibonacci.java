package by.senla;

import java.util.ArrayList;

/**
 * Created by dionp on 13.09.2016.
 */
public class Fibonacci {

    private static final int LIMIT = 10000;
    private static ArrayList<Integer> arrayFibonacci;

    public static ArrayList<Integer> getArrayFibonacci() {
        return arrayFibonacci;
    }

    public Fibonacci() {
        arrayFibonacci = new ArrayList<>();
        findFibNumbers(LIMIT);
    }

    private int calcFib(int n) {
        return n <= 1 ? n : calcFib(n - 1) + calcFib(n - 2);
    }

    private void findFibNumbers(int n) {
        for (int i = 1; i < n; i++) {
            arrayFibonacci.add(calcFib(i));
            if (calcFib(i) > 9999) break;
        }
    }

}
