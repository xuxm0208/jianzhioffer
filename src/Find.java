package jianzhioffer.src;

import java.util.*;

public class Find {
    public static void main(String[] args){
        int[][] A = new int[][]{{1,2,3}, {4,5,6}};
        System.out.println(Find(2, A));
    }

    public static boolean Find(int target, int[][] array){
        if(array.length == 0 || array[0].length == 0)
            return false;
        int n = 0;
        int m = array[0].length - 1;
        int temp = array[n][m];
        while(target != temp){
            if(m > 0 && n < array.length - 1){
                if(target > temp){
                    n += 1;
                }else if(target < temp){
                    m -= 1;
                }
                temp = array[n][m];
            }else{
                return false;
            }
        }
        return true;
    }
}
