package exercise;

public class Client {
    public static void main(String[] args) {
        AgeInputController aic = new AgeInputController();
        try {
            int age = aic.readAge();
            System.out.println("당신의 나이는 " + age + " 입니다");
        } catch (AgeInputException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end of program");

    }
}
