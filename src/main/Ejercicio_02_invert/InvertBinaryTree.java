package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node right = invertTree(root.getRight());
        Node left = invertTree(root.getLeft());
        root.setLeft(right);
        root.setRight(left);
        return root;
    }


}
