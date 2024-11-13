class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countt(nums, upper) - countt(nums,lower - 1);
    }

    private long countt(int[] nums, int sum){
        long answer = 0;
        for(int i = 0,j = nums.length - 1;i<j;i++){
            while(i < j && nums[i] + nums[j] > sum) j--;
            answer += j - i;
            
        } 
        return answer;
    } 
}