package c17_interface.s02_markinterface;

public class PrintTwo {
    String contents;

    public PrintTwo(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "PrintTwo { contents='" + contents + '\'' + '}';
    }
}
