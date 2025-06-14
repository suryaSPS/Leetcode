class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int r = n - 1;
        int res[] = new int[2];
        
        while (l < r) {
            int curr = numbers[l] + numbers[r];
            if (curr < target) {
                l++;
            } else if (curr > target) {
                r--;
            } else {
                res[0] = l + 1;
                res[1] = r + 1;
                break;  
            }
        }
        
        return res;
    }
}
