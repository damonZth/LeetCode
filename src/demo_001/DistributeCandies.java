package demo_001;

import java.util.HashSet;

/**
 * Created by Damon on 2017/6/15.
 *https://leetcode.com/problems/distribute-candies/#/description
 *
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 *
 * Note:
 * The length of the given array is in range [2, 10,000], and will be even.
 * The number in given array is in range [-100,000, 100,000].
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        //1、糖果是平均分配，每个人的糖果数一样
        /**
         * 通过去除数组中重复的元素，新的数组的长度则表示糖果的种类，
         **/

        /*这里居然超时了。。。。。*/
        // int n = candies.length;//糖果的总数
        // int[] kinds = hashSet(candies);//糖果种类数组
        // int k = kinds.length;//糖果种类
        // if(k > n/2){
        //     return n/2;
        // }else{
        //     return k;
        // }

        HashSet<Integer> data = new HashSet<>();
        for (int i : candies)
            data.add(i);
        if (data.size() >= candies.length / 2)
            return candies.length / 2;
        else
            return data.size();


    }
    //去除数组中重复的元素
    public int[] hashSet(int[] arr){
        int t = 0;
        int[] tempArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            //设置一个标签，用来标注重复的元素位置
            boolean isTrue = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isTrue = false;
                }
            }
            //将标签为true位置的元素移到临时数组中
            if(isTrue){
                tempArr[t] = arr[i];
                t += 1;
            }
        }
        int[] newArr = new int[t];
        newArr = copyArr(tempArr,t);
        return newArr;
    }
    //复制数组的前n位到新的数组
    public int[] copyArr(int[] arr,int n){
        int[] retArr = new int[n];
        for(int i = 0; i < arr.length; i++){
            if(i < n){
                retArr[i] = arr[i];
            }else{
                break;
            }
        }
        return retArr;
    }

}
