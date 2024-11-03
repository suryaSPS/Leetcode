class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        for(int a : nums1){
            s1.add(a);
        }
        for(int b : nums2){
            s2.add(b);
        }
        
        for(int x : s1){
            if(!s2.contains(x)){
                l1.add(x);
            }
        }
        for(int y : s2){
            if(!s1.contains(y)){
                l2.add(y);
            }
        }    
        
        ans.add(l1);
        ans.add(l2);


        return ans;
    }
}