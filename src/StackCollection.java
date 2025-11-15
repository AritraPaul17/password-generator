import java.util.Stack;

public class StackCollection {
    public static  void pushBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s,data);
        s.push(top);
    }
    public static void stackReverse(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        stackReverse(s);
        pushBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
//        pushBottom(s,1);

//        while(!s.isEmpty()){
//            System.out.print(s.peek()+" ");
//            s.pop();
//        }
//        System.out.println();
        stackReverse(s);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
