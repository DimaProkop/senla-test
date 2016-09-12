import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> arrayC = new ArrayList<>();
        ArrayList <Integer> arrayE = new ArrayList<>();
        ArrayList <Integer> arrayF = new ArrayList<>();

        //a)вычисляет простые числа в пределах от 1 до 1000
        System.out.println("[Task a]");
        for (int i = 1; i <= 1000; i++) {
            if (prime(i)) {
                System.out.print(i + "|");
                arrayC.add(i);
            } else {
                continue;
            }
        }

        //b) вычисляет числа Фибоначчи в пределах от 1 до 10000
        System.out.println();
        System.out.println("[Task b]");
        for (int i = 1; i <= 10000; i++) {
            System.out.print(fib(i) + "|");
            arrayF.add(fib(i));
            if (fib(i) > 9999) break;
        }


        //c) возводит в квадрат каждое второе число из массива простых чисел
        System.out.println();
        System.out.println("[Task c]");
        for(int i = 1; i < arrayC.size();i+=2){
            System.out.print((arrayC.get(i)*arrayC.get(i)) + "|");
        }

        //d) возводит в куб каждое пятое число из массива простых чисел
        System.out.println();
        System.out.println("[Task d]");
        for(int i = 4; i < arrayC.size();i+=5){
            System.out.print((arrayC.get(i)*arrayC.get(i)*arrayC.get(i)) + "|");
        }


        //е) находит среднее арифметическое из массива простых чисел, которые заканчиваются на 1 или 3
        System.out.println();
        System.out.println("[Task e]");
        for(int i = 0; i < arrayC.size();i++){
            if(arrayC.get(i)%10==1 || arrayC.get(i)%10==3){
                arrayE.add(arrayC.get(i));
            }
        }

        int sum = 0;

        for(int i = 0; i < arrayE.size();i++){
            sum += arrayE.get(i);
        }
        System.out.print(sum/arrayE.size());

        System.out.println();
        System.out.println("[Task f]");


        //f) трёхзначные числа из массива чисел Фибоначчи сложить в строку
        int count =0;
        String fibStr = "";

        for(int i = 0; i < arrayF.size();i++){
            int value = arrayF.get(i);

            while(value>0) {
                value /= 10;
                count ++;
            }
            if(count==3){
                fibStr += arrayF.get(i).toString();
            }
            count = 0;
        }

        System.out.print(fibStr);


    }

    public static int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }

    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
