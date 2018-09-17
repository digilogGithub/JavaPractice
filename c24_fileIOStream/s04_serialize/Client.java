package c24_fileIOStream.s04_serialize;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Circle c1 = new Circle("1", "P1", 3, 5, 2.4);
        Circle c2 = new Circle("2", "P2", 3, 5, 2);
        System.out.println("====ORIGIN====");
        c1.showCircleinfo();
        c2.showCircleinfo();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\object.ser"));
        out.writeObject(c1);
        out.writeObject(c2);
        out.writeObject(new String("String implements Serializable"));
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\object.ser"));
        Circle rc1 = (Circle) in.readObject();
        Circle rc2 = (Circle) in.readObject();
        String message = (String) in.readObject();
        in.close();

        System.out.println("====RECALL====");
        rc1.showCircleinfo();
        rc2.showCircleinfo();
        System.out.println(message);

    }
}
