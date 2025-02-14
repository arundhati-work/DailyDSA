// Access time complexity = O(1)
// Space complexity = O(n^2) where n = no. of nodes

package Graphs;
import java.util.*;

public class AdjacencyMatrix{

    public class Node{
        char data;

        Node(char data){
            this.data = data;
        }
    }

    public class Graph{

        int[][] matrix;
        ArrayList<Node> nodes;

        Graph(int size){
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }

        public void addNode(Node node){
            nodes.add(node);
        }

        public void addEdge(int src, int dst){
            matrix[src][dst] = 1;
        }

        public boolean checkEdge(int src, int dst){
            return (matrix[src][dst]==1);
        }

        public void print(){
            System.out.print("  ");
            for(Node node: nodes){
                System.out.print(node.data+" ");
            }
            System.out.println();
            for(int i=0; i<matrix.length; i++){
                System.out.print(nodes.get(i).data+" ");
                for (int j=0; j<matrix[i].length; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        AdjacencyMatrix m = new AdjacencyMatrix();
        Graph graph = m.new Graph(5);

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