import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> soln = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i< strs.length; i++){
            String s = strs[i];
            char[] tempArr = new char[s.length()];
            tempArr = s.toCharArray();
            Arrays.sort(tempArr);
            String s_sorted = Arrays.toString(tempArr);
            if (!map.containsKey(s_sorted)){
                map.put(s_sorted, new ArrayList<>());
            }
            map.get(s_sorted).add(s);
        }
        for (Map.Entry<String, List<String>> it: map.entrySet()){
            soln.add(it.getValue());
        }
        return soln;
    }
}
