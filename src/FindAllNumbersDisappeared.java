import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/#/description
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindAllNumbersDisappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //空间标记法
        List<Integer> res = new ArrayList<Integer>();
        if(nums == null || nums.length == 0){
            return res;
        }
        int n = nums.length;
// 		int[] num = new int[n];
// 		Arrays.fill(num, -1);
// 		for(int i = 0; i < n; i++){
// 			num[nums[i] - 1] = nums[i];
// 		}
// 		for(int i = 0; i < n; i++){
// 			if(num[i] == -1){
// 				res.add(i + 1);
// 			}
// 		}

		/*------------------------------*/
        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = - nums[val];
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}
