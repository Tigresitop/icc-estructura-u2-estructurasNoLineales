
import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLeves;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        //runArbolAvl();

        runEjercicio01();
        runEjercicio02();
        runEjercicio3();
        runEjercicio04();
    }
    
    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        
        

        //Ingresar cada valor al arbol
        for (int i = 0; i < valores.length; i++){
        arbolBinario.insert(valores[i]);
        }
        
        System.out.println();
        arbolBinario.printTree();

        System.out.println(  );
        System.out.println("Recorrido PreOrder");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido PostOrder");
        arbolRecorridos.postOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido InOrder");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
    }

    public static void runEjercicio01() {
        System.out.println("EJERCICIO 01:");
        System.out.println("Input: [5, 3, 7, 2, 4, 6, 8]");
        InsertBSTTest bst = new InsertBSTTest();
        Node root = null;
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        for (int value : values) {
            root = bst.insert(root, value);
        }
        System.out.println("Output:");
        printTree(root, 0);
        System.out.println("===========================================================================");
    }

    public static void runEjercicio02() {
        System.out.println("EJERCICIO 02:");
        System.out.println("Input:");
        InsertBSTTest bst = new InsertBSTTest();
        Node root = null;
        int[] values = {4, 2, 7, 1, 3, 6, 9};
        for (int value : values) {
            root = bst.insert(root, value);
        }
        printTree(root, 0);

        InvertBinaryTree invert = new InvertBinaryTree();
        root = invert.invertTree(root);
        System.out.println("Output:");
        printTree(root, 0);
        System.out.println("===========================================================================");
    }


    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLeves listLeves = new ListLeves();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }

        System.out.println();
        System.out.println("Listas por Nivel:");
        listLeves.imprimirListasPorNivel(listLeves.ListLeves(arbolBinario.getRoot()));
        System.out.println("===========================================================================");
    }

    public static void runArbolAvl() {
        
        int[] values = {15, 20, 10, 24, 9, 8, 21, 23, 50, 25};

        ArbolAVL arbolAVL = new ArbolAVL();
        
        System.out.println("Insertando nodos en el árbol AVL...");

        for (int value : values) {
            arbolAVL.insert(value);
        }

        System.out.println("Árbol AVL después de todas las inserciones:");
        arbolAVL.printTree(arbolAVL.getRoot(), "", true);
    }

    public static void runEjercicio04() {
        System.out.println("EJERCICIO 04:");
        System.out.println("Input:");
        InsertBSTTest bst = new InsertBSTTest();
        Node root = null;
        int[] values = {7, 4, 2, 1, 3, 8};
        for (int value : values) {
            root = bst.insert(root, value);
        }
        printTree(root, 0);

        Depth depth = new Depth();
        int maxDepth = depth.maxDepth(root);
        System.out.println("Output: " + maxDepth);
        System.out.println("===========================================================================");
    }

    public static void printTree(Node node, int level) {
        if (node != null) {
            printTree(node.getRight(), level + 1);
            System.out.println(" ".repeat(level * 4) + node.getValue());
            printTree(node.getLeft(), level + 1);
        }
    }
}
