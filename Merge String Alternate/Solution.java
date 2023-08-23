class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        String s = new String();
        for(int i=0;i<(arr1.length+arr2.length);i++){
            if(i<arr1.length){
                s=s+arr1[i];
            }
            if(i<arr2.length){
                s=s+arr2[i];
            }
        }
        return s;
    }
}
