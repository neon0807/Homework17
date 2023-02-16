package integer;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList{
    private int size = 0;
    private int length = 10;
    private Integer[] integerArrayList = new Integer[length];



    private void growArray(){
        Integer[] newArray = new Integer[length +10];
        newArray = Arrays.copyOf(integerArrayList, length +10);
        integerArrayList = newArray;
    }


    @Override
    public Integer add(Integer item) {
        return null;
    }

    @Override
    public Integer add(int index, Integer item) {
        if (integerArrayList.length == size){
            growArray();
        }
        for (int i = 0; i < integerArrayList.length; i++) {
            if (i == index) {
                integerArrayList[i] = item;
                return integerArrayList[i];
            }
        }
        return null;
    }

    @Override
    public Integer set(int index, Integer item) {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (i == index) {
                integerArrayList[i] = item;
                return integerArrayList[i];
            }
        }
        return null;
    }

    @Override
    public Integer remove(Integer item) {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i].equals(item)) {
                integerArrayList[i] = null;
                return integerArrayList[i];
            }
        }
        return null;
    }

    @Override
    public Integer remove(int index) {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (i == index) {
                integerArrayList[i] = null;
                return integerArrayList[i];
            }
        }
        return null;
    }

    @Override
    public boolean contains(Integer item) {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i] == (item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i] != null && integerArrayList[i] == (item)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Integer item) {
        int index = 0;
        for (int i = integerArrayList.length - 1; i >= 0; i--) {
            if (integerArrayList[i] == null) {
                index = -1;
            } else if (integerArrayList[i].equals(item)) {
                return i;
            }
        }
        return index;
    }

    @Override
    public Integer get(int index) {
        if (integerArrayList[index] != null) {
            return integerArrayList[index];
        }
        return null;
    }

    @Override
    public boolean equals(IntegerList otherList) {
        if (integerArrayList.equals(otherList)) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i] != null){
                integerArrayList = null;
            }
        }
    }

    @Override
    public Integer[] toArray() {
        int size = 0;
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i] != null) {
                size++;
            }
        }
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = integerArrayList[i];
        }
        return arr;

    }


    public Integer[] sort(Integer[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        return sortArr;
    }


}
