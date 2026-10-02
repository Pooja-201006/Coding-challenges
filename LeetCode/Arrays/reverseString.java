class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int left=0;
        int right=s.length-1;
        for(int i=0;i<n/2;i++)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
  }
}