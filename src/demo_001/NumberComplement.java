package demo_001;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/number-complement
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 */
public class NumberComplement {
    static int count = 0;
    public int findComplement(int num) {

        // int[] bit = int_to_byte(num);
        // reverseBit(bit);
        // return byte_to_int(bit);

        int[] bit = new int[32];
        int result = 0;
        int count = 0;
        while (num >= 1) {
            bit[count] = num % 2;
            num = num / 2;
            count++;
        }
        for (int i = 0; i < count; i++)
            bit[i] = bit[i] ^ 1;
        int j = 1;
        for (int i = 0; i < count; i++)  {
            result = result + bit[i] * j;
            j = j * 2;
        }
        return result;

    }

    //十进制转换为二进制
    public int[] int_to_byte(int num){

        int[] bit = new int[100];
        while(num != 0){
            bit[count] = num % 2;
            num /= 2;
            count += 1;
        }
        return bit;
    }

    //二进制转换为十进制
    public int byte_to_int(int[] bit){
        int temp = 0;
        for(int i = 0; i < count; i ++){
            temp += bit[i]*Math.pow(2,1);
        }
        return temp;
    }

    //二进制位翻转
    public void reverseBit(int[] bit){
        for(int i = 0; i < count; i++){
            if(bit[i] == 1){
                bit[i] = 0;
            } else if(bit[i] == 0){
                bit[i] = 1;
            }
        }
    }
}
