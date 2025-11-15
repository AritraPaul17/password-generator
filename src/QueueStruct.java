import java.util.Stack;

public class QueueStruct {
    static class Node {
        int data;
        Node next;
        public Node(int data ){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        public static Node front = null;
        public static Node rear = null;
        static boolean isEmpty(){
            if(front==null && rear==null){
                return true;
            }
            return false;
        }
        static void enQueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }
        static int deQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            if (front == rear && front!=null) {
                Node n = front;
                front = rear = null;
                return n.data;
            }
            Node n = front;
            front = n.next;
            return n.data;
        }
         static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return front.data;
        }
        static void print(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return;
            }
            Node n = front;
            while(n!=null){
                System.out.print(n.data + "->");
                n = n.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        Queue q1 = new Queue();

//        q1.enQueue(2);
//        q1.enQueue(3);
//        q1.enQueue(4);
//        q1.enQueue(5);
        q1.deQueue();
//        System.out.println(q1.peek());
        q1.print();
    }
}
