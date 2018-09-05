package c17_interface.LocalAnonymousClass;

public class OuterClass {
    private String name;

    public OuterClass(String name) {
        this.name = name;
    }

    public Readable createLocalClassInst(int instID) {
        class LocalClass implements Readable {
            @Override
            public void read() {
                System.out.println("Outer Class name :" + name);
                System.out.println("Local instance ID : " + instID);
            }
        }
        return new LocalClass();
    }

    public Readable createAnonymousClassInst(int instID) {
        return new Readable() {
            public void read() {
                System.out.println("Outer Class name :" + name);
                System.out.println("Local(Anonymous) instance ID : " + instID);
            }
        };

    }


}
