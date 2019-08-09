package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/construct-the-rectangle/#/description
 *
 * For a web developer, it is very important to know how to design a web page's size.
 * So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page,
 * whose length L and width W satisfy the following requirements:
 * 1. The area of the rectangular web page you designed must equal to the given target area.
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 3. The difference between length L and width W should be as small as possible.
 * You need to output the length L and the width W of the web page you designed in sequence.
 *
 * Note:
 * The given area won't exceed 10,000,000 and is a positive integer
 * The web page's width and length you designed must be positive integers.
 *
 */
public class ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int n = (int)Math.sqrt(area);
        for(int i = n; i <= area; i++){
            int length = i;
            int width = area/i;
            if(length * width == area){
                result[0] = length < width ? width : length;
                result[1] = area/result[0];
                return result;
            }
        }
        return result;
    }
}
