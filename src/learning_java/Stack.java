package learning_java;

public class Stack {
    static final int ArrSize = 100;
    private char [] arr = new char[ArrSize];
    private int top = -1;
    boolean push (char c){
        if(top>=(ArrSize-1)){
            System.out.println("Stack Overflow.");
            return false;
        }
        else{
            arr[++top] = c;
//            System.out.println(c + " added into Stack.");
            return true;
        }
    }
    boolean pop(){
        if(top<0){
            System.out.println("Stack is empty.");
            return false;
        }
        else{
            char c = arr[top--];
//            System.out.println(c + " removed from the stack.");
            return true;
        }
    }
    char getTop(){
        if(top<0){
            System.out.println("Stack is empty.");
        }
        return arr[top];
    }
    boolean isEmpty(){
        return(top<0);
    }
    void showStack(){
        for(int i = top; i>=0; i--){
            System.out.println("[ " + arr[i] + " ]");
        }
    }
}
