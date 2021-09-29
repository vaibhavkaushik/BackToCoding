class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> ans = new ArrayList<>();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++) {
            arr[i]=i;
        }
        int k=1;
        for(int i=0;i<target.length;i++) {
            while(target[i]!=arr[k]) {
                ans.add("Push");
                ans.add("Pop");
                k++;
                if(k>=n) break;
            }
            while(target[i]==arr[k]) {
                ans.add("Push");
                k++;
                if(k>=n) break;
            }
        }
        return ans;
    }
}
