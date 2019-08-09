package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/detect-capital/#/description
 *
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 *
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        /**
         * 字符串判断：
         * 1、字符串第一个字母为大写，且其他的字母都是小写，返回true
         * 2、字符串第一个字母为大写，且其他的字母都是大写，返回true
         * 3、字符串第一个字符为小写，且其他的字母都是小写，返回true
         * 4、其他情况返回false
         **/
        char[] c = word.toCharArray();
        for(int i = 0; i < c.length; i++){
            //首先判断第一个字母
            if(Character.isLowerCase(c[0])){
                //如果第一个字母是小写字母，然后判断随后的字母是否都是小写。
                //如果随后的字母中出现大写字母，则返回false
                if(Character.isUpperCase(c[i])){
                    return false;
                }
            }else if(Character.isUpperCase(c[0])){//判断第一个字母为大写字母
                //如果字符串长度大于2，判断第二个字母大小写
                if(c.length >= 2 && Character.isUpperCase(c[1])){
                    //如果第二个字母为大写，则其随后的字母需要都是大写，如果出现小写字母，则返回false
                    if(i > 1 && Character.isLowerCase(c[i])){
                        return false;
                    }
                }else if(c.length >= 2 && Character.isLowerCase(c[1])){
                    //如果第二个字母为小写，则其随后的字母需要都是小写，如果出现大写字母，则返回false
                    if(i > 1 && Character.isUpperCase(c[i])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
