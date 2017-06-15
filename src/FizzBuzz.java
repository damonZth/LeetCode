import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/fizz-buzz/#/description
 *
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            /**
             * 这里的条件判断语句，需要注意先后顺序
             * 约束条件更小的，优先判断
             **/
            if(i % 15 == 0){
                list.add("FizzBuzz");
            }else  if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }

            // if(i % 3 == 0){
            //     list.add("Fizz");
            // }else if(i % 5 == 0){
            //     list.add("Buzz");
            // }else if(i % 15 == 0){
            //     list.add("FizzBuzz");
            // }else{
            //     list.add(String.valueOf(i));
            // }
        }
        return list;
    }
}
