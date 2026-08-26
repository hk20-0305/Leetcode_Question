class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        String ans ="";

        int l=0;
        int c=0;
        for(int r=0;r<s.length();r++){

            if(s.charAt(r)=='1')c++; 
            while(c==k){
                 String curr=s.substring(l,r+1);  
                if(ans.isEmpty()||ans.length()>curr.length()||(curr.length()==ans.length()&&curr.compareTo(ans)<0)){
                    ans=curr;
                }
                 if (s.charAt(l) == '1') c--;
                l++;
            }

        }

        return ans;

    }
}