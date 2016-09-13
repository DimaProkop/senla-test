package by.senla.testproject.utils;

import java.util.ArrayList;

/**
 * Created by dionp on 13.09.2016.
 */
public class PrimeSequence {

    private static final int LIMIT = 1000;
    private ArrayList<Integer> arrayPrime;
    public PrimeSequence() {
        arrayPrime = new ArrayList<>();
        findPrimeNumbers(LIMIT);
    }

    private void findPrimeNumbers(int n) {
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



    public ArrayList<Integer> getArrayPrime() {
        return arrayPrime;
    }

}
