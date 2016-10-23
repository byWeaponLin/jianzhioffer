package com.weaponlin.comeon161020;

/**
 * http://www.nowcoder.com/practice/ae45a1d8bc1d43858c83762fe8c2802c?tpId=49&tqId=29306&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * Created by Weapon Lin on 2016/10/21.
 */
public class Test2{
    public static void main(String[] args){
        //TODO not complete
        System.out.println(calcDistance(100,90,80,70));
    }

    public static int calcDistance(int A, int B, int C, int D) {
        // write code here

        return get(A)+get(B)+get(C)+get(D);
    }

    public static int get(int num){
        if(num <= 0){
            return 0;
        }
        int sum = num;
        do{
            sum += num;
        }while((num/=2) > 0);
//        while((num/=2) > 0){
//            sum +=
//        }
        return sum;
    }
}
