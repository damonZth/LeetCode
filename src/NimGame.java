/**
 * Created by Damon on 2017/6/15.
 * https://leetcode.com/problems/nim-game/#/description
 *
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner.
 * You will take the first turn to remove the stones.
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 */
public class NimGame {
    public boolean canWinNim(int n) {
        /**
         * 从桌上的n个石头中，轮流去取走1到3颗。取走最后一块石头的人赢得游戏。
         * 从题目中，我们可以知道，甲乙两人轮流取石头，甲先取，当n=4时，甲必输
         *
         * 所以，被4整除的石头，甲都不能赢得游戏。
         **/
        if(n % 4 == 0){
            return false;
        }
        return true;
    }

}
