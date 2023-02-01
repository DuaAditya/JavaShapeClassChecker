/*
A PrintableObject class that implements NamedObject and Printable.
 */


public abstract class PrintableObject implements NamedObject, Printable {
    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
