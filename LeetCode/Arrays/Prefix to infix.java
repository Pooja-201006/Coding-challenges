class Solution {
    static String preToInfix(String s) {
        // code here
        Stack<String> stack =new Stack<>();
        String result="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                stack.push(String.valueOf(ch));
            }
            else
            {
                String a=stack.pop();
                String b=stack.pop();
                result="("+a+ch+b+")";
                stack.push(result);
            }
        }
        return result;
    }
}
