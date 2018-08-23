package interface_17.InnerClass17_3;

public class Client {
    public static void main(String[] args) {
        NestedClassOne nsOne = new NestedClassOne();
        NestedClassTwo nsTwo = new NestedClassTwo();

        System.out.println("Static");
        NestedClassOne.InnerNestedClassOne diOne = new NestedClassOne.InnerNestedClassOne();
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
