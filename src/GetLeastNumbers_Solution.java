import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
public class GetLeastNumbers_Solution {
    public static void main(String[] args){
        int[] A = new int[]{6,4,5,2,3};
        System.out.println(GetLeastNumbers_Solution(A, 2));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(k, new Comparator<Integer>(){
            @Override
            public int compare(Integer e1, Integer e2){
                return e2 - e1;
            }
        });

        for(int i = 0; i < input.length; i++){
            if(maxheap.size() != k){
                maxheap.offer(input[i]);
            }else{
                if(maxheap.peek() > input[i]){
                    maxheap.poll();
                    maxheap.offer(input[i]);
                }
            }
        }

        for(int i:maxheap){
            res.add(i);
        }

        return res;

    }
}