package Trees;

import java.util.Scanner;

public class Manipulation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        System.out.print("Enter Tree Elements: ");
        String s = sc.nextLine();
        bt.insert(s);
        bt.inorder();
        bt.preorder();
        bt.postorder();
        bt.levelOrder();
    }
}
