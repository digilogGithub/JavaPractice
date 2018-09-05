package c24_fileIOStream.serializableInstMember_04;

import java.io.Serializable;

class Circle implements Serializable {
    transient String name;
    double rad;
    Point p;

    public Circle(String name, String pName, int x, int y, double rad) {
        this.name = name;
        this.rad = rad;
        p = new Point(pName, x, y);
    }

    void showCircleinfo() {
        System.out.println("Point : " + p.name + "  // Circle : " + name);
        System.out.printf("[%d, %d]\n", p.x, p.y);
        System.out.println("rad : " + rad);
    }
}
