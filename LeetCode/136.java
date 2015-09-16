public class Solution {
    public int singleNumber(int[] nums) {
        
        int count = 0;
        int result = 0;
        
        while (count < nums.length)
        {
            //XOR 
            result ^= nums[count];
            count++;
            
        }
        
        return result;
    }
}