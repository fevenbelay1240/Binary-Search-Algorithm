package algorithm;
/*
 * A program to look for a value using binary search algorithm
 * 
 * @author feven mengistu
 * @version July 2023
 */

import java.util.Arrays;

public class BS {

    public int searchNum(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            int midNum = arr[mid];
            if (midNum == num) {
                return mid;
            } else if (midNum < num) {
                right = mid - 1;

            } else if (midNum > num) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 8, 4, 6, 9, 3, 7 };
        BS b = new BS();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println(b.searchNum(nums, 3));
    }
}