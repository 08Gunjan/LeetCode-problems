class Solution {
    static List<String> list;
     public List<String> generateParenthesis(int n) {
         list =new ArrayList<>();
         bp(n,0,0,"");
         return list;
     }
   
    public static void bp(int n,int oc,int cc,String str) {
        if(oc==n && cc==n) {
			list.add(str);
			return;
		}
		if(oc<n) {
			bp(n,oc+1,cc,str+"(");
			
		}
		if(cc<oc) {
			bp(n,oc,cc+1,str+")");
		
		}
    }
}