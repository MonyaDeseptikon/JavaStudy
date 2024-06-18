public class MainRBT {

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 1; i <= 26; i++) {
            tree.ins(i);
        }
        System.out.println(tree.find(26));
        // System.out.println(tree.find(27));
        tree.print();
    }
}