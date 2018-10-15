package c17_interface.s03_InnerClass;

public class OuterClassOne {
    public OuterClassOne() {
        NestedClassOne nst = new NestedClassOne();
        nst.simpleMethod();
    }

    static class NestedClassOne {
        public void simpleMethod() {
            System.out.println("Nested Class One");
        }
    }
}
