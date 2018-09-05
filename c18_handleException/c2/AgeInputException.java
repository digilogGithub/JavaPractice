package c18_handleException.c2;

public class AgeInputException extends Exception {
    public AgeInputException() {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}
