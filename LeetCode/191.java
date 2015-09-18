public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        
        //while the integer is not equal to 0
        while (n != 0)
        {
            // bitwise AND operation between n and 1 (n AND 000000000000000000000000000000001)
            if ((n & 1) == 1)
            {
                count++;    //increment count (number of 1s in n)
            }
            n = n>>>=1; //bitshift n (pop out the least most significant bit by one place)
        }
        
        return count;
    }
}