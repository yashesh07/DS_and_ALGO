package Assignment3;

public class StackUnderFlowsException extends Exception{

    public String toString(){
        return "Cannot pop element from empty stack.";
    }
}
