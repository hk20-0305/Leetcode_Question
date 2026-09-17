class Solution {
    public int numberOfSubstrings(String s) {
        
        int[] c= new int[3];

        int l=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            c[s.charAt(r)-'a']++;

            while(c[0]>0 && c[1]>0 && c[2]>0){
                
                ans+=s.length()-r;

                c[s.charAt(l)-'a']--;
                l++;
            }
        }

        return ans;
    }
}