package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum_2 {

    public int[] twoSum(int[] numbers, int target) {
//      int[] index = new int[2];
//      这个方法太TM耗时间了
// 		for(int i = 0; i < numbers.length; i++){
// 			for(int j = i+1; j < numbers.length; j++){
// 				if(numbers[i] + numbers[j] == target){
// 					index[0] = i + 1;
// 					index[1] = j + 1;
// 					break;
// 				}
// 			}
// 		}


// 		return index;

        int[] index = new int[2];
        int index1 = 0;
        int index2 = numbers.length-1;

        while(index1 < index2){
            int sum = numbers[index1] + numbers[index2];

            if(sum < target){
                index1 ++;
            }
            if(sum > target){
                index2 --;
            }

            if(sum == target){
                break;
            }
        }
        index[0] = index1 + 1;
        index[1] = index2 + 1;
        return index;
    }
}
