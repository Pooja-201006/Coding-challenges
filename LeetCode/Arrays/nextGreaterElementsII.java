class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer > stack=new Stack<>();
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=n*2-1;i>=0;i--)
        {
            int current =nums[i%n];
             while(!stack.isEmpty () && stack.peek ()<=current){
                 stack.pop();
             } 
             if(!stack.isEmpty() && i<n)
             {
                  ans[i]=stack.peek();
             }    
            stack.push (current );
        }
        return ans;
    }
}