class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        

            List<Integer> list = new ArrayList<>();
            
            for(int i=1;i<=9;i++){
                 int num=i;
                int nx=i+1;

                while(num<=high && nx<=9){
                    num=num*10+nx;
                    if(num>=low && num<=high){
                        list.add(num);
                    }
                    nx++;
                }
            } 
            Collections.sort(list);
        
        return list;


    }

  


}