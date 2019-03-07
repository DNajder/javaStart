package day3;

public class WhileExample {
    public static void main(String[] args) {
        fibonacci(10);
        countDownFor(15);
        countDownDoWhile(5);

    }

    private static void fibonacci(int numberOfElements) {
        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println(0);
        System.out.println(1);
        while (counter < numberOfElements) {
            int sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
            counter++;
        }


    }

    public static void countDownFor(int start) {
        System.out.println("Parametr = " + start);
        while (start >= 0) {
            System.out.println(start);
            start--;
        }
    }

    public static void countDownDoWhile(int start) {
        System.out.println("Parametr = " + start);
        if (start <= 0) {
            return;
        }
        do {
            System.out.println(start);
            start--;
        } while (start >= 0);
    }
}
