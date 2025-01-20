
import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLeves;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Graph;
import main.Materia.Models.Node;
import main.Materia.Models.NodeG;

public class App {
    public static void main(String[] args) throws Exception {
        //runArbolBinario();
        //runArbolAvl();

        //runEjercicio01();
        //runEjercicio02();
        //runEjercicio3();
        //runEjercicio04();
        runGraph();
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

    public static void runGraph() {
        
        Graph grafo = new Graph();
        //NodeG N5 = grafo.addNode(5);
        //NodeG N7 = grafo.addNode(7);
        //NodeG N9 = grafo.addNode(9);
        //NodeG N11 = grafo.addNode(11);
        //NodeG N3 = grafo.addNode(3);

        //grafo.addEdge(N5, N7);
        //grafo.addEdge(N5, N3);
        //grafo.addEdge(N7, N9);
        //grafo.addEdge(N9, N5);
        //grafo.addEdge(N9, N3);
        //grafo.addEdge(N3, N11);

        //grafo.printGraph();

        
        

        NodeG node0 = grafo.addNode(0);
        NodeG node1 = grafo.addNode(1);
        NodeG node2 = grafo.addNode(2);
        NodeG node3 = grafo.addNode(3);
        NodeG node4 = grafo.addNode(4);
        NodeG node5 = grafo.addNode(5);
        NodeG node6 = grafo.addNode(6);
        NodeG node7 = grafo.addNode(7);

        System.out.println("NO DIRECCIONAL:");
        grafo.addEdge(node0, node3);
        grafo.addEdge(node0, node5);
        grafo.addEdge(node3, node2);
        grafo.addEdge(node3, node4);
        grafo.addEdge(node4, node1);
        grafo.addEdge(node2, node1);
        grafo.addEdge(node1, node0);

        grafo.printGraph();
        System.out.println();

        Graph grafo2 = new Graph();

        NodeG g2node0 = grafo2.addNode(0);
        NodeG g2node1 = grafo2.addNode(1);
        NodeG g2node2 = grafo2.addNode(2);
        NodeG g2node3 = grafo2.addNode(3);
        NodeG g2node4 = grafo2.addNode(4);
        NodeG g2node5 = grafo2.addNode(5);
        

        System.out.println("DIRECCIONAL:");
        grafo.addEdgeUni(g2node0, g2node3);
        grafo.addEdgeUni(g2node0, g2node5);
        grafo.addEdgeUni(g2node3, g2node2);
        grafo.addEdgeUni(g2node3, g2node4);
        grafo.addEdgeUni(g2node4, g2node1);
        grafo.addEdgeUni(g2node2, g2node1);
        grafo.addEdgeUni(g2node1, g2node0);
        
        grafo2.printGraph();
        System.out.println();

        System.out.println("NO DIRECCIONAL:");
        grafo.getDFS(node0);
        grafo.getBFS(node0);
        System.out.println();

        System.out.println("\nDIRECCIONAL:");
        grafo2.getDFS(g2node0);
        grafo2.getBFS(g2node0);

        // Agregar aristas
        grafo.addEdge(node0, node3);
        grafo.addEdge(node0, node5);
        grafo.addEdge(node3, node2);
        grafo.addEdge(node3, node4);
        grafo.addEdge(node4, node1);
        grafo.addEdge(node1, node7);
    

        System.out.println("Grafo:");
        grafo.printGraph();
        System.out.println();
    
        

        
    }

    public static void printTree(Node node, int level) {
        if (node != null) {
            printTree(node.getRight(), level + 1);
            System.out.println(" ".repeat(level * 4) + node.getValue());
            printTree(node.getLeft(), level + 1);
        }
    }
}