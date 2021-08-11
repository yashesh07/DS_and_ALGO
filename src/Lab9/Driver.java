package Lab9;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(15);
        bst.insert(9);
        bst.insert(19);
        bst.insert(18);
        bst.insert(16);
        bst.insert(20);
        bst.insert(34);
        bst.insert(74);
        bst.insert(11);
        bst.insert(2);
        bst.insert(1);
        bst.insert(52);
        bst.insert(21);
        bst.insert(33);
        bst.insert(10);
        bst.insert(0);
        bst.insert(3);
        bst.insert(7);
        bst.insert(70);
        bst.insert(722);
        bst.insert(711);
        bst.insert(472);
        bst.insert(417);
        bst.insert(6);
        bst.insert(8);

        System.out.println(bst.search(18));

        bst.preOrderTraversal();
        System.out.println();
        bst.inOrderTraversal();
        System.out.println();
        bst.postOrderTraversal();
        System.out.println();

        System.out.println(bst.height());

        System.out.print("\nBefore deletion: ");
        bst.inOrderTraversal();
        bst.delete(20);
        bst.delete(9);
        System.out.print("\nAfter deletion: ");
        bst.inOrderTraversal();

        System.out.println();

        bst.delete(77);

        System.out.println(bst.countLeaves());

        System.out.println(bst.countNodes());

        System.out.println(bst.invert());

    }
}
