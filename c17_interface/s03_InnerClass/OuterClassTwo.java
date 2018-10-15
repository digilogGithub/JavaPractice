package c17_interface.s03_InnerClass;

public class OuterClassTwo {
    public OuterClassTwo() {
        NestedClassTwo nsTwo = new NestedClassTwo();
        nsTwo.simpleMethod();
    }

    static class NestedClassTwo {
        public void simpleMethod() {
            System.out.println("Nested Class Two");
        }
    }
}
