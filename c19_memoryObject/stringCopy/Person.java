package c19_memoryObject.stringCopy;

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void showPersonInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println();
    }

    public Object clone() throws CloneNotSupportedException {
        Person cpy = (Person) super.clone();
//        cpy.name = new String(name); // 프로그래머가 삽입하지 않는 문장...String은 String class의 특성을 생각해보면  DeepCopy를 하지 않아도 됨...
        return cpy;
    }
}
