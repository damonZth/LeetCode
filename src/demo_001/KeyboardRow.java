package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/keyboard-row/#/description
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard
 *
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        /**
         * 分析：给出n个字符串，从而判断每个字符串中的字符石头来自美式键盘上的同一行，若来自同一行，返回该string。
         **/
        char[] row_1 = {'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'};
        char[] row_2 = {'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'};
        char[] row_3 = {'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};

        String[] tempWords = new String[words.length];
        int t = 0;
        boolean flag = true;
        for (int i = 0; i < words.length; i++) {

            boolean b = check_1(words[i], row_1, row_2, row_3);
            //System.out.print(b + ",");

            if(b){
                tempWords[t] = words[i];
                t += 1;
            }
        }
        //System.out.println(Arrays.toString(tempWords));
        String[] newWords = new String[t];
        newWords = copyArr(tempWords, t);
        return newWords;

    }

    public boolean check_1(String str,char[] c1,char[] c2,char[] c3){
        return check(str, c1) || check(str, c2) || check(str, c3);
    }

    /*
	 * 判断一个字符串是否来之同一行键
	 */
    public boolean check(String str, char[] charArr) {
        char[] tempWord = str.toCharArray();
        int count = 0;
        for (int i = 0; i < tempWord.length; i++) {
            if (isContain(charArr, tempWord[i])) {
                count += 1;
            }
        }
        if (count == tempWord.length) {
            return true;
        }
        return false;
    }
    public static String[] copyArr(String[] arr, int n) {
        String[] retArr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            if (i < n) {
                retArr[i] = arr[i];
            } else {
                break;
            }
        }
        return retArr;
    }

    // 检查数组中是否包含某个元素
    public static boolean isContain(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return true;
            }
        }
        return false;
    }
}
