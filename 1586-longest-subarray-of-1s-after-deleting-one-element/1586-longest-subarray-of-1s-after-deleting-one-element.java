class Solution {
    public int longestSubarray(int[] nums) {
        int zero = 0;
        int res = 0;
        int left = 0;
        for(int right = 0;right < nums.length;right++){
            if(nums[right] == 0) zero++;

            while(zero == 2){
                int val = nums[left++];
                if(val == 0) zero--;
            }

            res = Math.max(res, right - left);
        }
        return res;

    }
}