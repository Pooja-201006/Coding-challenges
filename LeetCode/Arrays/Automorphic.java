class Solution {
    public String isAutomorphic(int n) {
        // code here
        int s=n*n;
        int temp=n;
        int power=1;
        while(temp>0)
        {
            power*=10;
            temp/=10;
        }
        if(s%power==n)
        {
            return "Automorphic";
        }
        else 
        {
            return "Not Automorphic ";
        }
    }
}