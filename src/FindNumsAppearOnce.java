package jianzhioffer.src;

import java.util.*;

public class FindNumsAppearOnce {
    public static void main(String[] args){
        int[] A = new int[]{1,1,2,3,4,4,5,5};
        int[] res = FindNumsAppearOnce(A);
        System.out.println(Arrays.toString(res));
    }

    public static int[] FindNumsAppearOnce(int[] array){
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++){
            if(temp.containsKey(array[i])){
                temp.remove(array[i]);
            }else{
                temp.put(array[i], 1);
            }
        }

        int[] res = new int[2];
        int i = 0;
        for(Integer k: temp.keySet()){
            res[i] = k;
            i++;
        }
        return res;
    }
}
