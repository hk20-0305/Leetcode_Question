class Solution {
    public int minSwaps(String s) {

        int sl=0;


        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='['){
                sl++;
            }else if(sl>0){
                sl--;
            }
        }

        return (sl+1)/2;

    }
}