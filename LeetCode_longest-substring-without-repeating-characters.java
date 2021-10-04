class Solution {
    
    //The concept here is to use sliding window algorithm.
    public int lengthOfLongestSubstring(String s) {
         
      //These are the left and right pointer of window
      int left = 0 , right = 0;
      
      //We are going to use this to find out if a character has repeated in window
      Set<Character> seen = new HashSet();
        
        //Use this to find out the max window length
      int max = 0;  
        
      //Until we do not complete traversing the whole window
      while(right<s.length()){
          
          //Start from the left side of window
          char c = s.charAt(right); 
          
          //If this character is already present in our set then seen will return false.
          //otherwise we need to find out the max length
          if(seen.add(c)){
              //Ofcourse the length should be right-left+1 
              max = Math.max(max,right-left+1);
              //Once encountered a new char.. we can move ahead and increase window size
              right++;
          }else{
              //If the new char inside window is getting repeated then we need to decrease 
              //the window size, and remove all the characters till we reach the repeating
              //character from left
              while(s.charAt(left)!=c){
                 seen.remove(s.charAt(left));
                 left++;
              }
              //When we reach the last repeating character from left, we remove it
              seen.remove(c);left++;
          }
      }
      return max;
    }
    
    
}
