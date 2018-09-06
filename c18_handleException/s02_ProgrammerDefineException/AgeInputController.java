package c18_handleException.s02_ProgrammerDefineException;

import java.util.Scanner;

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
