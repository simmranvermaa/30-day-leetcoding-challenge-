class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        //System.out.println(n);
        int i=0; int j=0;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
            nums[j++]=nums[i];
            }
        }
        while(j<n){
            nums[j++]=0;
        }

    }
}
