package c17_interface.s02_markinterface;

public class ClassPrinter {

    static void print(Object obj) {
        String org = obj.toString();
        if (obj instanceof MarkUpperCase) {
            System.out.println(org.toUpperCase());
        } else
            System.out.println(obj);
    }
}
