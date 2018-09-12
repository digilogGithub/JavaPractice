package c19_memoryObject.s02_ObjectClass;

public class Point implements Cloneable {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void showPosition() {
        System.out.println("[" + xPos + ", " + yPos + "]");
    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
