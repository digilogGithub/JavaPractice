package interface_17.markinterface17_2;

public class PrintOne implements MarkUpperCase {
    String contents;

    public PrintOne(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "PrintOne {contents='" + contents + '\'' + '}';
    }
}
