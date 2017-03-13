package com.weaponlin.comeon170311;

import org.junit.Test;

/**
 * Created by Weapon Lin on 2017/3/11.
 */
public class Test1 {

    public static void main(String args[]) {
        final int cardTotal = 52;
        int[] card = new int[cardTotal + 1];
        for (int i = 1; i <= cardTotal; i++)
            card[i] = i;
        //No.1
        //开始写代码，模仿洗扑克牌，实现对52张扑克牌的乱序排列（不包括大小王）
        for (int i = 1; i <= cardTotal; i++){
            int newIdx = (int)(Math.random()*cardTotal) + 1;
            card[i] ^= card[newIdx];
            card[newIdx] ^= card[i];
            card[i] ^= card[newIdx];
        }
        //end_code
        for (int i = 1; i <= cardTotal; i++) {
            //No.2
            //开始写代码，用switch语句，以例如“梅花K”的形式输出乱序排列后的结果
            int remain = card[i] % 13;
            switch (remain){
                case 1:
                    System.out.print(getType(card[i]) + 1 + "  ");
                    break;
                case 2:
                    System.out.print(getType(card[i]) + 2 + "  ");
                    break;
                case 3:
                    System.out.print(getType(card[i]) + 3 + "  ");
                    break;
                case 4:
                    System.out.print(getType(card[i]) + 4 + "  ");
                    break;
                case 5:
                    System.out.print(getType(card[i]) + 5 + "  ");
                    break;
                case 6:
                    System.out.print(getType(card[i]) + 6 + "  ");
                    break;
                case 7:
                    System.out.print(getType(card[i]) + 7 + "  ");
                    break;
                case 8:
                    System.out.print(getType(card[i]) + 8 + "  ");
                    break;
                case 9:
                    System.out.print(getType(card[i]) + 9 + "  ");
                    break;
                case 10:
                    System.out.print(getType(card[i]) + 10 + "  ");
                    break;
                case 11:
                    System.out.print(getType(card[i]) + "J" + "  ");
                    break;
                case 12:
                    System.out.print(getType(card[i]) + "Q" + "  ");
                    break;
                case 13:
                    System.out.print(getType(card[i]) + "K" + "  ");
                    break;
            }
        }
    }

    public static String getType(int val){
        if(val > 39){
            return "梅花";
        }else if(val > 26){
            return "黑桃";
        }else if(val > 13){
            return "红桃";
        }else {
            return  "红心";
        }
    }

    @Test
    public void test(){
        System.out.println((int)(Math.random()*100));
    }
}
