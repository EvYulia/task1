import java.util.Arrays;
public class number2 {
    public String[] array;
    public int size;

    public number2() {
        array = new String[10];
        size = 0;
    }
    private void expendMas() {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
    }
    public void add(String el) {
        expendMas();
        int index = size;
        for (int i = 0; i < size; i++) {
            if (el.length() < array[i].length()) {
                index = i;
                break;
            }
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = el;
        size++;
    }

    public String getMax() {
        if (size == 0) {
            throw new IllegalStateException("mas is empty");
        }
        return array[size - 1];
    }

    public double getAverageLength() {
        if (size == 0) {
            throw new IllegalStateException("array is empty");
        }
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += array[i].length();
        }
        return (double) totalLength / size;
    }
}