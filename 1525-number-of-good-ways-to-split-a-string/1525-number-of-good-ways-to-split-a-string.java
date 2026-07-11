class Solution {
    public int numSplits(String s) {
        HashMap<Integer,Integer> map =new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length()-1;i++){
            h.add(s.charAt(i));
            map.put(i,h.size());
        }
        int c=0;
     
         HashSet<Character> h2=new HashSet<>();
        for(int i = s.length() - 1; i >= 0; i--) {
           h2.add(s.charAt(i));
         map2.put(i, h2.size());
          }
         for(int i = 0; i < s.length() - 1; i++) {
          if(map.get(i).equals(map2.get(i + 1))) {
        c++;
    }
}

    return c;
}

}