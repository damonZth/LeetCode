import java.util.Arrays;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/wiggle-sort-ii/#/description
 *
 * Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
 * Example:
 * (1) Given nums = [1, 5, 1, 1, 6, 4], one possible answer is [1, 4, 1, 5, 1, 6].
 * (2) Given nums = [1, 3, 2, 2, 3, 1], one possible answer is [2, 3, 1, 3, 1, 2].
 * Note:
 * You may assume all input has valid answer.
 * Follow Up:
 * Can you do it in O(n) time and/or in-place with O(1) extra space?
 */
public class WiggleSort_2 {
    public void wiggleSort(int[] nums) {
        //摇摆排序
        /**
         * 注意到在摇摆数组中，index为偶数位置的元素要比它前后元素小，
         * 而index为奇数位置的元素要比它前后元素大
         * 经过分析，我们首先想到的是经过排序，按照从大到小排列，然后经过观察重拍列之后的数组特征，
         * 我们发现，偶数位上的数字往往是要比它周围的两个奇数位上的数字大，
         * 故可以依次将按从小到大排列之后的数组从末尾大的元素添加在原来数组的偶数位置，直到偶数位的数字被填充完为止，
         * 然后再依次将末尾的元素添加在原来数组的奇数位置。这样就能确保偶数位置一定会比周围的奇数位置大，也就满足了题目的要求。
         *
         **/
        int[] newNums = new int[nums.length];
        int length = nums.length;
        if(nums == null || length < 2)
            return;
        for(int i = 0; i < length; i++)
            newNums[i] = nums[i];
        Arrays.sort(nums);  //排序
        if(length == 2)
            return;
        int k = length - 1;
        for(int i = 1; i < length; i = i + 2)
        {
            newNums[i] = nums[k];
            k = k - 1;
        }
        for(int j = 0; j < length; j = j + 2)
        {
            newNums[j] = nums[k];
            k = k - 1;
        }
        for(int i = 0; i < length; i++)
        {
            nums[i] = newNums[i];
        }
    }
}
