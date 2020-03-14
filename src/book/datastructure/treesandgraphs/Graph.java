package book.datastructure.treesandgraphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, Node> nodeLoop = new HashMap<>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();
        public Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id) {
        return nodeLoop.get(id);
    }
    public void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node s, Node d, HashSet<Integer> visited) {
        if (visited.contains(s.id)) {
            return false;
        }
        visited.add(s.id);
        for (Node n : s.adjacent) {
            if (hasPathDFS(n, d, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination) {
        return hasPathBFS(getNode(source), getNode(destination));
    }

    private boolean hasPathBFS(Node s, Node d) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(s);
        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (node == d) {
                return true;
            }
            if (visited.contains(node.id)) {
                continue;
            }
            visited.add(node.id);
            nextToVisit.addAll(node.adjacent);
        }

        return false;
    }
}
