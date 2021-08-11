package Assignment4;

import java.util.Arrays;

public class QueueArray <T>{

    Object [] queue;
    int front = 0, rear = -1;

    public QueueArray (int size){
        queue = new Object[size];
    }

    public void enQueue(T data){
        try{
            if(queue[(rear+1)% queue.length]!=null) throw new QueueOverFlowsException();
            else{
                queue[++rear % queue.length] = data;
            }
        }
        catch(QueueOverFlowsException e){
            e.printStackTrace();
        }
    }

    public void deQueue(){
        try{
            if(queue[front]==null)  throw new QueueUnderFlowsException();
            else{
                queue[front]=null;
                front = (front + 1) % queue.length;
            }
        }
        catch(QueueUnderFlowsException e){
            e.printStackTrace();
        }
    }

    public Object peek() {

        if(isEmpty())   return null;
        else    return queue[front];

    }

    public int size(){
        if(isEmpty())   return 0;
        else{
            if(rear>front)  return rear - front + 1;
            else    return queue.length - front + rear + 1;
        }
    }

    public boolean isEmpty(){
        return queue[front]==null;
    }

    public String toString(){

        if(isEmpty())   return null;
        else{
            Object [] temp = new Object[size()];
            for(int i = 0; i<size(); i++){
                temp[i] = queue[(front + i) % queue.length];
            }
            return Arrays.toString(temp);
        }
    }
}
