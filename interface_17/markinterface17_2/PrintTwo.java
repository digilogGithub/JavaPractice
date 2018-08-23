package interface_17.markinterface17_2;

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
