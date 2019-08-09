package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/max-consecutive-ones/#/description
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        //找出数组中连续1的最大数
//      int m = 0;
// 		int max = 0;
// 		for(int i = 0; i < nums.length; i++){
// 			if(nums[i] == 1){
// 				m++;
// 				max = Math.max(max, m);
// 			}else{
// 				m = 0;
// 			}
// 		}
// 		return max;
        /**
         * 题目是要找出数组中，数组元素连续为1的最大个数
         * 首先遍历数组，如果数组元素为1则count加1，否则将上一次计算出来的连续为1的个数赋给最大值max，
         * 并将coung置为0，继续检查
         **/
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count ++;
            }else{
                max = max > count ? max : count;
                count = 0;
            }
        }
        return max > count ? max : count;
    }
}
