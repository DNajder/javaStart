package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prepareRandomArray((short) 10)));// zmina na short

    }
    public  static short[] prepareRandomArray (short howLong){
        short[] tabForRandNum = new  short[howLong];
        Random random = new Random();
        for (short i = 0 ; i < howLong ; i++){
            tabForRandNum[i] = (short) random.nextInt();
        }
        return tabForRandNum;
    }
}
