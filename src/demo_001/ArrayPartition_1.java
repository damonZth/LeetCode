package demo_001;

import java.util.Arrays;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/array-partition-i/#/description
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */
public class ArrayPartition_1 {
    public int arrayPairSum(int[] nums) {
        /**
         *数组中，取两个数形成（ai，bi）对，由（ai，bi）取最小值，使得该值尽可能大
         * 思路：尽可能去数组中较大的值。先对数组进行排序，然后依次取两个数形成一对。
         **/
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);//对数组进行排序
        /**
         * 排好序的数组中，每两个数中，偶数位的元素值较小，则可以直接选取数组偶数位的元素求和
         **/
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                sum += nums[i];
            }
        }
        return sum;

    }

    public int min(int a,int b){
        return (a > b) ? b : a;
    }

}
