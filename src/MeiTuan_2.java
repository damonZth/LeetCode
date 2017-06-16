import java.util.Scanner;

/**
 * Created by Damon on 2017/6/16.
 */
public class MeiTuan_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int i = 0;
        while(i < n){
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println(count(n,arr));
    }
    public static int count(int n,int[] arr){
        int index = findIndex(arr);

       return (int)log(index,2);
    }
    public static double log(int a,int b){
        return Math.log(a) / Math.log(b);
    }
    public static int findIndex(int[] arr){
        int x = arr[0];
        //System.out.println(x);
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= x){
                index ++;
            }
        }
        return index;
    }

}
