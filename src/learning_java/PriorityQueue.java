package learning_java;

public class PriorityQueue {

    Node head;

    public void insert(String data, int priority){
        Node node = new Node();
        node.data = data;
        node.priority = priority;
        node.next = null;
        if(head==null || priority<head.priority){
             node.next = head;
             head = node;
        }
        else{
            Node temp;
            temp = head;
            while(temp.next!=null && temp.next.priority<=node.priority){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void display(){
        if(head==null) System.out.println("Queue is Empty");
        else{
            Node temp;
            temp = head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void remove(){
        Node temp;
        temp = head;
        head = temp.next;
    }

    public String peek(){
        if(head==null) return "Queue is Empty !!";
        else return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        if(head==null) return 0;
        else{
            int i = 1;
            Node temp;
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
                i++;
            }
            return i;
        }
    }
}
