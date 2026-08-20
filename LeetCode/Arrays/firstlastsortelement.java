class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++)
            {
                if(target==nums[i])
                {
                     if(first==-1)
                     {
                         first=i;
                     }
                     last=i;
                }
            }
        return new int[] {first,last};
    }
}
binary search method:
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=search(nums,target,true);
      int last=search(nums,target,false);
      return new int[]{first,last} ;
   }
public int search(int[] nums,int target,boolean isfirst)
    {
       int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
            {
             int mid=low+(high-low)/2;
                if(nums[mid]==target)
                {
                    ans=mid;
                    if(isfirst)
                    {                                      high=mid-1;
                     }
                    else
                        low=mid+1;

                }
                else if(nums[mid]>target)
                {
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
        
       return ans;
        
}

}