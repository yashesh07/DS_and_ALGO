package Lab9;

import java.util.NoSuchElementException;

public class BinarySearchTree {

    Node root;

    public void  insert(int data){
       root = insertKey(root, data);
    }

    private Node insertKey(Node root, int key){
        if(root==null){
            Node n = new Node();
            n.data = key;
            n.leftChild = null;
            n.rightChild = null;
            return n;
        }
        if(key < root.data)  root.leftChild = insertKey(root.leftChild, key);
        else if(key > root.data)    root.rightChild = insertKey(root.rightChild, key);
        return root;
    }

    public void delete(int data){
        root = deleteKey(root, data);
    }
    
    private Node deleteKey(Node root, int key){
        if(root==null)  throw new NoSuchElementException();
        if(key>root.data)   root.rightChild = deleteKey(root.rightChild, key);
        else if(key<root.data) root.leftChild = deleteKey(root.leftChild, key);
        else{
            if(root.rightChild==null)   return root.leftChild;
            else if(root.leftChild==null)   return root.rightChild;
            root.data = inOrderSuccessor(root.rightChild);
            root.rightChild = deleteKey(root.rightChild, root.data);
        }
        return root;
    }

    private int inOrderSuccessor(Node root){
        int data = root.data;
        while(root.leftChild!=null){
            root = root.leftChild;
            data = root.data;
        }
        return data;
    }

    public Node search(int key){
        return searchKey(root, key);
    }

    private Node searchKey(Node root, int key){
        if(root == null || root.data == key)    return root;
        else if(key< root.data) return searchKey(root.leftChild, key);
        else return searchKey(root.rightChild, key);
    }

    public void preOrderTraversal(){
        pre_order_traversal(root);
    }

    private void pre_order_traversal(Node root){
        if(root!=null){
            System.out.print(root.data + "  ");
            pre_order_traversal(root.leftChild);
            pre_order_traversal(root.rightChild);
        }
    }

    public void inOrderTraversal(){
        in_order_traversal(root);
    }

    private void in_order_traversal(Node root){
        if(root!=null){
            in_order_traversal(root.leftChild);
            System.out.print(root.data + "  ");
            in_order_traversal(root.rightChild);
        }
    }

    public void postOrderTraversal(){
        post_order_traversal(root);
    }

    private void post_order_traversal(Node root){
        if(root!=null){
            post_order_traversal(root.leftChild);
            post_order_traversal(root.rightChild);
            System.out.print(root.data + "  ");
        }
    }

    public int height(){
        return finding_height(root);
    }

    private int finding_height(Node root){
        if(root==null) return 0;
        else{
            int leftHeight = finding_height(root.leftChild);
            int rightHeight = finding_height(root.rightChild);
            if (leftHeight > rightHeight)   return (leftHeight + 1);
            else    return (rightHeight + 1);
        }
    }

    public int countNodes(){
        return count_nodes(root);
    }

    private int count_nodes(Node root){
        if(root==null)   return 0;
        else    return 1 + count_nodes(root.leftChild) + count_nodes(root.rightChild);
    }

    public int countLeaves(){
        int count = 0;
        return count_leaves(root, count);
    }

    private int count_leaves(Node root, int count){
        if(root==null)  return 0;
        else if(root.leftChild==null && root.rightChild==null)   return count + 1;
        else    return count_leaves(root.leftChild, count) + count_leaves(root.rightChild, count);
    }

    public Node invert(){
        Node mRoot = root;
        return inverting(mRoot, root);
    }

    private Node inverting(Node mRoot, Node root){
        if(root==null)  return null;
        else{
            Node leftChild = inverting(mRoot.leftChild, root.leftChild);
            Node rightChild = inverting(mRoot.rightChild, root.rightChild);
            mRoot.leftChild = rightChild;
            mRoot.rightChild = leftChild;
            return mRoot;
        }
    }

}
