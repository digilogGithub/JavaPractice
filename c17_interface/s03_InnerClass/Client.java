package c17_interface.s03_InnerClass;

public class Client {
    public static void main(String[] args) {
        OuterClassOne nsOne = new OuterClassOne();
        OuterClassTwo nsTwo = new OuterClassTwo();

        System.out.println("Static");
        OuterClassOne.NestedClassOne diOne = new OuterClassOne.NestedClassOne();
        diOne.simpleMethod();

        System.out.println("----------------");
        System.out.println("InnerClass");
        OuterClass one = new OuterClass("one", 1);
        OuterClass two = new OuterClass("two", 2);

        one.whoAreYou();
        two.whoAreYou();

        OuterClass.InnerClass inOne = one.new InnerClass();
        OuterClass.InnerClass inTwo = one.new InnerClass();
        OuterClass.InnerClass inThree = one.new InnerClass();
    }
}
