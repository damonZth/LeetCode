/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/range-addition-ii/#/description
 *
 * Given an m * n matrix M initialized with all 0's and several update operations.
 * Operations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b,
 * which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 * You need to count and return the number of maximum integers in the matrix after performing all the operations.
 *
 * Note:
 * The range of m and n is [1,40000].
 * The range of a is [1,m], and the range of b is [1,n].
 * The range of operations size won't exceed 10,000.
 */
public class RangeAddition_2 {

    public int maxCount(int m, int n, int[][] ops) {
        //这道题，还没怎么看懂。。
        int min_a = Integer.MAX_VALUE;
        int min_b = Integer.MAX_VALUE;
        for (int[] temp : ops) {
            if (temp[0] < min_a)
                min_a = temp[0];
            if (temp[1] < min_b)
                min_b = temp[1];
        }
        return min_a != Integer.MAX_VALUE && min_b != Integer.MAX_VALUE ? min_a * min_b : m * n;
    }
}
