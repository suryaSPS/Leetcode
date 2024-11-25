class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> count = new HashMap<>();
        
        int res = 0;

        int l = 0;
        int freq = 0;

        for(int r = 0;r<s.length();r++){
            count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
            freq = Math.max(freq,count.get(s.charAt(r)));

            while((r - l + 1) - freq > k){
                count.put(s.charAt(l) , count.get(s.charAt(l)) -1);
                l++;
            }
        res = Math.max(res, r - l + 1);
        }


        return res;
    }
}