package algorithms;

import java.util.Arrays;

class ArrayBubble {


    public static void main(String[] args) {

        int[] arr = new int[]{35, 33, 76, 22, 88, 1, 39, 4, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] < array[j]){
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void swap(){

    }
}
