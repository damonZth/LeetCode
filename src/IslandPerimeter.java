/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/island-perimeter/#/description
 *
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * ne cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        /**
         *判断矩阵中元素为1的位置，
         * 若元素为1，则有加4条边
         * 若该正方形相邻元素为1则减去2条边，每有一个相邻元素为1则减2条边
         * 这里需要注意数组是否越界
         * 在i-1 >= 0 j+1 < n
         **/
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ans += 4;
                    if ((i - 1) >= 0 && grid[i - 1][j] == 1) {
                        ans -= 2;
                    }
                    if ((j + 1) < n && grid[i][j + 1] == 1) {
                        ans -= 2;
                    }
                }
            }
        }
        return ans;
    }
}
