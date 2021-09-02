class Solution {
      public boolean isPowerOfTwo(int n) {
        
        if(n<=0){
            return false;
        }
          int answer = n & (n-1);
          if(answer==0 ){
              return true;
          } else {
              return false;
          }
    }
}
