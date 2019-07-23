package cashregister;

public class FakePrinter extends Printer {
    private String out;
    private  String text;
    @Override
    public void print(String out) {
        this.out=out;
    }

    public void setText(String text) {
        this.text = text;
    }
    public boolean printMethodWasCall() {
    return false;
    }
}
