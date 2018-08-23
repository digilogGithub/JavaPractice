package interface_17.InnerClass17_3;

public class NestedClassTwo {
    public NestedClassTwo() {
        InnerNestedClassTwo nsTwo = new InnerNestedClassTwo();
        nsTwo.simpleMethod();
    }

    static class InnerNestedClassTwo {
        public void simpleMethod() {
            System.out.println("Nested Class Two");
        }
    }
}
