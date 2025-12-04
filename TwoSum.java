import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] soln = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if (map.containsKey(val)){
                if (i>map.get(val)){
                    soln[0] = map.get(val);
                    soln[1] = i;
                } else {
                    soln[0] = i;
                    soln[1] = map.get(val);
                }
                break;
            } else {
                map.put(nums[i],i);
            }
        }
        return soln;
    }
}
