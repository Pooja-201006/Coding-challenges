class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
            {
                int count =0;
                for(int j=0;j<n;j++)
                    {
                     if(nums[i]==nums[j])
                        {
                            count++;
                        }
                    }
 if(count>n/3 &&!result.contains(nums[i]))
                {
                  result.add(nums[i]);
               }
            }
        return result;
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])>n/3 && !list.contains(nums[i]))
            {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
