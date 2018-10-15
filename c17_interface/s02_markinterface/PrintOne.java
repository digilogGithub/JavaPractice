package c17_interface.s02_markinterface;

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
