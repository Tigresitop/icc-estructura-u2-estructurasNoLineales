package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

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

    // Metodo para imprimir el grafo
    public void printGraph() {
        for(NodeG nodeG : nodes) {
            System.out.print("Vertice " + nodeG.getValue()+":");
            for(NodeG nei : nodeG.getNeighbors()) {
                System.out.print(nei.getValue() + " - ");
            }
            System.out.println();
        }
    }

    public void getDFS(NodeG startNode) {
        
    }

    /*private void getDFSUtil(NodeG node, boolean[] visited) {

    }

    public void getBFS(NodeG startNode) {

    }

    public int getAdjacencyMatrix() {

    }

    public void printAdjacencyMatrix() {

    }*/
}
