package com.weaponlin.comeon170309;

/**
 * Created by Weapon Lin on 2017/3/9.
 */
public class Test3 {

    public static boolean match(char[] chs, char[] pattern){
        boolean f = match(chs,0,chs.length-1,pattern,0,pattern.length-1);
        return f;
    }

    //b and d is the last index of chs and pattern
    public static boolean match(char[] chs,int a ,int b, char[] pattern,int c ,int d){
        for(int i = c,j = a;i <= d && j <= b;i++,j++){
            if(pattern[i] == '.'){
                continue;
            }else if(pattern[i] == '*'){
                //pattern最后一个字符是*，可以匹配所有
                if(i == d){
                    return true;
                }else{
                    for(int m = j; m <= b;m++){
                        if(pattern[i+1] == chs[m]){
                            if(i+1 == d){
                                return true;
                            }else if(match(chs,m,b,pattern,i+2,d)){
                               return true;
                            }
                        }
                    }
                    return false;
                }
            }else{
                if(chs[a] != pattern[i]){
                    return false;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        //TODO  not yet
        String str1 = "aaa";
        String str2 = "a.a";
        char[] chs = str1.toCharArray();
        char[] pattern = str2.toCharArray();
        System.out.println(match(chs,pattern));
    }
}






















