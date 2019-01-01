package jianzhioffer.src;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.*;

public class reOrderArray {
    public static void main(String[] args){
        int[] A = new int[]{1,2,3,4,5,6};
        reOrderArray2(A);
        System.out.println(Arrays.toString(A));
    }

    public static void reOrderArray1(int[] array){
        Vector<Integer> odd = new Vector<Integer>();
        Vector<Integer> even = new Vector<Integer>();

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                odd.add(array[i]);
            }else{
                even.add(array[i]);
            }
        }

        odd.addAll(even);
        for(int i = 0; i < array.length; i++){
            array[i] = odd.get(i);
        }
    }

    public static void reOrderArray2(int [] array) {
        for(int i=0; i < array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] % 2 == 0 && array[j+1] % 2 != 0){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
