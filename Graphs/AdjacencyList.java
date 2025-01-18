// Access Time complexity = O(n) where n = no. of nodes
// Space Complexity = O(n + e) where n = no. of nodes, e = no. of edges

package Graphs;

import java.util.*;

public class AdjacencyList {
    
    public class Node{
        char data;

        Node(char data){
            this.data = data;
        }
    }

    public class Graph{

        ArrayList<LinkedList<Node>> alist;

        Graph(){
            alist = new ArrayList<>();
        }

        public void addNode(Node node){
            LinkedList<Node> currentList = new LinkedList<>();
            currentList.add(node);
            alist.add(currentList);
        }

        public void addEdge(int src, int dst){
            LinkedList<Node> currentList = alist.get(src);
            Node destinationNode = alist.get(dst).get(0); // .get(0) to get the head of the LL
            currentList.add(destinationNode);
        }

        public boolean checkEdge(int src, int dst){
            LinkedList<Node> currentList = alist.get(src);
            Node destinationNode = alist.get(dst).get(0);

            for (Node node: currentList){
                if (node == destinationNode){
                    return true;
                }
            }
            return false;
        }

        public void print(){
            for(LinkedList<Node> currentList : alist){
                for (Node node: currentList){
                    System.out.print(node.data+" -> ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args){

        AdjacencyList m = new AdjacencyList();
        Graph graph = m.new Graph();

        graph.addNode(m.new Node('A'));
        graph.addNode(m.new Node('B'));
        graph.addNode(m.new Node('C'));
        graph.addNode(m.new Node('D'));
        graph.addNode(m.new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 0);
        graph.addEdge(1, 4);

        graph.print();
        System.out.println(graph.checkEdge(0, 1));
        System.out.println(graph.checkEdge(0, 2));

    }
}
