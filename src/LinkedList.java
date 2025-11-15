public class LinkedList {
    Node head = null;
    public  int size = 0;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
//node add - first nad last
    public void addFirst(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            return;
        }
        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        n.next = newNode;
    }

    public String deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return "Null";
        }
        size--;
        Node n = head;
        head = n.next;
        return  n.data;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node n = head;
        Node prev = head;
        while(n.next!=null){
            prev = n;
            n = n.next;
        }
        prev.next = null;
    }

//    print linked list
    public void printLl(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node n = head;
        while(n!=null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
//        Node head = null;
        list1.addFirst("is");
        list1.addFirst("This");
        list1.addLast("a");
        list1.addLast("Linked List");
        list1.addLast("programme");
        list1.printLl();
//        list1.deleteLast();
//        list1.deleteFirst();
        list1.printLl();
        System.out.println(list1.size);
    }
}
