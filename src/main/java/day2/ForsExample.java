package day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Adam");
        }
        printFewNaturalNubers(4);
        prinNumbersWithoutDividableByParam(3);
        sumNaturalNumbersToLimit(1000);
    }

    public static void printFewNaturalNubers(int endNumber) {
        for (int i = 0; i < endNumber; i++) {
            System.out.println(i);

        }
    }
    public static void prinNumbersWithoutDividableByParam(int param){
        System.out.println("Parametr = " + param);
        for (int i= 0; i <=10; i++  ){
            if (i % param != 0){
                System.out.println(i);
            }
        }
        for (int i = 0; i<= 10; i++){
            if (i% param==0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void sumNaturalNumbersToLimit(int limit) {
        int sum= 0;
        for (int i =0 ; ;i++){
            if(sum +1 >= limit){
                break;
            }
            sum= sum +i;
        }
        System.out.println(sum);

    }


}