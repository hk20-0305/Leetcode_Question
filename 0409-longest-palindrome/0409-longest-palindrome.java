class Solution {
    public int longestPalindrome(String s) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>=97 && ch<=122){
                arr1[ch-'a']++;
            }else{
                arr2[ch-'A']++;
            }
        }

        int c1=0;
        int c2=0;
        for(int i=0;i<26;i++){
            if(arr1[i]%2==0){
                c1+=arr1[i];
            }else{
                c1+=arr1[i]-1;
            }

            if(arr2[i]%2==0){
                c2+=arr2[i];
            }else{
                c2+=arr2[i]-1;
            }
        }

        if(c1+c2<s.length()){
            return c1+c2+1;
        }
        
        return c1+c2;
    }
    
}