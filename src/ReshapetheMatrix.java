/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/reshape-the-matrix/#/description
 *
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.
 * You're given a matrix represented by a two-dimensional array,
 * and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 *
 * Note:
 * The height and width of the given matrix is in range [1, 100].
 * The given r and c are all positive.
 */
public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int x = nums.length;//x表示nums的行数
        int y = nums[0].length;//y表示nums的列数
        int[][] retnums = new int[r][c];
        int[] temp = new int[x*y];
        int count = 0;
        int a = x*y;
        int b = r*c;

        //根据原数组元素的个数与新的数组元素个数比较，判断是否能转换为新的数组
        if(a < b){
            return nums;
        }
        //用一维数组存储多维数组的元素
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                temp[count] = nums[i][j];
                count += 1;
            }
        }
        //将一维数组的元素存放到新的多维数组中
        int k = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                retnums[i][j] = temp[k];
                k += 1;
            }
        }
        return retnums;

    }
}
