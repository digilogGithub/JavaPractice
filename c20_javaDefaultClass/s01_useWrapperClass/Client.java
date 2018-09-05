package c20_javaDefaultClass.s01_useWrapperClass;

class Client {

    public static void showData(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer intInst = new Integer(3);
        showData(intInst);
        showData(new Integer(7));
    }
}
