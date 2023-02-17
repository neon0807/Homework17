import string.StringListImpl;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringListImpl a = new StringListImpl();
        a.add("aaaaaaa1");
        a.add("aaaaaaa2");
        a.add("aaaaaaa3");
        a.add("aaaaaaa4");
        a.add("aaaaaaa5");
        a.add("aaaaaaa6");
        a.add("aaaaaaa7");
        a.add("aaaaaaa8");
        a.add("aaaaaaa9");
        a.add("aaaaaaa10");
        a.add("aaaaaaa11");
        a.add("aaaaaaa12");


        System.out.println(a);

        a.remove("aaaaaaa5");

        System.out.println(a);



//        int n = 100000;
//        int[] array = new int[n];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
//        int[] array1 = Arrays.copyOf(array,n);
//        int[] array2 = Arrays.copyOf(array,n);
//
//        long start = System.currentTimeMillis();
//        bubbleSort(array);
//        System.out.println(System.currentTimeMillis() - start);
//
//        long start1 = System.currentTimeMillis();
//        insertionSort(array1);
//        System.out.println(System.currentTimeMillis() - start1);
//
//        long start2 = System.currentTimeMillis();
//        selectionSort(array2);
//        System.out.println(System.currentTimeMillis() - start2);
//    }
//
//    public static void bubbleSort(int[] sortArr) {
//        for (int i = 0; i < sortArr.length - 1; i++) {
//            for(int j = 0; j < sortArr.length - i - 1; j++) {
//                if(sortArr[j + 1] < sortArr[j]) {
//                    int swap = sortArr[j];
//                    sortArr[j] = sortArr[j + 1];
//                    sortArr[j + 1] = swap;
//                }
//            }
//        }
//    }
//
//    public static void insertionSort(int[] sortArr) {
//        int j;
//        for (int i = 1; i < sortArr.length; i++) {
//            int swap = sortArr[i];
//            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
//                sortArr[j] = sortArr[j - 1];
//            }
//            sortArr[j] = swap;
//        }
//    }
//
//    public static void selectionSort(int[] sortArr) {
//        for (int i = 0; i < sortArr.length; i++) {
//            int pos = i;
//            int min = sortArr[i];
//            for (int j = i + 1; j < sortArr.length; j++) {
//                if (sortArr[j] < min) {
//                    pos = j;
//                    min = sortArr[j];
//                }
//            }
//            sortArr[pos] = sortArr[i];
//            sortArr[i] = min;
//        }
    }


}