package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/reverse-string/#/description
 *
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 * Subscribe to see which companies asked this question.
 */
public class ReverseString {
    public String reverseString(String s) {
        if(s == null || s.length() <= 1)
            return s;

        //使用String的toCharArray()可以将字符串变成字符数组
        char[] c = s.toCharArray();
        int n = c.length;
        char[] temp = new char[c.length];
        for(int i = 0; i < c.length; i++){
            temp[i] = c[--n];
        }
        //使用String的valueOf()方法可以将char字符数组变成字符串
        String retStr = String.valueOf(temp);
        return retStr;
    }

    public String reverseString_1(String s) {
        if(s == null || s.length() <= 1) return s;
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length-1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        return new String(arr);
    }

    void swap(char[] arr, int i , int j){
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
