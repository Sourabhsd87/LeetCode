class Solution {
    public String removeStars(String s) {
        Stack<String> a= new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                a.pop();
            }
            else{
                a.push(String.valueOf(s.charAt(i)));
            }
        }
        while(!a.isEmpty()){
            sb.append(a.pop());
        }
        return String.valueOf(sb.reverse());
    }
}
