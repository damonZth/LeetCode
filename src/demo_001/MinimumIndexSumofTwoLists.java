package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/#/description
 *
 * Suppose Andy and Doris want to choose a restaurant for dinner,
 * and they both have a list of favorite restaurants represented by strings.
 * You need to help them find out their common interest with the least list index sum.
 * If there is a choice tie between answers, output all of them with no order requirement.
 * You could assume there always exists an answer.
 *
 * Note:
 * The length of both lists will be in the range of [1, 1000].
 * The length of strings in both lists will be in the range of [1, 30].
 * The index is starting from 0 to the list length minus 1.
 * No duplicates in both lists.
 */
public class MinimumIndexSumofTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        // find out their common interest with the least list index sum
        int l1 = list1.length;
        int l2 = list2.length;
        int n = max(l1,l2);
        boolean[] b = new boolean[n];
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if(list1[i].equals(list2[j]) && i + j <= min){
                    b[i] = true;
                    count += 1;
                    min = i+j;
                }
                // if(compareStr(list1[i],list2[j]) && i + j <= min){

                // 	count += 1;
                // 	min = i+j;
                // 	b[j] = true;
                // }
            }
        }
        int j = 0;
        String[] retStr = new String[count];
        for(int i = 0; i<l1; i++){
            if(b[i]){
                retStr[j] = list1[i];
                j += 1;
            }

        }
        return retStr;
//         int l1 = list1.length;
// 		int l2 = list2.length;
// 		int min = Integer.MAX_VALUE;
// 		boolean[] b = new boolean[l2];
// 		int count = 0;
// 		for(int i = 0; i < l1; i++){
// 			for(int j = 0; j < l2; j++){
// 				if(compareStr(list1[i],list2[j]) && i+j <= min){
// 					min = i+j;
// 					b[j] = true;
// 					count += 1;
// 				}
// 			}
// 		}
// 		int j = 0;
// 		String[] retStr = new String[count];
// 		for(int i = 0; i < l2; i++){
// 			if(b[i]){
// 				retStr[j] = list2[i];
// 				j+=1;
// 			}
// 		}
// 		return retStr;
    }

    public int max(int a,int b){
        return a > b ? a : b;
    }

    public boolean compareStr(String str1, String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int n = c1.length;

        if (c1.length != c2.length) {
            return false;
        }
        for(int j = 0; j < n; j++){
            if(c1[j] == c2[j]){
                return true;
            }
        }
        return false;

    }
}
