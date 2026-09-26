class Solution {
    public String evaluate(String s, List<List<String>> kn) {
        

       StringBuilder str1 = new StringBuilder();
       StringBuilder str2 = new StringBuilder();
        
        HashMap<String,String> map = new HashMap<>();

        for(List<String> sx : kn){
            map.put(sx.get(0),sx.get(1));
        }

       boolean f=false;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                f=true;
            }else if(ch==')'){
                if(map.containsKey(str1.toString())){
                    str2.append(map.get(str1.toString()));
                }else{
                    str2.append("?");
                }
                f=false;
                str1.setLength(0);
            }else if(f){
                str1.append(ch);
            }else{
                str2.append(ch);
            }

        }

     return str2.toString();
            
    }

}