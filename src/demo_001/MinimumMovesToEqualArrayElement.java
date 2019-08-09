package demo_001;

import java.util.Arrays;

/**
 * Created by Damon on 2017/6/16.
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/description
 *
 *Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 *
 */
public class MinimumMovesToEqualArrayElement {
    public int minMoves(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        if(isQuale(nums)){
            return 0;
        }
        return nums[n - 1] - nums[0];
    }

    public boolean isQuale(int[] nums){
        int k = 0;
        int n = nums.length;
        while(k < n){
            if(nums[k] == nums[k+1]){
                return true;
            }
            k++;
        }
        return false;
    }

}
