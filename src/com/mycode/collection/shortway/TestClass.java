package com.mycode.collection.shortway;

public class TestClass {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 4);
        nodeA.addDestination(nodeC, 2);

        nodeB.addDestination(nodeC, 5);
        nodeB.addDestination(nodeD, 10);

        nodeC.addDestination(nodeE, 3);

        nodeD.addDestination(nodeF, 11);
        nodeE.addDestination(nodeD, 4);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
    }
}
