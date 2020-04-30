class Solution {
    public static int max(int a, int b){
        if(a>b)
            return a;
        else return b;
    }
    public int maxSubArray(int[] nums) {
        int sum=nums[0]; int curr_sum=sum;
        for(int i=1;i<nums.length;i++){
            curr_sum=max(nums[i], nums[i]+curr_sum);
            sum=max(sum,curr_sum);
        }
        return sum;
        
    }
}
