public class Main {
    public static void main(String[] args) {
        //Aniadir elementos al arbol
        BinaryTree tree = new BinaryTree();
        tree.add(5); //Raiz
        tree.add(2);
        tree.add(7);
        tree.add(4);
        tree.add(1);
        tree.add(6);

        //Imprimir recorrido Preorder
        System.out.println("Preorder: ");
        tree.printPreorder();
        System.out.println();

        //Imprimir recorrido Inorder
        System.out.println("Inorder: ");
        tree.printInorder();
        System.out.println();

        //Imprimir recorrido Postorder
        System.out.println("Postorder: ");
        tree.printPostorder();
        System.out.println();
    }
}