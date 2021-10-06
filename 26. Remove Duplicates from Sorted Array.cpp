class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int cnt=nums.size();
        
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i-1]==nums[i])
            {
                cnt--;
                nums[i-1]=101;
            }
        }
        
        sort(nums.begin(),nums.end());
        return cnt;
    }
};
