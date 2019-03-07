package day2;

public class MethodsExample {
    public static void main(String[] args) {
        System.out.println("pole prostokąta a*b");
        byte a = 2;
        int b = 3;
        int x = a * b;
        System.out.println(x);
        int result = rectangleArea(a, b);
        System.out.println(result);
        result = rectangleArea(5, 5);
        System.out.println(result);// reużycie zmiennnej resault
        System.out.println(rectangleArea(4, 5));// użycie metody wewnatrz argumentów 2giej metody
        System.out.println("sumThreeDigitsOfNumber " + sumThreeDigitsOfNumber(789));
        System.out.println(bim(100,1.90));;

    }

    public static int rectangleArea(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int rectangleCircuit(int a, int b) {
        int result = 2 * a + 2 * b;
        return result;
    }

    public static double inchToMeter(double inches) {// o co chodzi
        double result = inches * 0.0254;
        return result;
    }

    public static String minutesToDateValue(int minutes) {
        int h = minutes / 60;
        int m = minutes % 60;
        int d = minutes / (60 * 24);
        int y = minutes / (d * 365);//fixme
        return y + "y " + d + "d " + h + "h " + m + "m ";
    }


    public static int sumThreeDigitsOfNumber(int number) {
        int last = number % 10;
        int middle = number % 100 / 10;
        int first = number % 1000 / 100;
        int sum = last + middle + first;

        return sum;

    }

    public static double bim(double weight, double hight) {
        double result = weight / Math.pow(hight, 2);
        return result;
    }
}