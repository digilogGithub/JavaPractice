package c20_javaDefaultClass.s01_boxingUnboxing;

class Client {
    public static void main(String[] args) {
        Integer iValue = new Integer(10);
        Double dValue = new Double(3.14);

        System.out.println("Boxing");
        System.out.println(iValue);
        System.out.println(dValue);

        iValue = new Integer(iValue.intValue() + 10);
        dValue = new Double(dValue.doubleValue() + 1.2);

        System.out.println("Unboxing");
        System.out.println(iValue);
        System.out.println(dValue);

//        autoboxing, autounboxing
        iValue = 10;
        dValue = 3.14;

        System.out.println("AutoBoxing");
        System.out.println(iValue);
        System.out.println(dValue);

        int num1 = iValue;
        double num2 = dValue;

        System.out.println("AutoUnBoxing");
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("AutoBoxing/AutoUnboxing");
        iValue++; // num1 = new (iValue.intValue() + 1)
        System.out.println(iValue);

        int addResult = iValue + num1;
        System.out.println(addResult);

        int subResult = iValue - num1;
        System.out.println(subResult);
    }
}
