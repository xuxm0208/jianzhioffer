package jianzhioffer.src;

import java.util.*;

import apple.laf.JRSUIUtils;
import jianzhioffer.src.TreeNode;

public class Print {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> A = Print(root);
        System.out.println(A);
    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        if(pRoot == null)
            return res;
        int flag = 1;
        s2.push(pRoot);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(flag % 2 != 0){
                while(!s2.isEmpty()){
                    TreeNode node = s2.pop();
                    temp.add(node.val);
                    if(node.left != null){
                        s1.push(node.left);
                    }
                    if(node.right != null){
                        s1.push(node.right);
                    }
                }
            }
            if(flag % 2 == 0){
                while(!s1.isEmpty()){
                    TreeNode node = s1.pop();
                    temp.add(node.val);
                    if(node.right != null){
                        s2.push(node.right);
                    }
                    if(node.left != null){
                        s2.push(node.left);
                    }
                }
            }

            res.add(new ArrayList<Integer>(temp));
            temp.clear();
            flag++;


        }
        return res;
    }


}
