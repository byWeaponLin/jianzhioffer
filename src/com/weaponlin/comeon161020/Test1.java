package com.weaponlin.comeon161020;

/**
 * http://www.nowcoder.com/practice/28d5a9b7fc0b4a078c9a6d59830fb9b9?tpId=49&tqId=29278&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 * Created by Weapon Lin on 2016/10/20.
 * nice,fist AC,a little happy
 */
public class Test1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {4,4,10,21};
//        System.out.println(getPos(arr,5,7));
        System.out.println(getPos(arr1,4,4));
    }

    public static  int getPos(int[] arr, int n, int val) {
        if(arr == null || n <= 0 || n > arr.length){
            return -1;
        }
        int left = 0,right = n-1;
        int mid = -1;
        while(left <= right){
            mid = (left+right)/2;
            if(arr[mid] > val){
                right--;
            }else if(arr[mid] < val){
                left++;
            }else{
                //  第一种方法
                /*
                int t = mid;
                while(t > left){
                    if(arr[t-1] == arr[mid]){
                        t--;
                    }else{
                        break;
                    }
                }
                mid = t;
                break;
                */
                //第二种方法
                if(right > left){
                    right--;
                }else{
                    break;
                }
            }
        }
        if(left > right){
            return -1;
        }

        return mid;
    }
}
