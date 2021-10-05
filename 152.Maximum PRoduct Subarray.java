class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currProd = 1;
        for(int element : nums)
        {
            currProd = currProd*element;
            max = Math.max(max, currProd);
            if(currProd == 0){
                currProd = 1;
            }
            

        }
        currProd = 1;
        for(int i = nums.length-1; i>=0;i--)
        {
            currProd = currProd*nums[i];
            max = Math.max(max, currProd);
            if(currProd == 0){
                currProd = 1;
            }
        }
        return max;
    }
}
