package c18_handleException.s01_ExceptionHandleUself;

class Client {
    public static void main(String[] args) {
        System.out.println("ExceptionHandleUself1");
        ExceptionHandleUself1 exceptionHandleUself1 = new ExceptionHandleUself1();
        exceptionHandleUself1.showDemo();

        System.out.println();
        System.out.println("ExceptionHandleUself2");
        ExceptionHandleUself2 exceptionHandleUself2 = new ExceptionHandleUself2();
        exceptionHandleUself2.showDemo();
    }
}

