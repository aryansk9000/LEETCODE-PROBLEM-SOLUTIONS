class Solution {
    public int missingNumber(int[] nums) {
        int N=nums.length;
        int sum1=(N*(N+1))/2;
        int sum2=0;
        for(int num:nums){
            sum2+=num;
        }
        int missingNumber=sum1-sum2;
        return missingNumber;
    }
}
