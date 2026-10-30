class Solution {
    static String postToPre(String s) {
        // code here
        Stack<String> stack=new Stack();
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                stack.push(String.valueOf(ch));
            }
            else
            {
                String b=stack.pop();
                String a=stack.pop();
                result=ch+a+b;
                stack.push(result);
            }
        }
        return result;
    }
}
