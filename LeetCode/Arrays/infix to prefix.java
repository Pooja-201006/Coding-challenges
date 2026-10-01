class Solution {
    static String infixToPrefix(String s) {
        // code here
        Stack<Character > stack=new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character. isLetterOrDigit(ch))
            {
                result. append(ch);
                
            }
            else if(ch==')')
            {
                stack.push(ch);
            }
            else if(ch=='(')
            {
                while(!stack.isEmpty() && stack.peek()!=')'){
                    result. append (stack.pop());
                }
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if(isOperator(ch))
            {
                while(!stack.isEmpty() && stack.peek()!=')' && (precedence(ch)<precedence(stack.peek()) || (precedence(ch)==precedence(stack.peek()) && ch=='^'))){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
            while(!stack.isEmpty())
            {
                result. append(stack. pop());
            }
            
        
        return result. reverse ().toString();
    }
        static int precedence (char ch)
        {
            if(ch=='^')
            {
                return 3;
            }
            if(ch=='*' || ch=='/')
            {
                return 2;
            }
            if(ch=='+' || ch=='-' )
            {
                return 1;
            }
            
                return 0;
        }
    static boolean isOperator(char ch)
    {
        return ch=='^' || ch=='/' || ch=='*' || ch=='+' || ch=='-';
    }
    
}