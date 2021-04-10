/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;
import java.util.Stack;
/**
 *
 * @author USER
 */


public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    
    

    private Queue theQueue;
    private StackX theStack;
    
    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
        

        theQueue = new Queue(MAX_VERTS);
        theStack = new StackX();
    }
    
    public void addVertex(char label) {
        vertexList[nVerts++] = 
            new Vertex(label);
    }
    
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void display() {
        System.out.println("Adjecency:");
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < row; col++) {
                if (adjMat[row][col] == 1){
                    System.out.print(
                    vertexList[row].label + " -- " + vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }
    
    public void displayVertex(int v) {
        System.out.print(vertexList[v].label+" ");
    }
    
    
    //dfs
        public void dfs() {
        System.out.println("DFS Algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);
        
        while(!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
        
        // jika stack kosong
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
    }
    
    public int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }
    
    private void resetFlags() {
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }
    
    //bfs
        public void bfs() {
        System.out.println("BFS algorithm : ");
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
                
                int v2;
                
        while(!theQueue.isEmpty()) {
            int v1 = (int) theQueue.remove();
            while((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        
        System.out.println("");
        resetFlags();
    }
}
