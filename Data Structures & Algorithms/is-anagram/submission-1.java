class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }
        // int[] count = new int[26];
        // for(int i = 0; i < s.length(); i++){
        //     count[s.charAt(i) - 'a']++; 
        // }

        // for(int i = 0; i < t.length(); i++){
        //     count[t.charAt(i) - 'a']--;
        // }

        // for(int i = 0; i < count.length; i++){
        //     if(count[i] > 0){
        //         return false;
        //     }
        // }
        // return true;
        
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        
        for(int count : map.values()) {
            if(count > 0){
                return false;
            }
        }
        return true; 
    }
}
