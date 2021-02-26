class Solution {
    public int reverse(int x) {
        
            int revNum=0;
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(x<0){
            sb.deleteCharAt(sb.length()-1);
        }
        String rev = sb.toString();
 try{
        if(x<0) {
            revNum = Integer.parseInt(rev);
             return (-1*revNum);
        }
         else{
             revNum = Integer.parseInt(rev);
               return revNum;
         }
     }
        catch(Exception e){
           return 0;  
         }
       
        
    }
}