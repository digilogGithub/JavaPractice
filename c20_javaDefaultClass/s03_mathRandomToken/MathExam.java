package c20_javaDefaultClass.s03_mathRandomToken;

class MathExam {

    void showMath() {
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
    }
}
