package Recursion;

import java.util.HashMap;
import java.util.Map;

public class StairCaseProblem {

    // We can optimise it using DP, this is not the best solution
    public int climbStairs(int n) {
        if(n==1 || n==2)
            return n;
    return climbStairs(n-1)+climbStairs(n-2);
    }

    // using memorization dp
    Map<Integer,Integer> map=new HashMap<>();
    public int climbStairsMemo(int n) {
        if(n==1 || n==2)
            return n;
        if(map.containsKey(n))
            return map.get(n);
        int res= climbStairsMemo(n-1)+climbStairsMemo(n-2);
        map.put(n,res);
        return res;
    }

    // most optimised using dp Space Optimization Tabulation Approach, as we required only last 2 results here so we can eliminate O(n) space usage
     public int climbStairsSOT(int n) {
        if(n==1 || n==2)
            return n;
        
        int last1 = 2, last2=1;
        int ans=-1;
        for(int i=3;i<=n;i++){
            ans=last1+last2;
            last2 = last1;
            last1 = ans;
        }
        return ans;
    }

}
