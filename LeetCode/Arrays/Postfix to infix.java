class Solution {
    static String postToInfix(String s) {
        // code here
        Stack<String> stack=new Stack<>();
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
               result="("+a+ch+b+")";
               stack.push(result);
            }
        }
        return result;
    }
}
