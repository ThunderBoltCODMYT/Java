import java.util.*;

public class Subsets {
    
    List<List<Integer>> output = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums){
        int n = nums.length;
        
        helper(0, new ArrayList<Integer>(), nums);
        return output;
    }
    
    public void helper(int first, ArrayList<Integer> curr, int[] nums){
        if(first == nums.length){
            output.add(new ArrayList<Integer>(curr));
            return;
        }
        
        helper(first + 1, curr, nums);
        curr.add(nums[first]);
        helper(first + 1, curr, nums);
        curr.remove(curr.size() - 1);
    }
    
    public static void main(String[] args) {
        Subsets subset = new Subsets();
        int[] nums = {1,2,3};
        List<List<Integer>> subsets = subset.subsets(nums);
        System.out.println(subsets);
    }
}