package integer;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList{
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int length = DEFAULT_CAPACITY;

    private Integer[] integerArrayList;

    public IntegerListImpl(){
        this.integerArrayList = new Integer[DEFAULT_CAPACITY];
    }



    private void growArray(){
        Integer[] newArray = new Integer[DEFAULT_CAPACITY * 3 / 2];
        newArray = Arrays.copyOf(integerArrayList, DEFAULT_CAPACITY * 3 / 2);
        integerArrayList = newArray;
    }


    @Override
    public Integer add(Integer item) {
        if (integerArrayList.length == size){
            growArray();
        }
        integerArrayList[size++] = item;
        return item;
    }

    @Override
    public Integer add (int index, Integer item) {
        if (length == size){
            growArray();
        }
        System.arraycopy(integerArrayList, index, integerArrayList, index + 1, size - index);
        integerArrayList[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        if (index == index) {
            integerArrayList[index] = item;
            return integerArrayList[index];
        }
        return item;
    }

    @Override
    public Integer remove(Integer item) {
        for (int i = 0; i < integerArrayList.length; i++) {
            if (integerArrayList[i].equals(item)) {
                System.arraycopy(integerArrayList,i, integerArrayList, i -1, size - i + 1);
                size--;
                return integerArrayList[i];
            }
        }
        return item;
    }

    @Override
    public Integer remove(int index) {
        System.arraycopy(integerArrayList,index, integerArrayList, index -1, size - index + 1);
        size--;
        return integerArrayList[index];
    }

    @Override
    public boolean contains(Integer item) {

        quickSort(integerArrayList, integerArrayList[0], integerArrayList[size]);

        int min = 0;
        int max = integerArrayList.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == integerArrayList[mid]) {
                return true;
            }
            if (item < integerArrayList[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
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

    public static void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                swapElements(arr, i, j);
            }
        }

        swapElements(arr, i + 1, end);
        return i + 1;
    }

    private static void swapElements(Integer[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    @Override
    public String toString() {
        return Arrays.toString(integerArrayList);
    }
}
