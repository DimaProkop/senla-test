package by.senla;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;

/**
 * Created by dionp on 13.09.2016.
 */
public class TasksPrime extends Prime {

    private Prime prime;
    private ArrayList<Integer> arraySquare;
    private ArrayList<Integer> arrayCube;
    private int Summ;

    public TasksPrime() {
        prime = new Prime();
    }

    public ArrayList<Integer> getArraySquare() {
        return arraySquare;
    }

    public ArrayList<Integer> getArrayCube() {
        return arrayCube;
    }

    public int getSumm() {
        return Summ;
    }

    public void SquarePrime() {
        arraySquare = new ArrayList<>();
        for (int i = 1; i < getArrayPrime().size(); i += 2) {
            arraySquare.add(getArrayPrime().get(i) * getArrayPrime().get(i));
        }
    }

    public void CubePrime() {
        arrayCube = new ArrayList<>();
        for (int i = 4; i < getArrayPrime().size(); i += 5) {
            arrayCube.add(getArrayPrime().get(i) * getArrayPrime().get(i) * getArrayPrime().get(i));
        }
    }

    public void ArithmPrime() {
        ArrayList<Integer> arrayAverage = new ArrayList<>();
        for (Integer anArraySquare : getArrayPrime()) {
            if (anArraySquare % 10 == 1 || anArraySquare % 10 == 3) {
                arrayAverage.add(anArraySquare);
            }
        }

        for (Integer anArrayAverage : arrayAverage) {
            Summ += anArrayAverage;
        }
    }

    public void InitAndShow() {
        SquarePrime();
        CubePrime();
        ArithmPrime();

        for (int i = 0; i < getArrayPrime().size(); i++) {
            System.out.print(getArrayPrime().get(i) + "|");
        }
    }


}
