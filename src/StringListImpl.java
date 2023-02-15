import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class StringListImpl implements StringList {
    private int size = 10;

    private String[] stringArrayList = new String[size];




    @Override
    public String add(String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] == null) {
                stringArrayList[i] = item;
                return stringArrayList[i];
            }
        }
        return null;
    }

    @Override
    public String add(int index, String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (i == index) {
                stringArrayList[i] = item;
                return stringArrayList[i];
            }
        }
        return null;
    }

    @Override
    public String set(int index, String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (i == index) {
                stringArrayList[i] = item;
                return stringArrayList[i];
            }
        }
        return null;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i].equals(item)) {
                stringArrayList[i] = null;
                return stringArrayList[i];
            }
        }
        return null;
    }

    @Override
    public String remove(int index) {
        for (int i = 0; i < stringArrayList.length; i++) {
            if (i == index) {
                stringArrayList[i] = null;
                return stringArrayList[i];
            }
        }
        return null;
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
