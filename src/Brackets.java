import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("[({({[]})})]"));
        System.out.println(isBalanced("[([)"));
    }

    public static boolean isBalanced(String expression) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if(c == '[' || c == '(' || c == '{' ) {
                    stack.push(c);
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if(c == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }

            }
            return stack.isEmpty();
        }
}