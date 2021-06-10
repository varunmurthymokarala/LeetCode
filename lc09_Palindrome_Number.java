class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x, result=0;
        while(temp != 0){
            result = result*10+ temp%10;
            temp = temp/10;
            
        } if(x == result){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}