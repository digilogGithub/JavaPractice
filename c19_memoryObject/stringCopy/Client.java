package c19_memoryObject.stringCopy;

public class Client {
    public static void main(String[] args) {

        try {
            Person p1 = new Person("이승원", 22);
            Person p2 = (Person) p1.clone();
            p2.changeName("정혜영");

            Person p3 = (Person) p2.clone();
            p3.changeName("정승주");

            p1.showPersonInfo();
            p2.showPersonInfo();
            p3.showPersonInfo();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
