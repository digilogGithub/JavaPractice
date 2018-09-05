package c17_interface.InnerClass17_3;

public class NestedClassOne {
    public NestedClassOne() {
        InnerNestedClassOne nsOne = new InnerNestedClassOne();
        nsOne.simpleMethod();
    }

    static class InnerNestedClassOne {
        public void simpleMethod() {
            System.out.println("Nested Class One");
        }
    }
}
