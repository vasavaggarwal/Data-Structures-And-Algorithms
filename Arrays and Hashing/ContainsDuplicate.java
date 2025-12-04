import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int element = nums[i];
            int freq = 1;
            if (map.containsKey(element)){
                return true;
            } else {
                map.put(element, freq);
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
