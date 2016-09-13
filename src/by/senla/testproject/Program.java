package by.senla.testproject;

import by.senla.testproject.utils.FibonacciSequence;
import by.senla.testproject.utils.PrimeSequence;
import by.senla.testproject.utils.TaskManager;
import by.senla.testproject.writers.Writer;

import java.util.List;

/**
 * Created by dionp on 13.09.2016.
 */
public class Program {

    public static void main(String[] args) {
        PrimeSequence primeSequence = new PrimeSequence();
        List<Integer> arrayPrime = primeSequence.getArrayPrime();

        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        List<Integer> arrayFibonacci = fibonacciSequence.getFibonacciSequence();

        TaskManager taskManager = new TaskManager(arrayPrime, arrayFibonacci);
        Writer writer = new Writer();

        writer.printResult(arrayPrime, "Prime Sequence");
        writer.printResult(arrayFibonacci, "Fibonacci Sequence");
        writer.printResult(taskManager.getSquarePrime(), "An array of primes squared");
        writer.printResult(taskManager.getCubePrime(), "An array of primes in the cube");
        writer.printResult(String.valueOf(taskManager.getAvgPrime()), "The average");
        writer.printResult(taskManager.getFibonacciSequence(), "A string of three-digit numbers");
    }
}
