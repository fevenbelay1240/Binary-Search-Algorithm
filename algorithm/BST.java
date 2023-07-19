package algorithm;
/*
 * A program to look for a value using binary search algorithm
 * 
 * @author feven mengistu
 * @version July 2023
 */

import java.util.Arrays;

public class BST {

    // first the list/array needs to be sorted
    /*
     * a method to sort the array first in order from smallest to largest
     * 
     * @param original array to be sorted
     */
    public void sortedArr(int[] arr) {    
        Arrays.sort(arr);
        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 8, 4, 6, 9, 3, 7 };
        BST b = new BST();
        b.sortedArr(nums);
       
    }
}