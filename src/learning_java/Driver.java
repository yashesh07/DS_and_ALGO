package learning_java;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        System.out.println(pq.isEmpty());
        pq.insert("Yashesh", 5);
        pq.insert("Dev", 2);
        pq.insert("Suraj", 3);
        pq.insert("Omkar", 7);
        pq.insert("Kapil", 10);
        pq.insert("Kapil2", 0);
        pq.insert("Jenish", 6);
        pq.insert("sid", 6);
        pq.insert("Rajat", 0);
        pq.insert("Aditya", 1);
        System.out.println("\n");
        pq.display();
        System.out.println("\n");
        pq.remove();
        pq.remove();
        pq.remove();
        pq.remove();
        System.out.println(pq.peek());
        System.out.println("\n");
        System.out.println(pq.size());
        System.out.println("\n");
        pq.display();
    }
}
