class Solution {
    public String sortVowels(String s) {
        
        List<Character> ans=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ans.add(ch);
            }
        }
        Collections.sort(ans);
        int id=0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str.append(ans.get(id++));
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}