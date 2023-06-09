public class Main {
    public static void main(String[] args) {
        //Aniadir elementos al arbol
        BinaryTree tree = new BinaryTree();
        tree.add(5); //Root
        tree.add(2);
        tree.add(7);
        tree.add(4);
        tree.add(1);
        tree.add(6);

        //Imprimir recorridos
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