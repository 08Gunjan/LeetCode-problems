class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int flag=0;
        for(int i=0; i<nums.length-1; i++) {
            int j = i+1;
            while(j<nums.length) {
                if(nums[i]+nums[j] == target) {
                    arr[0]=i;
                    arr[1]=j;
                    flag=1;
                    break;
                 }
                 j++; 
             }  
            if(flag==1)
            break;
        }
        return arr;
    }
}