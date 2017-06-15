/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/longest-palindromic-substring/#/description
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {

        char[] strArr = s.toCharArray();
        int n = strArr.length;
        if(n <= 1){
            return s;
        }
        int longestBegin = 0;
        //int maxLen = 0;
        int longestEnd = 0;
        //定义一个二维数组，table[i][j],用来标识Si...Sj是否为回文
        //初始条件table[i][i] = true; table[i][i+1] = (Si == Si+1)
        boolean[][] table = new boolean[n][n];//记录i到j之间是不是回文

        for(int i = 0; i < n; i++){
            table[i][i] = true;//每个字符本身都是回文
        }

        //检查字符长度为2的子串是否为回文
        for(int i = 0; i < n-1; i++){
            //如果相邻的两个字符相同，那么这两个字符肯定是回文
            if(strArr[i] == strArr[i+1]){
                table[i][i+1] = true;
                longestBegin = i;
                longestEnd = i+2;
            }
        }
        //遍历检查字符长度大于等于3的子串是否为回文，这里使用的动态规划的思想
        for(int len = 3; len <= n; len++){
            //动态规划法实现是否为回文，即i+1，j-1之间为回文之后再判断该回文串俩边的元素是否相等，
            //如果相等，则回文串i，j之间也是回文
            for(int i = 0; i < n-len+1; i++){
                int j = i + len - 1;//i位子串的前一位，j为子串的后一位，对这两个位置的元素进行判断
                if(strArr[i] == strArr[j] && table[i+1][j-1]){
                    table[i][j] = true;
                    longestBegin = i;
                    longestEnd = longestBegin + len ;
                }
            }
        }
        //System.out.println(longestBegin);

        //System.out.println(maxLen);
        if(longestBegin == longestEnd){
            return getSubString(s,longestBegin,longestEnd+1);
        }
        return getSubString(s,longestBegin,longestEnd);
    }
    /*
	 * 输入一个字符串，和两个整数a，b，
	 * 返回该字符串从第a位到第b位的一个子串
	 */
    public static String getSubString(String str, int a, int b){
        return str.substring(a, b);
    }
}
