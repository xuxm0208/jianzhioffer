package jianzhioffer.src;

import java.util.*;

public class GetNumberOfK {
    public static void main(String[] args){
        int[] A = new int[]{1,2,2,2,3,4,5,6,7,7};
        System.out.println(GetNumberOfK(A, 2));
    }

    public static int GetNumberOfK(int[] array, int k){
        int len = array.length;
        if(len == 0)
            return 0;
        int first = getfirst(array, k, 0, len - 1);
        int last = getlast(array, k, 0, len - 1);
        if(first != -1 && last != -1){
            return last - first + 1;
        }
        return 0;
    }

    public static int getfirst(int[] array, int k, int start, int end){
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(k <= array[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        if(start < array.length && array[start] == k)
            return start;
        else
            return -1;
    }

    public static int getlast(int[] array, int k, int start, int end){
        int mid;
        while(start <= end){
            mid = (start + end) / 2;
            if(k >= array[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if(end > 0 && array[end] == k)
            return end;
        else
            return -1;
    }

}
