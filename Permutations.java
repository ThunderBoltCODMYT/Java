import java.util.*;

public class Permutations{
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums){
        helper(0, nums, new ArrayList<Integer>());
        return ans;
    }
    
    public void helper(int idx, int[] nums, ArrayList<Integer> curr){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        
        for(int i = idx; i < nums.length; i++){
            curr.add(nums[i]);
            swap(nums, i, idx);
            helper(idx + 1, nums, curr);
            swap(nums, i, idx);
            curr.remove(curr.size() - 1);
        }
    }
    
    public static void swap(int[] nums, int i, int idx){
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }
    
    public static void main(String[] args){
        Permutations Solution = new Permutations();
        int[] nums = {1,2,3};
        List<List<Integer>> result = Solution.permute(nums);
        System.out.println(result);
    }
}