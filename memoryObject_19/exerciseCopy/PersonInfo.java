package memoryObject_19.exerciseCopy;

public class PersonInfo implements Cloneable {
    private String name;
    private int age;
    private Business business;

    public PersonInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        business = new Business(company, work);
    }

    public void showPersonInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        business.showBusinessInfo();
        System.out.println();
    }

    public void changeWork(String work) {
        business.changeWork(work);
    }

    public PersonInfo clone() throws CloneNotSupportedException {
        PersonInfo clone = (PersonInfo) super.clone();
        clone.business = (Business) business.clone();
        return clone;
    }

}
