/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/move-zeroes/#/description
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count ++;
            }
        }
        while(count != 0){
            for(int i = 0; i < n-1; i++){
                if(nums[i] == 0 && i+1 < n){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            count --;
        }
    }
}
