class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int alen=a.length()-1, blen=b.length()-1, bit=0,carry=0;
        while(alen>=0 || blen>=0)
        {
            bit=carry;
            if(alen>=0) bit+=a.charAt(alen--)-'0';
            if(blen>=0) bit+=b.charAt(blen--)-'0';
            sb.append(bit&1);
            carry=bit>>1;
        }
         if(bit>=2) sb.append(carry);
        return sb.reverse().toString();
        
    }
}
