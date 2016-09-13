package by.senla;

import java.util.ArrayList;

/**
 * Created by dionp on 13.09.2016.
 */
public class Prime {

    private static final int LIMIT = 1000;
    private static ArrayList<Integer> arrayPrime;

    public static ArrayList<Integer> getArrayPrime() {
        return arrayPrime;
    }

    public Prime() {
        arrayPrime = new ArrayList<>();
        findPrimeNumbers(LIMIT);
    }

    public static void findPrimeNumbers(int n) {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arrayPrime.add(i);
            }
        }
    }
}
