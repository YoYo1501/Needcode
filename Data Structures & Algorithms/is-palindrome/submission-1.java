class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int r = s.length() - 1;
        for(int l = 0; l < s.length(); l++){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;


        }
        return true;


    }
}
