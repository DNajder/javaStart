package dey1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntigerBigDecimal {
    public static void main(String[] args) {
        BigInteger bI = new BigInteger("264984985");
        BigInteger newBI = new BigInteger("9654654");
        System.out.println(bI.add(newBI));

        double x =0.02;
        double y =0.03;
        double z;
        z = x - y;
        System.out.println(z);

        BigDecimal xxx = new BigDecimal("0.02");
        BigDecimal yyy = new BigDecimal("0.03");
        BigDecimal zzz = xxx.subtract(yyy);
        System.out.println(zzz);

        BigDecimal xx = new BigDecimal(x);
        BigDecimal yy = new BigDecimal(y);
        BigDecimal zz = xx.subtract(yy);

        System.out.println(zz);

        BigDecimal xxxx = BigDecimal.valueOf(x);
        BigDecimal yyyy = BigDecimal.valueOf(y);
        BigDecimal zzzz = xxxx.subtract(yyyy);
        System.out.println(zzzz);

    }
}
