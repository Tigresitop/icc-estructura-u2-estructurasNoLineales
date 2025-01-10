package main.Ejercicio_03_listLeves;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import main.Materia.Models.Node;

    /*
     * Implementa un algoritmo que devuelva una lista enlazada
     * con los nodos de cada nivel .Si el arbol tiene 
     * N niveles debe devolver N listas enlazadas.
     * 
     * Ejemplo:
     * Input:
     *      4
     *    2   7
     *   1 3 6 9
     * 
     * Output:
     * 4 
     * 2 -> 7
     * 1 -> 3 -> 6 -> 9
     */

public class ListLeves {

    public List<LinkedList<Node>> ListLeves(Node root) {
        List<LinkedList<Node>> resultado = new ArrayList<>();

        if (root == null) {
            return resultado; 
        }

        LinkedList<Node> nivelActual = new LinkedList<>();
        nivelActual.add(root);

        while (!nivelActual.isEmpty()) {
            resultado.add(new LinkedList<>(nivelActual)); 
            LinkedList<Node> nivelSiguiente = new LinkedList<>();
            
            for (Node nodo : nivelActual) {
                if (nodo.getLeft() != null) {
                    nivelSiguiente.add(nodo.getLeft());
                }
                if (nodo.getRight() != null) {
                    nivelSiguiente.add(nodo.getRight());
                }
            }
            nivelActual = nivelSiguiente; 
        }

        return resultado;
    }

    public void imprimirListasPorNivel(List<LinkedList<Node>> listas) {
        
    }
}
