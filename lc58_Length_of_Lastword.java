class Solution {
    public int lengthOfLastWord(String s) {
     int i = s.length()-1, length = 0;
        while(i >= 0 && s.charAt(i) == ' ') i--;
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}

##################################################################

class Solution {
    public int lengthOfLastWord(String s) {
        
      int length =0;
        
        for(int i = s.length()-1; i>=0; i--){
          if(  s.charAt(i) != ' ' ){
              length++;
          }else {
              if(length>0)
                  return length;
          }
            
        }
        return length;
    }
}