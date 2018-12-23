package jianzhioffer.src;

import java.util.*;
import jianzhioffer.src.TreeNode;

public class PrintFromTopToBottom {
    public static void main(String[] args){
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);
        System.out.println(PrintFromTopToBottom(A));
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size() != 0){ //
            TreeNode temp = queue.remove();
            res.add(temp.val);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return res;
    }
}
