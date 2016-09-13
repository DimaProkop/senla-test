package by.senla;


/**
 * Created by dionp on 13.09.2016.
 */
public class TasksFibonacci extends Fibonacci {

    private Fibonacci fibonacci;
    private String fibStr = "";

    public TasksFibonacci() {
        fibonacci = new Fibonacci();
    }

    public String getFibStr() {
        return fibStr;
    }

    private void findFibStr() {
        int count = 0;

        for (int i = 0; i < getArrayFibonacci().size(); i++) {
            int value = getArrayFibonacci().get(i);

            while (value > 0) {
                value /= 10;
                count++;
            }
            if (count == 3) {
                fibStr += getArrayFibonacci().get(i).toString();
            }
            count = 0;
        }

    }

    public void Init() {

        for (int i = 0; i < getArrayFibonacci().size(); i++) {
            System.out.print(getArrayFibonacci().get(i) + "|");
        }

        findFibStr();
    }

}
