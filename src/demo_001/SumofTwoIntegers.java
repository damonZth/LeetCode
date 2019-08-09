package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/sum-of-two-integers/#/description
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 * Credits:
 * Special thanks to @fujiaozhu for adding this problem and creating all test cases.
 * Subscribe to see which companies asked this question.
 */
public class SumofTwoIntegers {

    public int getSum(int a, int b) {
        //不运用+、- ，计算两个数的和
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }

        while(b != 0){
            int temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }

        return a;
    }
}
