import java.util.Arrays;

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
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
        return true;
    }

    public void add(int index, String element) {
        if (size == data.length) {
            resize();
        }
        for (int i = size++; i > index; i--) {  // shifts from index to the right
            data[i] = data[i-1];
        }
        data[index] = element;
    }

    public String get(int index) {
        return data[index];
    }

    public String set(int index, String element) {
        String replaced = data[index];
        data[index] = element;
        return replaced;
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
        /* version without using Arrays:
        String[] newData = new String[data.length * 2];
        for (int i = 0; i < size; i++) {  // size == data.length, doesn't matter
            newData[i] = data[i];
        }
        data = newData;
        */
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
