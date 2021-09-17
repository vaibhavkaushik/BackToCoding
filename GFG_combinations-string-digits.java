	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "12345";
		ArrayList<String> list = new ArrayList<>();
		solve(s,3,"",list);
		for(String str:list) {
			System.out.println(str);
		}
	}
    
    static void solve(String s ,int len,String ans,ArrayList<String> list) {
          
          if(s.length()==0) {
          	
          	list.add(ans);
          	return;
          }
         
          for(int i=0;i<s.length();i++) {
        
        	String curr = s.substring(0,i+1)+" ";
          	solve(s.substring(i+1),len,ans+curr,list);
          	
          }
          
          return;
    }

//Output
// 1 2 3 4 5 
// 1 2 3 45 
// 1 2 34 5 
// 1 2 345 
// 1 23 4 5 
// 1 23 45 
// 1 234 5 
// 1 2345 
// 12 3 4 5 
// 12 3 45 
// 12 34 5 
// 12 345 
// 123 4 5 
// 123 45 
// 1234 5 
// 12345
