package Assignment4;

public class StackUsingQueue<T> {

    QueueLL<T> q = new QueueLL<>();

    public void push(T data){
        QueueLL<T> q_temp = new QueueLL<>();
        q_temp.enQueue(data);
        for(int i = 1; q.peek()!=null; i++){
            q_temp.enQueue(q.peek());
            q.deQueue();
        }
        q = q_temp;
    }

    public void pop(){
        q.deQueue();
    }

    public T peek(){
        return q.peek();
    }

    public String show(){
        return q.toString();
    }

    public int size(){
        return q.size();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

}
