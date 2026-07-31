class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];
        int count=0;
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            if(freq[ch-'a'] == 0){
                count++;
            }
            freq[ch-'a']++;
        }
        int[] freq1 = new int[count];
        int idx=0;
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                freq1[idx++] = freq[i];
            }
        }
        Arrays.sort(freq1);
        int ans=0;
        int k=0;
        if(count<=8) return n;
        if(count>24){
            int times=count-24;
            for(int i=0; i<times; i++){
                ans+=freq1[k++]*4;
            }
        }
        if(count>16){
            int times=Math.min(count,24)-16;
            for(int i=0; i<times; i++){
                ans+=freq1[k++]*3;
            }
        }
        if(count>8){
            int times=Math.min(count,16)-8;
            for(int i=0; i<times; i++){
                ans+=freq1[k++]*2;
            }
        }
        while(k<count){
            ans+=freq1[k++];
        }
        return ans;
    }
}