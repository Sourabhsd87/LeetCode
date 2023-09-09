class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        int count=1;
        while(i<nums.length-1 && j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                count++;j++;
            }
        }
        return count;
    }
}
