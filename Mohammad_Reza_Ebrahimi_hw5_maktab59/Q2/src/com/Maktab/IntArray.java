package com.Maktab;

public class IntArray {
    private int[] array;
    private int count = 0;

    public IntArray() {
        array = new int[1];
    }

    public IntArray(int number) {
        array = new int[number];
    }

    public IntArray(int[] array) {
        this.array = array;
        count = array.length;
    }

    public void add(int item) {
        resize();
        array[count++] = item;
    }

    public void addAt(int item, int index) {
        if (index < 0 || index > count)
            System.out.println("Wrong Input!!");
        resize();
        if (count - index >= 0) System.arraycopy(array, index, array, index + 1, count - index);
        array[index] = item;
        count++;
    }

    private void resize() {
        if (array.length == count) {
            int[] newArray = new int[count + 1];
            System.arraycopy(array, 0, newArray, 0, count);
            array = newArray;
        }
    }

    private void smaller() {
        int[] newArray = new int[count - 1];
        System.arraycopy(array, 0, newArray, 0, count - 1);
        array = newArray;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            System.out.println("Wrong Input!!");
        if (count - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, count - 1 - index);
        smaller();
        count--;
    }

    public void remove(int value) {
        for (int i = 0; i < count; i++)
            if (array[i] == value) {
                removeAt(i);
                i--;
            }
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (array[i] == item)
                return i;
        return -1;
    }

    public int lastIndexOf(int item) {
        for (int i = count - 1; i >= 0; i--)
            if (array[i] == item)
                return i;
        return -1;
    }

    public boolean contains(int item) {
        for (int i = 0; i < count; i++)
            if (array[i] == item)
                return true;
        return false;
    }

    public int[] getSortedArrayLowToHigh() {
        int[] temp = array;
        int tempInt;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (temp[i] > temp[j]) {
                    tempInt = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tempInt;
                }
            }
        }
        return temp;
    }

    public int[] getSortedArrayHighToLow() {
        int[] temp = array;
        int tempInt;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (temp[i] < temp[j]) {
                    tempInt = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tempInt;
                }
            }
        }
        return temp;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println("item " + (i + 1) + " : " + array[i]);
    }
}
