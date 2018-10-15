package c17_interface.s02_interface.personstorage;

public class Person {
    String name;
    String perNum;

    public Person(String name, String perNum) {
        this.name = name;
        this.perNum = perNum;
    }

    public String getName() {
        return name;
    }

    public String getPerNum() {
        return perNum;
    }
}
