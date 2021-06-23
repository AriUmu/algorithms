package algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        //int arr[] = {12, 34, 54, 2, 5, 7, 33, 13, 41, 52, 76, 11, 10, 9};
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        //System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int lo, int hi) {
        int index = partition(arr, lo, hi); //находим место выбранного элемената
        if (lo < index - 1) {
            System.out.println("yes");
            quickSort(arr, lo, index - 1);
        }
        if (index < hi) {
            System.out.println("no");
            quickSort(arr, index, hi);
        }
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi;
        int tmp;
        System.out.println(lo + " <- lo " + hi + " <- hi");
        int pivot = arr[((lo + hi) / 2)]; //серединый элемент
        System.out.println(pivot + " pivot");
        while (i <= j) { //пока не сошлись на середине
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i]; //просто меняем местами
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(i + " index  and this is " + arr[i]);
        return i;
    }
}