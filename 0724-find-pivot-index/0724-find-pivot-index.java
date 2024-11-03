class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int total = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            total += nums[i];
        }

        for(int i = 0;i<n;i++){
            total -= nums[i];
            if(leftsum == total) return i;
            leftsum += nums[i];
        }
        

        return -1;
    }
}