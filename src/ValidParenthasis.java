import java.util.Stack;

public class ValidParenthasis {
    public static boolean isValid(String s) {
        Stack<Character> p = new Stack<>();
        int length = s.length();
        for(int i=0;i<length;i++){
            if(s.charAt(i)=='('){
                p.push('(');
            }
            else if (s.charAt(i)=='{') {
                p.push('{');
            }
            else if (s.charAt(i)=='[') {
                p.push('[');
            }
            else{
                if(p.empty()){
                    return false;
                }
                if (s.charAt(i)==')') {
                    if(p.peek() == '('){
                        p.pop();
                    }else {
                        return false;
                    }
                }
                else if (s.charAt(i)=='}') {
                    if(p.peek() == '{'){
                        p.pop();
                    }else {
                        return false;
                    }
                }
                else if (s.charAt(i)==']') {
                    if(p.peek() == '['){
                        p.pop();
                    }else {
                        return false;
                    }
                }
            }

        }
        if(p.empty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){[]}"));
    }
}
