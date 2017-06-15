/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/find-the-difference/#/description
 *
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Find the letter that was added in t.
 * Example:
 * Input:
 * s = "abcd"
 * t = "abcde"
 * Output:
 * e
 * Explanation:
 * 'e' is the letter that was added.
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        //绝了。。。这方法
        int e = 0;
        s += t;
        char d = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            d ^= c[i];
        }
        return d;
    }
}
