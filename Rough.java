public static ArrayList<String> getPermutations(String str){
         if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char c = str.charAt(0);
        ArrayList<String> smallAns = getPermutations(str.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        for(String smallStr : smallAns){
            for(int i  = 0; i <= smallStr.length(); i++){
                ans.add(smallStr.substring(0, i) + c + smallStr.substring(i));
            }
        }
        return ans;
    }
