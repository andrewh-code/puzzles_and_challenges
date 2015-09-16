public class Solution {
    public int addDigits(int num) {
        
        if (num < 0){
            return num;
        }
        
        int result = 0;
        
        // use digital root formula
        result = num - 9 * ((num-1)/9);
        
        return result;
    }
}