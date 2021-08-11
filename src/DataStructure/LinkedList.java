package DataStructure;

public class LinkedList {

    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null)  head = node;
        else{
            Node n;
            n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        if(head==null) System.out.println("-1");
        else{
            Node n;
            n = head;
            while(n.next!=null){
                System.out.println(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int data, int index){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        int i = 0;
        if(index==0)    insertAtStart(data);
        else{
            while(n.next!=null && i<index-1){
                n = n.next;
                i++;
            }
            node.next = n.next;
            n.next = node;
        }
    }
}
