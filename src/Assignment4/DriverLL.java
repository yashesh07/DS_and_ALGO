package Assignment4;

public class DriverLL {
    public static void main(String[] args) {
        QueueLL<String> q = new QueueLL<>();

        // Inserting 5 element in the queue
        q.enQueue("Iron Man");
        q.enQueue("Thor");
        q.enQueue("Thanos");
        q.enQueue("Dr. Strange");
        q.enQueue("Black Widow");

        //Printing peek element
        System.out.println("Peek Element: " + q.peek());

        //Printing whole queue
        System.out.println("Queue:\n" + q);

        //Printing size
        System.out.println("Size: " + q.size());

        //Removing 3 elements from the queue
        q.deQueue();
        q.deQueue();
        q.deQueue();

        //Printing peek element again
        System.out.println("Peek Element: " + q.peek());

        //Printing whole queue again
        System.out.println("Queue:\n" + q);

        //Printing size again
        System.out.println("Size: " + q.size());

        //Removing remaining two elements
        q.deQueue();
        q.deQueue();

        //we are checking if the queue is empty or not.
        System.out.println(q.isEmpty());

        //Now queue is empty. Now we try to remove element from empty queue.
        q.deQueue();
    }
}
