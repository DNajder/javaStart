package day4;

import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {// todo
        Car car = new Car();// błedy w wydrukowaniu w konsoli
        car.setModel("Fabia");
        System.out.println(car.getModel());
        System.out.println(car);
        CarOption leatherSeats = new CarOption();
        leatherSeats.setOptionName("Skóra");
        leatherSeats.setChoosen(true);
        leatherSeats.setOptionPrice(BigDecimal.valueOf(1.99));
        CarOption radio = new CarOption();
        radio.setOptionName("Radyjko");
        radio.setChoosen(true);
        radio.setOptionPrice(BigDecimal.valueOf(2.99));
        CarOption[] options = new CarOption[]{radio, leatherSeats};
        car.setOptions(options);
        car.setBasePrice(BigDecimal.valueOf(0.99));
        System.out.println(summaryPrice(car));
        System.out.println(car.summeryPrice());

        System.out.println(car.toString());
        System.out.println(car);


    }
    private static BigDecimal summaryPrice(Car car) {
        BigDecimal result = car.getBasePrice();
        CarOption[] carOptions = car.getOptions();
        for (int i = 0; i < carOptions.length; i++) {
            result = result.add(carOptions[i].getOptionPrice());
        }
        return result;
        }
    }

