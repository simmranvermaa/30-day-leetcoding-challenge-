import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++)
        System.out.println(nums[i]);
        if(len<2)
            return nums[0];
        for(int i=1;i<len-1;i++){
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
                return nums[i];
        }
        if(nums[len-1]!=nums[len-2])
        return nums[len-1];
        return nums[0];
    }
}
