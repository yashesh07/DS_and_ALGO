package Lab13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCoding {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message = scan.nextLine();

        ArrayList<UniqueCharacterFrequency> list = new ArrayList<>();

        for(int i = 0; i<message.length(); i++){
            if(i==0){
                list.add(new UniqueCharacterFrequency(message.charAt(i), 1));
                continue;
            }
            for(int j = 0; j<list.size(); j++){
                UniqueCharacterFrequency temp = list.get(j);
                if(message.charAt(i) == temp.getCharacter()){
                    temp.setFrequency(temp.getFrequency()+1);
                    break;
                }
                else if(j==list.size()-1) {
                    list.add(new UniqueCharacterFrequency(message.charAt(i), 1));
                    break;
                }
            }
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new FrequencyComparator());

        for(int i = 0; i< list.size(); i++){
            Node n = new Node();
            n.data = list.get(i);
            n.leftChild = null;
            n.rightChild = null;
            priorityQueue.add(n);
        }

        while(priorityQueue.size()>1){
            Node x = priorityQueue.peek();
            priorityQueue.poll();
            Node y = priorityQueue.peek();
            priorityQueue.poll();

            Node n = new Node();
            n.data = new UniqueCharacterFrequency(' ', x.data.getFrequency() + y.data.getFrequency());
            n.leftChild = x;
            n.rightChild = y;
            priorityQueue.add(n);
        }

        String result = "";
        printingLeaf(result, priorityQueue.poll());

    }

    public static class FrequencyComparator implements Comparator<Node>{

        @Override
        public int compare(Node o1, Node o2) {
            return o1.data.getFrequency()-o2.data.getFrequency();
        }
    }

    private static void printingLeaf(String s, Node root){
        if(root.rightChild==null && root.leftChild==null) System.out.println("\n" + root.data.getCharacter() + " : " + s);
        else{
            printingLeaf(s+0, root.leftChild);
            printingLeaf(s+1, root.rightChild);
        }
    }
}

