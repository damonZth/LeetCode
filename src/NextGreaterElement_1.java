/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/next-greater-element-i/#/description
 *
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * if it does not exist, output -1 for this number.
 *
 * Note:
 * All elements in nums1 and nums2 are unique.
 * The length of both nums1 and nums2 would not exceed 1000.
 */
public class NextGreaterElement_1 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        /**
         * 分析题意：？？？
         **/
        int[] retNums = new int[findNums.length];

        for(int i = 0; i < findNums.length; i++){
            boolean flag = false;
            for(int j = 0; j < nums.length; j++){
                if(findNums[i] == nums[j]){
                    flag = true;
                }
                if(flag && nums[j] > findNums[i]){
                    retNums[i] = nums[j];
                    flag = false;
                    break;
                }
            }
            if(flag){
                retNums[i] = -1;
            }
        }
        return retNums;
    }
}
