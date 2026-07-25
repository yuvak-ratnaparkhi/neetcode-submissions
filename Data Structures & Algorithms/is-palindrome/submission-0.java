class Solution {
    public boolean isPalindrome(String s) {
        // convert string into 
        // lowercase 
        // regrex function remove extra space and non-alphanumeric values 
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            } else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}