package c17_interface.markinterface17_2;

public class Client {
    public static void main(String[] args) {
        String message = "I am a messenger...";

        PrintOne printOne = new PrintOne(message);
        PrintTwo printTwo = new PrintTwo(message);

        ClassPrinter.print(printOne);
        ClassPrinter.print(printTwo);
    }
}
