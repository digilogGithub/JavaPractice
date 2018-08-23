package interface_17.LocalAnonymousClass;

public class Client {
    public static void main(String[] args) {
        OuterClass outerClass1 = new OuterClass("One");
        Readable readable1 = outerClass1.createLocalClassInst(111);
        Readable readable2 = outerClass1.createLocalClassInst(222);
        readable1.read();
        readable2.read();

        Readable readableAn1 = outerClass1.createAnonymousClassInst(111);
        Readable readableAn2 = outerClass1.createAnonymousClassInst(333);
        readableAn1.read();
        readableAn2.read();
    }
}
