/*
*	Determine whether an integer is a palindrome. Do this without extra space.
*
*
*/

public class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0)
        {
            return false;
        }
        
        int reverseNum = 0;
        int y = x;
        
        while (x != 0)
        {
            reverseNum = reverseNum*10;
            reverseNum = reverseNum + x%10;
            x = x/10;
        }
        
        if ((y^reverseNum) != 0)
        {
            return false;
        }
        
        return true;
    }
}