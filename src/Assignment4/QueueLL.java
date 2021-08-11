package Assignment4;

import java.util.Arrays;

public class QueueLL<T> {

    Node<T> head;

    public void enQueue(T data){
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        if(head==null)  head = node;
        else{
            Node<T> temp;
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void deQueue(){
        try{
            if(head==null)  throw new QueueUnderFlowsException();
            else{
                Node<T> temp = head;
                head = temp.next;
            }
        }
        catch(QueueUnderFlowsException e){
            e.printStackTrace();
        }
    }

    public T peek(){
        if(head==null)  return null;
        else return head.data;
    }

    public int size(){
        if(head==null)  return 0;
        else{
            Node<T> temp;
            temp = head;
            int i = 1;
            while(temp.next!=null){
                temp = temp.next;
                i++;
            }
            return i;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

    public String toString(){

        if(isEmpty()) return null;
        else{
            String [] arr = new String[size()];
            Node<T> temp;
            temp = head;
            for(int i = 0; i<size(); i++){
                arr[i] = temp.data.toString();
                temp = temp.next;
            }
            return Arrays.toString(arr);
        }

    }
}
