class Solution {
    public boolean isPalindrome(int x) {
       
        if(x<0)
            return false;
       else{
              int org=x;
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        try{
            int rev = Integer.parseInt(s);
        if(org==rev)
            return true;
        else
            return false;
        }catch(Exception e){
            return false;
        } 
        
       }
           
       } 
}