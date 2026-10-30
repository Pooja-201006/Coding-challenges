class Solution {
    public int countKeyChanges(String s) {
        String str=s.toLowerCase();
        int count=0;
        for(int i=s.length()-1;i>0;i--)
        {
            if(str.charAt(i)!=str.charAt(i-1))
            {
                count++;
            }
        }
        return count;
    }
}
