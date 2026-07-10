class Solution {
    public int minLengthAfterRemovals(String s) {


         HashSet<Character> set = new HashSet<>();
         for(char ch:s.toCharArray()){
            set.add(ch);
         }
        int[] fr=new int[26];
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fr[ch-'a']++;
         }
        int x=0;

        if(set.size()==1) return s.length();
        for(int i=0;i<set.size()-1;i++){
            
            if(fr[i]!=fr[i+1]){
                x=Math.abs(fr[i]-fr[i+1]);
            }else{
                continue;
            }
        }

   return x;

    }
}