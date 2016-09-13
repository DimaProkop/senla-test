package by.senla.testproject.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dionp on 13.09.2016.
 */
public class TaskManager {

    private List<Integer> arrayPrime;
    private List<Integer> arrayFibonacci;

    public TaskManager(List<Integer> arrayPrime, List<Integer> arrayFibonacci) {
        this.arrayPrime = arrayPrime;
        this.arrayFibonacci = arrayFibonacci;
    }

    public String getFibonacciSequence() {
        String str = "";

        for (int number : arrayFibonacci) {

            String x = String.valueOf(number);
            if (x.length() == 3) {
                str += x;
            }
        }

        return str;
    }

    public List<Integer> getSquarePrime() {
        List<Integer> arraySquare = new ArrayList<>();
        for (int i = 1; i < arrayPrime.size(); i += 2) {
            arraySquare.add((int) Math.pow(arrayPrime.get(i), 2));
        }
        return arraySquare;
    }

    public List<Integer> getCubePrime() {
        List<Integer> arrayCube = new ArrayList<>();
        for (int i = 4; i < arrayPrime.size(); i += 5) {
            arrayCube.add((int)Math.pow(arrayPrime.get(i), 3));
        }
        return arrayCube;
    }

    private List<Integer> getMatcherPrime() {
        List<Integer> arrayMatchers = new ArrayList<>();
        for (Integer anArraySquare : arrayPrime) {
            if (anArraySquare % 10 == 1 || anArraySquare % 10 == 3) {
                arrayMatchers.add(anArraySquare);
            }
        }
        return arrayMatchers;
    }

    public int getAvgPrime(){
        int sum = 0;
        for (Integer anArrayAverage : getMatcherPrime()) {
            sum += anArrayAverage;
        }
        return sum;
    }
}
