class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answerArray = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++){
                if(i==j)
                    continue;
                if(nums[i]+nums[j]==target){
                    answerArray[0]=i;
                    answerArray[1]=j;
                    return answerArray;
                }

            }
        }
        return answerArray;
    }
}