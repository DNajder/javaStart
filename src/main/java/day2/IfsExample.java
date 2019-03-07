package day2;

import java.math.BigDecimal;


public class IfsExample {

    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isEvenTernary(5));
        System.out.println(dividableByThreeandFive(15));
        System.out.println(addTax(110, 25));
        System.out.println(introduction("Słonik", 88, true));
        System.out.println(twoParamsEven(330,34));
        System.out.println(threeParamsSum(23,34,57));
        System.out.println(isAnyBiggerThanZero(0,0));
        System.out.println(answerCall(true,true,false));
        System.out.println(checkWhichOneIsBigger(7,3,5));



    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public  static boolean isEvenTernary(int a){
        boolean result = a %2 == 0 ? true : false;
        return  result;
    }
    public  static  boolean dividableByThreeandFive (int a){
        boolean result = a % 3 == 0 && a % 5 ==0;
        return result;
    }
    public  static BigDecimal addTax(double preis, int tax){
        BigDecimal afterTax = new BigDecimal(preis * tax/100 + preis);
        return afterTax;
    }
    public static  String  introduction(String name, int age, boolean genderParam){
        String gender;
        if(genderParam){
            gender = "Mężczyną";
        }else {
            gender = "Kobietą";
        }
        return "Cześć! Jestem " + name +" mam " + age+ " lat i jestem " + gender;
    }
    public  static  boolean twoParamsEven(int firstValue, int secondValue){
        if(firstValue % 2 ==0 && secondValue % 2==0){
            return true;
        }else {
            return  false;
        }
    }
    public  static boolean threeParamsSum(int firstValue, int secondValue,int thirdValue){
        if(firstValue + secondValue == thirdValue){
            return  true;
        }else if(secondValue + thirdValue == firstValue){
            return  true;
        }else if (thirdValue + firstValue == secondValue){
            return  true;
        }else {
            return  false;
        }
    }
    public  static boolean isAnyBiggerThanZero(int a, int b){
        return a>0 || b>0;
    }
    public static boolean answerCall(boolean isMama, boolean isMorning, boolean isAsleep){
        if (isAsleep){
            return  false;
        }
        if (isMama & !isMama){
            return false;
        }
        return true;
    }
    public static int checkWhichOneIsBigger(int a, int b, int c){
        if (a>b && a>c){
            return a;
        }
        if (b>a && b>c){
            return b;
        }
        return c;
    }

}
