class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        // add all the unique elements in the set 
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        // initialize maxLengthi
        int maxLength = 0;
        // check if the previous element present in the hashset or not ?
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
            int current = nums[i];
            int length = 1;

            // check if the consecutive elements are present or not 
            // if yes then increase the length also update the current elementabstract
            while (set.contains(current + 1)){
                length++;
                current++;
            }
            maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
