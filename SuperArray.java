public class SuperArray {

    private String[] data;
    private int size;

    public SuperArray(int capacity) {
        data = new String[capacity];
        size = 0;
    }

    public SuperArray() {
        this(8);
    }

}
