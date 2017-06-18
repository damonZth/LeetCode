import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Damon on 2017/6/18.
 */
public class MeiTuan_01 {

    public double maxjuli;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //输入n个人人
        int n = sc.nextInt();
        //正常速度v
        double v = sc.nextDouble();
        //每个人的距离u
        double u = sc.nextDouble();

        double[] C = new double[n];
        //一次输入每个人的最高速度
        int i = 0;
        while(i < n){
            C[i] = sc.nextDouble();
            i++;
        }

        double[] D = new double[n];
        //依次输入每个人的速度衰减值
        int j = 0;
        while(j < n){
            D[j] = sc.nextDouble();
            j++;
        }

        //最后一个人到超越第一个人需要移动的距离
        double maxjuli = C.length * u;

        System.out.println("人数："+ n + "正常速度：" + v + "相隔距离：" + u);
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.toString(D));

        double s = n*u;
        double ans = 0.000;

        for(int k = 0; k < n; k++){
            double sum = 0;
            for(int x = 0; x < n; x ++){
                double tempV = C[k]-D[k]*x - v;
                sum += s/tempV;
            }
            ans += sum/n;
        }

        System.out.println(String.format("%.3f", ans));
    }



    public static double totalTime(double[] c,double[] d,double v,double u,int n){
        double totalTime = 0;
        double maxJL = n * u;
        double maxV = 0;
        for(int i = 0; i < n; i++){
            maxV = maxV(c[i],i+1,d[i]);
            totalTime += lastTofirst(maxV,v,maxJL);
        }
        return totalTime;
    }

    /**
     * 求出某个人开始向前追的时候的最高速度
     * @param cv
     * @param j
     * @return
     */
    public static double maxV(double cv,int j, double dv){
        return cv - (j-1)*dv;
    }

    /**
     * 最后一个人以它最高速度跑到前面需要多少时间
     * 用这个人的该轮的最高速度除以距离就是所花费非的时间
     * @param maxV
     * @return
     */
    public static double lastTofirst(double maxV,double v,double maxjuli){
        double time = (maxV - v)/ maxjuli;

        return time;
    }
}
