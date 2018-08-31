package exercise;

import java.util.Scanner;

public class AgeInputController {
    Scanner kb;
    int age;

    public AgeInputController() {
        kb = new Scanner(System.in);
        age = 0;
    }

    int readAge() throws AgeInputException {
        System.out.print("나이를 입력하세요 : ");
        age = kb.nextInt();
        if (age < 0)
            throw new AgeInputException();
        return age;
    }
}
