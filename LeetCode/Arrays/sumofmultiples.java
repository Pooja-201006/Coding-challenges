class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
            {
                if(i%3==0 | i%5==0 | i%7==0)
                {
                    sum+=i;
                }
            }
        return sum;
    }
}

class Solution {
    public int sumOfMultiples(int n) {
        return sum(n,3)+sum(n,5)+sum(n,7)-sum(n,15)-sum(n,21)-sum(n,35)+sum(n,105);
    }
    public int sum(int n,int k)
    {
         int m=n/k;
        return (m*k*(m+1))/2;
    }
}