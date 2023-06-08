public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            add(newNode, root);
        }
    }

    private void add(Node newNode, Node currentNode) {
        if (newNode.data < currentNode.data) {
            if (currentNode.left == null) {
                currentNode.left = newNode;
            } else {
                add(newNode, currentNode.left);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newNode;
            } else {
                add(newNode, currentNode.right);
            }
        }
    }

    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(Node currentNode) {
        if (currentNode != null) {
            System.out.print(currentNode.data + " ");
            printPreorder(currentNode.left);
            printPreorder(currentNode.right);
        }
    }

    public void printInorder() {
        printInorder(root);
    }

    private void printInorder(Node currentNode) {
        if (currentNode != null) {
            printInorder(currentNode.left);
            System.out.print(currentNode.data + " ");
            printInorder(currentNode.right);
        }
    }

    public void printPostorder() {
        printPostorder(root);
    }

    private void printPostorder(Node currentNode) {
        if (currentNode != null) {
            printPostorder(currentNode.left);
            printPostorder(currentNode.right);
            System.out.print(currentNode.data + " ");
        }
    }
}
