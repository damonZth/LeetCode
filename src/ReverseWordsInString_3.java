/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description
 *
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsInString_3 {
    public String reverseWords(String s) {
        //1、先将一句话通过空格切割为单个单词
        //2、反转每个单词
        String newStr = "";
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i ++){
            char[] c = strArr[i].toCharArray();
            char[] c1 = new char[c.length];
            int x = c.length;
            for(int j = 0; j < c.length;j++){
                c1[j] = c[--x];
            }
            strArr[i] = String.valueOf(c1);
        }

        for(int i = 0; i < strArr.length; i++){
            if(i != strArr.length-1){
                newStr += strArr[i] + " ";
            }else{
                //这里要注意一个末尾是没有空格符。
                newStr += strArr[i];
            }
        }
        return newStr;
    }
}
