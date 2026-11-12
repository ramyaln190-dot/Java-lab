interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class MultipleInheritanceDemo
        implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing information.");
    }

    @Override
    public void show() {
        System.out.println("Showing information.");
    }

    public static void main(String[] args) {

        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();

        obj.print();
        obj.show();
    }
}
