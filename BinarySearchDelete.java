class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchDelete {
    Node root;
        public BinarySearchDelete() {
        this.root = null;
    }
       void delete(int data) {
        root = deleteNode(root, data);
    }
    Node deleteNode(Node currentNode, int data) {
        if (currentNode == null) {
            return currentNode;
        }
        if (data < currentNode.data) {
            currentNode.left = deleteNode(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = deleteNode(currentNode.right, data);
        } else {
            if (currentNode.left == null) {
                return currentNode.right;
            } else if (currentNode.right == null) {
                return currentNode.left;
            }
                currentNode.data = findMin(currentNode.right);
               currentNode.right = deleteNode(currentNode.right, currentNode.data);
        }
        return currentNode;
    }
    int findMin(Node node) {
        int minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }
    void printDelete() {
        printDelete(root);
    }
    void printDelete(Node node) {
        if (node != null) {
            printDelete(node.left);
            System.out.print(node.data + " ");
            printDelete(node.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchDelete bst = new BinarySearchDelete();
         bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.right = new Node(70);
        bst.root.right.left = new Node(60);
        bst.root.left.right = new Node(40);
        System.out.println("Before deletion:");
        bst.printDelete();
        bst.delete(70);
        System.out.println("\nAfter deletion:");
        bst.printDelete();
    }
}
