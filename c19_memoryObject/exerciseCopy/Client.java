package c19_memoryObject.exerciseCopy;

public class Client {

    public static void main(String[] args) {
        try {
            PersonInfo personInfo = new PersonInfo("James", 22, "HiMedia", "encoding");
            PersonInfo pClone = personInfo.clone();
            pClone.changeWork("decoding");

            personInfo.showPersonInfo();
            pClone.showPersonInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
