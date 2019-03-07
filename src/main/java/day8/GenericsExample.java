package Day8;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //FrutiBox frutiBox = new FrutiBox();

        GenericsFruitBox<Orange> orangeBox = new GenericsFruitBox<>(new Orange());
        orangeBox.getFruti().introduceYourself();

        GenericsFruitBox<Apple> appleBox = new GenericsFruitBox<>(new Apple());
        appleBox.getFruti().introduceYourself();
        appleBox.getFruti().introduceApple();

        List<Number> numbers = Arrays.asList(4,10.9,1,333);
        System.out.println(sumAnyNumbers(numbers));

        List<Long>longs= Arrays.asList(123L,23L);
      //  Long x = sumAnySpecifiedNumbers(long);
      //  System.out.println(x);

        List<Double> numbers1 = Arrays.asList(123.3d, 0.7d);
        Double aDouble = sumAnySpecifiedNumbers(numbers1);
        System.out.println(aDouble);
    }

    private static Double sumAnyNumbers(List<Number> numbers) {
        Double sum = 0d;
        for (Number number : numbers) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }
    private static <T extends Number> double sumAnySpecifiedNumbers(List<T> numbers){
        double sum=0d;
        for (T number : numbers) {
            sum = sum +number.doubleValue();
        }
        return sum;
    }
    private static void compileTimrSafety(){
        Orange orange = new Orange();
        GenericsFruitBox<Orange> genericsFruitBox = new GenericsFruitBox<>(orange);
    }
    private static void genericExample(){
        Apple apple = new Apple();
        GenericsFruitBox<Apple> genericsFruitBox = new GenericsFruitBox<>(apple);
        Apple apple1FromBox = genericsFruitBox.getFruti();// nie trzeba castowac
        apple1FromBox.introduceApple();
    }
    private static void notGeneric(){
        Fruti apple = new Apple();
        FrutiBox frutBox = new FrutiBox(apple);
        Apple apple1FromBox = (Apple) frutBox.getFruit();// trzeba castowac
        apple1FromBox.introduceApple();
    }
}
