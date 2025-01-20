package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeG addNode(int value) {
        NodeG nodeG = new NodeG(value);
        nodes.add(nodeG);
        return nodeG;

    }

    // Metodo para agregar una arista
    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbors(dest);
        dest.addNeighbors(src);

    }

    public void addEdgeUni(NodeG src, NodeG dest) {
        src.addNeighbors(dest);

    }

    // Metodo para imprimir el grafo
    public void printGraph() {
        for(NodeG nodeG : nodes) {
            System.out.print("Vertice " + nodeG.getValue()+":");
            for(NodeG nei : nodeG.getNeighbors()) {
                System.out.print(nei.getValue() + " - > ");
            }
            System.out.println();
        }
    }

    public void getDFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el node " + start.getValue() + ":");
        getDFSUtil(start, visitados);
        System.out.println();
    }

    private void getDFSUtil(NodeG start, Set<NodeG> visitados) {
        if (visitados.contains(start)) {
            return;
            
        }

        System.out.print(start.getValue() + " ");
        visitados.add(start);

        for (NodeG neighbor : start.getNeighbors()) {
            getDFSUtil(neighbor, visitados);
        }
    }

    public void getBFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        Queue<NodeG> cola = new LinkedList<>();

        System.out.println("BFS desde el nodo " + start.getValue() + ":");
        cola.add(start);
        visitados.add(start);

        while (!cola.isEmpty()) {
            NodeG actual = cola.poll();
            System.out.print(actual.getValue() + " ");

            for (NodeG neighbor : actual.getNeighbors()) {
                if (!visitados.contains(neighbor)) {
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
        }
    }

    private boolean getDFS(NodeG node, NodeG dest, Set<NodeG> visitados) {
        if (node == dest) {
            System.out.print(node.getValue() + " ");
            return true;
        }

        visitados.add(node);
        System.out.print(node.getValue() + " ");

        for (NodeG neighbor : node.getNeighbors()) {
            if (!visitados.contains(neighbor)) {
                if (getDFS(neighbor, dest, visitados)) {
                    return true;
                }
            }
        }

        return false;
    }
}



    /*public int getAdjacencyMatrix() {

    }

    public void printAdjacencyMatrix() {

    }*/

