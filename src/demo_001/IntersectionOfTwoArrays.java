package demo_001;

import java.util.*;

/**
 * Created by Damon on 2017/6/16.
 * https://leetcode.com/problems/intersection-of-two-arrays/#/description
 *
 * Given two arrays, write a function to compute their intersection.
 * Example:
 *  Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    /**
     * 求两个数组的交集，如果没有交集，则数组的数组中不含有任何元素
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        /*
         * 定义一个Set集合类，遍历两个数组如果他们有相同的值，则放入集合set里
         * Set集合的特点：Set集合里存放的元素均不同。
         */
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
       int[] ret = new int[set.size()];
        int k = 0;
        for(int s : set){
            ret[k++] = s;
        }
        return ret;
    }
}
