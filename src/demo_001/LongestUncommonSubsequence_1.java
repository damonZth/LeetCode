package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/#/description
 *
 * Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings.
 * he longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.
 * A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements.
 * Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.
 * The input will be two strings, and the output needs to be the length of the longest uncommon subsequence.
 * If the longest uncommon subsequence doesn't exist, return -1.
 *
 * Note:
 * Both strings' lengths will not exceed 100.
 * Only letters from a ~ z will appear in input strings.
 */
public class LongestUncommonSubsequence_1 {
    public int findLUSlength(String a, String b) {
        /**
         * 寻找最长不同子序列
         * 如果两个字符串存在不同，那么最长的字符串就是最长的不同子序列。
         **/
        if(a.equals(b)){
            return -1;
        }else{
            return a.length() > b.length() ? a.length() : b.length();
        }
    }
}
