class Solution {
    public void moveZeroes(int[] nums) {
        int end = nums.length-1;
        int [] newa = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            newa[i]=nums[i];
        }
        int j = 0 ;
        for(int i = 0;i<newa.length;i++){
            if(newa[i]!=0){
                nums[j++]=newa[i];
            }
            if(newa[i]==0){
                nums[end--]=newa[i];
            }
        }
    }
}
