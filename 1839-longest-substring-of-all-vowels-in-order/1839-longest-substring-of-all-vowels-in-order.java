class Solution {
    public int longestBeautifulSubstring(String word) {
         
         int max=Integer.MIN_VALUE;

         if(word.length()==1){
            return 0;
         }

         int r=0;
         int l=1;
        HashSet<Character> set = new HashSet<>();
         while(l<word.length()){
            set.add(word.charAt(r));
            while(l < word.length() && word.charAt(l)>=word.charAt(l-1)){
                set.add(word.charAt(l));
                l++;
            }

              if(set.size()==5){
                max=Math.max(max,l-r);
            }

            if(l < word.length() && word.charAt(l)<word.charAt(l-1)){
                set.clear();
                r=l;
                l++;
            }


         }

         if(max==Integer.MIN_VALUE){
            return 0;
         }
        return max;
         
    }
}