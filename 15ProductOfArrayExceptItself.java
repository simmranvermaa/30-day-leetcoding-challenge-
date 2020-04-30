class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr=1;
        int count=0;int nz=0;
        for(int i=0;i<nums.length;i++)
        {    if(nums[i]!=0)
        {pr*=nums[i];
        nz=1;}
            else count+=1;
        }
        if(nz==0)pr=0;
        if(count>1) pr=0;
        int[] output=new int[nums.length];
        for(int i=0;i<output.length;i++){
            if(count==1 && nums[i]!=0)
                output[i]=0;
            else if(nums[i]==0)
                output[i]=pr;
            else
                output[i]=pr/nums[i];
        }
        return output;
        
    }
}
