package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/single-number/#/description
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * Subscribe to see which companies asked this question.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
//         if (nums.length == 1) {
// 			return nums[0];
// 		}
// 		Arrays.sort(nums);
// 		for (int i = 0; i < nums.length; i += 2) {
// 			if (nums[i] != nums[i + 1]) {
// 				return nums[i];
// 			}
// 		}
// 		return 0;
        /**
         * 任何两个数异或等于零，任何数和零异或等于其本身
         **/
        int s = nums[0];
        for(int i = 1; i < nums.length; i++){
            s = s ^ nums[i];
        }
        return s;
    }
}
