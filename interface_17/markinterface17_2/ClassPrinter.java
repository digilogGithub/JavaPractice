package interface_17.markinterface17_2;

public class ClassPrinter {

    static void print(Object obj) {
        String org = obj.toString();
        if (obj instanceof MarkUpperCase) {
            System.out.println(org.toUpperCase());
        } else
            System.out.println(obj);
    }
}
