class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> hMap = new HashMap<Character, Integer>();
        hMap.put('I',1);
        hMap.put('V',5);
        hMap.put('X',10);
        hMap.put('L',50);
        hMap.put('C',100);
        hMap.put('D',500);
        hMap.put('M',1000);
        int result =0;
        for(int i=0;i<s.length();i++){
            
            // we need to subtract 2 times the prev amount bcoz 1 time will nullify the effect
            // of adding and other one will subtract the value, that's what we need actually
            if(i>0 && hMap.get(s.charAt(i))>hMap.get(s.charAt(i-1)))
            result = result + hMap.get(s.charAt(i)) - 2 * hMap.get(s.charAt(i-1));
            else
            result += hMap.get(s.charAt(i)); 
        }
        return result;
    }
}
