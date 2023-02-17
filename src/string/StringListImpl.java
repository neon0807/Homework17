package string;

import string.StringList;

import java.util.Arrays;

public class StringListImpl implements StringList {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int length = DEFAULT_CAPACITY;

    private String[] stringArrayList;

    public StringListImpl(){
        this.stringArrayList = new String[DEFAULT_CAPACITY];
    }



    private void growArray(){
        String[] newArray = new String[DEFAULT_CAPACITY * 3 / 2];
        newArray = Arrays.copyOf(stringArrayList, DEFAULT_CAPACITY *3 / 2);
        stringArrayList = newArray;
    }

    @Override
    public String add(String item) {
        if (stringArrayList.length == size){
            growArray();
        }
        stringArrayList[size++] = item;
        return null;
    }

    @Override
    public String add(int index, String item) {
        if (length == size){
            growArray();
        }
        System.arraycopy(stringArrayList, index, stringArrayList, index + 1, size - index);
        stringArrayList[index] = item;
        size++;
        return null;
    }

    @Override
    public String set(int index, String item) {
        if (index == index) {
            stringArrayList[index] = item;
            return stringArrayList[index];
        }
        return item;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i].equals(item)) {
                System.arraycopy(stringArrayList,i, stringArrayList, i -1, size - i + 1);
                size--;
                return stringArrayList[i];
            }
        }
        return null;
    }

    @Override
    public String remove(int index) {
        System.arraycopy(stringArrayList,index, stringArrayList, index -1, size - index + 1);
        size--;
        return stringArrayList[index];
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] != null && stringArrayList[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(String item) {
        int index = 0;
        for (int i = stringArrayList.length - 1; i >= 0; i--) {
            if (stringArrayList[i] == null) {
                index = -1;
            } else if (stringArrayList[i].equals(item)) {
                return i;
            }
        }
        return index;
    }

    @Override
    public String get(int index) {
        if (stringArrayList[index] != null) {
            return stringArrayList[index];
        }
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        if (stringArrayList.equals(otherList)) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] != null){
                stringArrayList = null;
            }
        }
    }

    @Override
    public String[] toArray() {
        int size = 0;
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] != null) {
                size++;
            }
        }
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = stringArrayList[i];
        }
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(stringArrayList);
    }
}
