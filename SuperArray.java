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

    public int size() {
        return size;
    }

    public boolean add(String element) {
        data[size++] = element;
        return true;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder output = new StringBuilder().append('[');
        output.append(data[0]);
        for (int i = 1; i < size; i++) {
            output.append(", ").append(data[i]);
        }
        return output.append(']').toString();
    }

}
