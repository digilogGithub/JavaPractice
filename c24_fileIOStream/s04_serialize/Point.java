package c24_fileIOStream.s04_serialize;

import java.io.Serializable;

class Point implements Serializable {
    transient String name;
    int x, y;

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
