class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase().replaceAll("[\\s\\p{Punct}]+","");
        StringBuilder sb = new StringBuilder(a);
        
        if(a.equals(String.valueOf(sb.reverse()))){
            return true;
        }else{ 
            return false;
        }
    }
}
