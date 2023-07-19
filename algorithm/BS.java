package algorithm;
/*
 * A program to look for a value using binary search algorithm
 * 
 * @author feven mengistu
 * @version July 2023
 */

import java.util.Arrays;

public class BS {

    public static int searchNum(int[] arr, int num) {
         Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            int midNum = arr[mid];
            if (midNum == num) {
                return mid;
            }  if (midNum < num) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BS b = new BS();
 
        int[] ar = {1,2,3,4,5,6};
            System.out.print("Array is ");
        for(int n: ar){
          System.out.print( n + " ");
        }
            System.out.println();
        System.out.println("Index where the number is found is " + searchNum(ar, 3));
    }
}