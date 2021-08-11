package Assignment3;

public class Stack<T> {

    Node<T> top;

    public void push(T data){
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        Node<T> temp;
        temp = node;
        temp.next = top;
        top = temp;
    }

    public void pop(){
        try{
            if(isEmpty())   throw new StackUnderFlowsException();
            Node<T> temp;
            temp = top;
            top = temp.next;
        }
        catch(StackUnderFlowsException e){
            e.printStackTrace();
        }
    }

    public T peek(){
            try{
                if(isEmpty())   throw new NullPointerException("Stack is Empty !!");
                else return top.data;
            }
            catch(NullPointerException e){
                e.printStackTrace();
                return null;
            }
    }

    public void show(){
        if(isEmpty()) System.out.println("Stack is Empty !!");
        else{
            Node<T> temp;
            temp = top;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public int size(){
        if(isEmpty())   return 0;
        else{
            Node<T> temp;
            temp = top;
            int i = 1;
            while(temp.next!=null){
                temp = temp.next;
                i++;
            }
            return i;
        }
    }

    public boolean isEmpty(){
        return top==null;
    }

}
