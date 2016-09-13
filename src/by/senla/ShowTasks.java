package by.senla;

/**
 * Created by dionp on 13.09.2016.
 */
public class ShowTasks {

    private static TasksPrime tasksPrime = new TasksPrime();
    private static TasksFibonacci tasksFibonacci = new TasksFibonacci();

    public static void main(String[] args) {
        System.out.println("[Task a]");
        tasksPrime.InitAndShow();
        System.out.println();

        System.out.println("[Task b]");
        tasksFibonacci.Init();
        System.out.println();

        showSquareArray();
        showCubeArray();
        showAverage();

        showFibStr();

    }

    private static void showSquareArray() {
        System.out.println("[Task c]");
        for (int i = 0; i < tasksPrime.getArraySquare().size(); i++) {
            System.out.print(tasksPrime.getArraySquare().get(i) + "|");
        }
        System.out.println();
    }

    private static void showCubeArray() {
        System.out.println("[Task d]");
        for (int i = 0; i < tasksPrime.getArrayCube().size(); i++) {
            System.out.print(tasksPrime.getArrayCube().get(i) + "|");
        }
        System.out.println();
    }

    private static void showAverage() {
        System.out.println("[Task e]");
        System.out.println(tasksPrime.getSumm());
    }

    private static void showFibStr() {
        System.out.println("[Task f]");
        System.out.println(tasksFibonacci.getFibStr());
    }
}
