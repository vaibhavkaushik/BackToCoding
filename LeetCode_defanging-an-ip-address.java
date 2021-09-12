class Solution {
    public String defangIPaddr(String address) {
        int len = address.length();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++){
            if (address.charAt(i) == '.'){
                str.append("[.]");
            } else {
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
}
