package day7;

import day4.Car;

import java.sql.SQLOutput;
import java.util.Arrays;

public class OOP4 {
    public static void main(String[] args) {
        whitCar();
        System.out.println(ColourEnum.WHITE);
        System.out.println(Arrays.toString(ColourEnum.values()));
        ColourEnum[] colours = ColourEnum.values();
        for (ColourEnum x:colours){
            System.out.println(x.getPlName());
        }
        System.out.println("STRIM");
        Arrays.stream(ColourEnum.values())
                .map(e ->e.getPlName())
                .forEach(e -> System.out.println(e));


    }

    private static void whitCar() {
        Car car = new Car();
        car.setColour(ColourEnum.WHITE);
        System.out.println(car.getColour().getColourNumber());
    }
}
