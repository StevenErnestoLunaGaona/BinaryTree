public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);

        System.out.println("Preorder: ");
        tree.printPreorder();
        System.out.println();

        System.out.println("Inorder: ");
        tree.printInorder();
        System.out.println();

        System.out.println("Postorder: ");
        tree.printPostorder();
        System.out.println();
    }
}