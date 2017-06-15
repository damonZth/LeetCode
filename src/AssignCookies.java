import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/assign-cookies/#/description
 *
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie. Each child i has a greed factor gi,
 * which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj. I
 * f sj >= gi, we can assign the cookie j to the child i, and the child i will be content.
 * Your goal is to maximize the number of your content children and output the maximum number.
 * Note:
 * You may assume the greed factor is always positive.
 * You cannot assign more than one cookie to one child.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        //题目也不是求交集就可以
        LinkedList<Integer> list = intersect(g,s);
        return list.size();
    }


    //两个集合的交集
    public LinkedList<Integer> intersect(int[] arr1, int[] arr2){
        Map<Integer,Boolean> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        for(Integer i : arr1){
            if(!map.containsKey(i)){
                map.put(i, Boolean.FALSE);
            }
        }

        for(Integer i : arr2){
            if(map.containsKey(i)){
                map.put(i, Boolean.TRUE);
            }
        }

        for(Map.Entry<Integer,Boolean> e : map.entrySet()){
            if(e.getValue().equals(Boolean.TRUE)){
                list.add(e.getKey());
            }
        }

        return list;
    }
}
