package Assignment3;

public class Driver {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //push method
        stack.push("Spider Man");
        stack.push("Iron Man");
        stack.push("Hulk");
        //peek method
        System.out.println(stack.peek());
        //show method
        stack.show();
        //size method
        System.out.println(stack.size());
        //pop method
        stack.pop();
        stack.pop();
        stack.pop();
        //empty method
        System.out.println(stack.isEmpty());
        //Stack underflow exception
        stack.pop();

    }
}
