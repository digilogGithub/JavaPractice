package c18_handleException.c2;

import java.util.Scanner;

class ProgrammerDefineException {

    public static void main(String[] args) {

        AgeInputController aic = new AgeInputController();
        System.out.print("나이를 입력 하세요 : ");

        try {
            int age = aic.readAge();
            System.out.println("당신의 나이는 " + age + " 입니다.");
        } catch (AgeInputException e) {
            System.out.println(e.getMessage());
        }
    }
}

class AgeInputController {
    int readAge() throws AgeInputException {
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();
        if (age < 0) {
//            AgeInputException exception = new AgeInputException();
//            throw exception;
            throw new AgeInputException();
        }
        return age;
    }
}
