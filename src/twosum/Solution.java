package twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
        if(numbers.length <=1){
            return null;
        }
        Map<Integer,Integer> mRec = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(mRec.get(numbers[i]) != null){
                res[0] = mRec.get(numbers[i]) + 1;
                res[1] = i + 1;  
                return res;
            }
            else{
                mRec.put(target-numbers[i],i);
            }
        }
        return null;
        
    }
}
