package c20_javaDefaultClass.s03_mathRandomToken;

import java.io.Serializable;
import java.util.Random;
import java.util.StringTokenizer;

class Client {
    public static void main(String[] args) {
        //Math
        System.out.println("Math");
        System.out.println("원주율 : " + Math.PI);
        System.out.println("2의 제곱근 : " + Math.sqrt(2));

        System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
        System.out.println("2파이에 대한 Degree : " + Math.toDegrees((2.0 * Math.PI)));

        double radian45 = Math.toRadians(45); // 각도는 받드시 radian으로 전환!!!
        System.out.println("sin 45 :" + Math.sin(radian45));
        System.out.println("cos 45 :" + Math.cos(radian45));
        System.out.println("tan 45 :" + Math.tan(radian45));

        System.out.println("log 25 :" + Math.log(25));
        System.out.println("2의 4승 : " + Math.pow(2, 4));

        System.out.println();

        RandomSeed seed = new RandomSeed();
        seed.showRandom();
        seed.showRandom();

        seed.showRandomSeed();
        seed.showRandomSeed();

        seed.showRandomSeedMilis();
        seed.showRandomSeedMilis();
        System.out.println();
        System.out.println();


        TokennizeString2 tokennizeString2 = new TokennizeString2();
        tokennizeString2.showToken();

    }

}

class RandomSeed {
    void showRandom() {
        System.out.println();
        System.out.println("Random");
        Random seed = new Random();
        for (int i = 0; i < 20; i++)
            System.out.print(seed.nextInt(1000) + " ");
    }

    void showRandomSeed() {
        System.out.println();
        System.out.println("Random Seed");
        Random seed = new Random(12);
        for (int i = 0; i < 20; i++)
            System.out.print(seed.nextInt(1000) + " ");
    }

    void showRandomSeedMilis() {
        System.out.println();
        System.out.println("Random Seed Millisecond");
        Random seedMilis = new Random();
        seedMilis.setSeed(System.currentTimeMillis());

        for (int i = 0; i < 20; i++)
            System.out.print(seedMilis.nextInt(1000) + " ");
    }
}

class TokennizeString2 {
    String phoneNum = "TEL 82-01-234-1234";
    String javaCode = "num+=1";

    void showToken() {
        System.out.println("First Result...........");
        StringTokenizer st1 = new StringTokenizer(phoneNum);
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());


        System.out.println("Two Result - 1...........token' -'");
        System.out.println("ORGIN : " + phoneNum);
        StringTokenizer st2 = new StringTokenizer(phoneNum, " -");
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());

        System.out.println("Two Result - 2...........token'-'");
        System.out.println("ORGIN : " + phoneNum);
        StringTokenizer st4 = new StringTokenizer(phoneNum, "-");
        while (st4.hasMoreTokens())
            System.out.println(st4.nextToken());

        System.out.println("Two Result - 3...........token'234'");
        System.out.println("ORGIN : " + phoneNum);
        StringTokenizer st5 = new StringTokenizer(phoneNum, "234");
        while (st5.hasMoreTokens())
            System.out.println(st5.nextToken());

        System.out.println("Three Result...........true");
        System.out.println("ORGIN : " + javaCode);
        StringTokenizer st3 = new StringTokenizer(javaCode, "+=", true);
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }
}
