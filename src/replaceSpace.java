package jianzhioffer.src;

import java.util.*;

public class replaceSpace {
    public static void main(String args[]){
        StringBuffer A = new StringBuffer("I am a boy.");
        System.out.println(replaceSpace(A));
    }

    public static String replaceSpace(StringBuffer s){
        StringBuffer res = new StringBuffer();
        int len = s.length() - 1;
        for(int i = len; i >= 0;i--){
            if(s.charAt(i) == ' '){
                res.append("02%");
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}