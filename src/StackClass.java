public class StackClass {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack{
        static Node top = null;
        public  void push(int data){
            Node newNode = new Node(data);
            if(top==null){
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }
        public void pop(){
            if(top==null){
                System.out.println("Stack is empty.");
                return;
            }
            top = top.next;
        }
        public int peek(){
            if(top==null){
                return -1;
            }
            return top.data;
        }
        public void print(){
            if(top==null){
                System.out.println("Stack is empty.");
                return;
            }
            Node n = top;
            while(n!=null){
                System.out.print(n.data+" ");
                n = n.next;
            }
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.print();
        System.out.println();
        s.pop();
        s.print();
    }
}
