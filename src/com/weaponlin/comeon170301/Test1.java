package com.weaponlin.comeon170301;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Weapon Lin on 2017/3/1.
 */
public class Test1 {

    @org.junit.Test
    public void test0(){
        Test1 t1 = new Test1();
        List<String> list = t1.Permutation("dbva");
        for(String s : list){
            System.out.println(s);
        }
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>() ;
        if(str==null || str.length()==0) { return result ; }

        char[] chars = str.toCharArray() ;
        TreeSet<String> temp = new TreeSet<>() ;
        Permutation(chars, 0, temp);
        result.addAll(temp) ;
        return result ;
    }

    public void Permutation(char[] chars, int begin, TreeSet<String> result) {
        if(chars==null || chars.length==0 || begin<0 || begin>chars.length-1) { return ; }

        if(begin == chars.length-1) {
            result.add(String.valueOf(chars)) ;
        }else {
            for(int i=begin ; i<=chars.length-1 ; i++) {
                swap(chars, begin, i) ;

                Permutation(chars, begin+1, result);

                swap(chars, begin, i) ;
            }
        }
    }

    public void swap(char[] x, int a, int b) {
        char t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
