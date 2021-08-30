class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
         stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++) {
           
            if(i>0 ) {
                if(s.charAt(i)=='}'||s.charAt(i)=='{') {
                    
                    if(stack.size()>0 && stack.peek()=='{' && s.charAt(i)=='}') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                }
                if(s.charAt(i)==')'||s.charAt(i)=='(') {
                
                    
                    if(stack.size()>0 && stack.peek()=='(' && s.charAt(i)==')') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                }
                if(s.charAt(i)==']'||s.charAt(i)=='[') {
                    
                    if(stack.size()>0 && stack.peek()=='['  && s.charAt(i)==']') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                }
            }
        }
        
        if(stack.size()>0) {
            return false;
        } else {
            return true;
        }
        
    }
}
