package c20_javaDefaultClass.s03_mathRandomToken;

import java.util.StringTokenizer;

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
