package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/hamming-distance/#/description
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 *
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        //汉明距离
        //指x、y的二进制表示中，相同位置数字不相同的所有情况是。
        //通过对x、y求异或，结果z的保留1的位置便是x、y在相同位置上数字不同
        //然后求出z中1的个数，便是明翰距离
        int z = x ^ y;
        int num = 0;
        while(z != 0){
            z &= (z - 1);
            num ++;
        }
        return num;
    }

}
