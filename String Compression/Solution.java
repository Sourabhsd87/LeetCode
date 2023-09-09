class Solution {
    public int compress(char[] chars) {
        int index=0;
        int count=1;
        for(int i=1;i<=chars.length;i++){
            while(i < chars.length && chars[i]==chars[i-1]){
                count++;
                i++;
            }
            chars[index++] =chars[i-1];
            if(count>1){
                String s = String.valueOf(count);
                for(char c : s.toCharArray())
                {
                    chars[index++]=c;
                }
                count=1;
            }
            
        }
        return index;
    }
}
