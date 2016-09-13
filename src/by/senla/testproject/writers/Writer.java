package by.senla.testproject.writers;

import java.util.List;

/**
 * Created by dionp on 13.09.2016.
 */
public class Writer {

    public void printResult(List<Integer> array, String description){
        System.out.println(description);
        for (Integer value : array) {
            System.out.print(value + "|");
        }
        System.out.println();
    }

    public void printResult(String value, String description){
        System.out.println(description +": " + value);
    }
}
