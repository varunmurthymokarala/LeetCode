class Solution {
    private static final String Open_Brackets = "{[(";
    private static final String Close_Brackets = "}])";
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(OpenBracket(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty() || !isMatch(stack.pop(), c)){
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
    }   
    private boolean OpenBracket(char c){
        return Open_Brackets.indexOf(c) != -1;
    }
    private boolean isMatch(char O, char C){
        return Open_Brackets.indexOf(O) == Close_Brackets.indexOf(C);
    }
}
