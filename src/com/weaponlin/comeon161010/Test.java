package com.weaponlin.comeon161010;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weapon Lin on 2016/10/17.
 */
public class Test {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        System.out.println(list.get(0));
        swap(list);
        System.out.println(list.get(0));
    }

    public static void swap(List<String> list){
        list.set(0,"bb");
    }
}
