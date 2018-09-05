package c20_javaDefaultClass.s02_handleBigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

class Client {
    public static void main(String[] args) {
        System.out.println("Long 형의 최대/최소");
        System.out.println("최대 정수 : " + Long.MAX_VALUE);
        System.out.println("최대 정수 : " + Long.MIN_VALUE);

        System.out.println("BigInteger 사용");
        BigInteger bigInteger1 = new BigInteger("10000000000000000000000");
        BigInteger bigInteger2 = new BigInteger("-9999999999999999999999");

        BigInteger addResult = bigInteger1.add(bigInteger2);
        BigInteger mulResult = bigInteger1.multiply(bigInteger2);

        System.out.println("큰 수의 덧셈 결과 : " + addResult);
        System.out.println("큰 수의 곱셈 결과 : " + mulResult);

        // double error
        double e1 = 1.6;
        double e2 = 0.1;
        System.out.println();
        System.out.println("에러1");
        System.out.println("두 수의 덧셈 결과 : " + (e1 + e2));
        System.out.println("두 수의 곱셈 결과 : " + (e1 * e2));

        //
        System.out.println();
        BigDecimal b1 = new BigDecimal(1.6);
        BigDecimal b2 = new BigDecimal(0.1);
        System.out.println("에러2");
        System.out.println("두 수의 덧셈 결과 : " + b1.add(b2));
        System.out.println("두 수의 곱셈 결과 : " + b1.multiply(b2));

        System.out.println();
        BigDecimal c1 = new BigDecimal("1.6");
        BigDecimal c2 = new BigDecimal("0.1");
        System.out.println("반드시 \"\" 사용");
        System.out.println("두 수의 덧셈 결과 : " + c1.add(c2));
        System.out.println("두 수의 곱셈 결과 : " + c1.multiply(c2));

    }
}
