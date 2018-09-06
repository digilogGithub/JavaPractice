package c18_handleException.s02_ProgrammerDefineException;

class Client {

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

