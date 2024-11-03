class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }

        for(int x: map.values()) set.add(x);
            

        return set.size() == map.size();
        
        
        
    }
}