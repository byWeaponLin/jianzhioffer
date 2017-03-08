package com.weaponlin.comeon170302;

/**
 * Created by Weapon Lin on 2017/3/2.
 */
public class Test3 {

    public static void main(String[] args) {
        Test3 t = new Test3();
        System.out.println(t.Power(2,-2));
        System.out.println(t.Power(-2,3));
    }


    public double Power(double base, int exponent) {
        if(base == 0){
            return 0;
        }
        if(exponent == 0){
            return 1;
        }
        double result = 1;
        if(exponent < 0){
            exponent = Math.abs(exponent);
            base = 1/base;
        }
        for(int i = 0;i < exponent;i++){
            result *= base;
        }

        return result;
    }

    public void concretePower(){

    }
}
