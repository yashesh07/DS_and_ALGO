package Assignment4;

public class DriverArray {
    public static void main(String[] args) {
        QueueArray<String> q = new QueueArray<>(5);

        // Inserting 5 element in the queue
        q.enQueue("Bat Man");
        q.enQueue("Joker");
        q.enQueue("Wonder Woman");
        q.enQueue("Cyborg");
        q.enQueue("Black Canary");

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

        //Now we will try to insert elements more than it's size

        q.enQueue("Hawk Man");
        q.enQueue("Cat Woman");
        q.enQueue("Lois Lane");
        q.enQueue("Mr. Freeze");
        q.enQueue("Flash");
        q.enQueue("Super Man");

    }
}
