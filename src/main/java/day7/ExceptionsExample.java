package day7;


public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            System.out.println(dividie(2, 0));
        }catch (ArithmeticException e){
            System.out.println("Wystąpił wyjątek: " + e.getMessage());
        }
        System.out.println(dividie(2,2));

        try {
            System.out.println(divideWithException(2,0));
        }catch (RuntimeException e){
            System.out.println("Wystąpił wyjątek ; " + e.getMessage());
        }finally {
            System.out.println("Blok Finally");
        }
        try {
            divideWithException(2,0);
        }catch (Exception e){
            e.printStackTrace();//sprawia że bład jest ale program dziła dalej
          //  System.out.println(e.getMessage());
        }
        System.out.println(divideWithException(4,2));
        System.out.println("Koniec programu");



    }
    public  static  int dividie(int a, int b){
        return a/b;
    }
    public  static  int divideWithException(int a, int b){
        if(b==0){
            throw new MyRuntimeException("Nie dziel cholero przez zero");
        }
        return a/b;
    }
    public static int divideWithMyCheckedException(int a, int b)throws MyCheckedException{
        if (b==0){
            throw new MyCheckedException("Nie dziel cholero przez zero");
        }
        return  a/b;
    }
}
