package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsSequence {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}, 5));
    }
    static int currCount = 0;
    static String ans="";
    public static String permute(int[] nums, int k ) {
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), visited,k);
        return ans;
    }

    private static void backtrack(int[] nums, List<Integer> current, boolean[] visited,int k) {
        if (current.size() == nums.length) {
            currCount++;
            if(currCount==k){
                ans = current.toString();
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(nums[i]);
                backtrack(nums, current, visited, k);
                current.remove(current.size() - 1); // backtrack
                visited[i] = false;
            }
        }
    }
}
