package algorithms;

import java.util.Arrays;
import java.util.Random;

public class MyBinarySearch {

    public static void main(String[] args) {
        int a[] = new int[100];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int num =  4;
        System.out.println("index -> " + binarySearch(a, num));
    }


    static int binarySearch(int[] array, int key)
    {
        int lo = 0;
        int hi = array.length;

        while (true)
        {
            int mid = lo + (hi - lo) / 2;

            if (array[mid] == key){
                System.out.println("start index " + lo + "  end  index" + hi);
                return mid;
            }

            if(lo > hi) { //дошли до конца
                System.out.print("Число не найдено. Возможный индекс числа ");
                return mid-1;
            }

            if (array[mid] > key){
                System.out.println("start index " + lo + "  end  index" + hi);
                hi = mid - 1;
            }
            else {
                System.out.println("start index " + lo + "  end  index" + hi);
                lo = mid + 1;
            }
        }
    }
}