package memoryObject_19.deepCopy;

public class Client {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle) org.clone();
            org.changePos(2, 2, 7, 7);
            System.out.println("ORG");
            org.showPosition();
            System.out.println("CLONE");
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
