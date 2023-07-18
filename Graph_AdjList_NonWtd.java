package graph;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph_AdjList_NonWtd {

	private int vertCount,edgeCount;
	private LinkedList<Integer>  []adjlist;
	
	public Graph_AdjList_NonWtd(int vertexCount) {
         this.vertCount=vertexCount;
         edgeCount=0;
         adjlist=new LinkedList[vertexCount];
         
         for(int i=0;i< vertCount;i++) {
        		 adjlist[i]=new LinkedList<Integer>();
        		 
        		 
        	 }
         
         }
	public void accept(Scanner sc) {
		System.out.println("Enter number of edges: ");
		edgeCount = sc.nextInt();

		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter edges (src dest ): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			//int wt=sc.nextInt();
			adjlist[src].add(dest);
			adjlist[dest].add(src); //for directed graph delete this line

			}
	}
	public void display() {
   	 
		for(int v=0;v<vertCount;v++) {
			System.out.print("vert "+ v+ " ");
			for(int dest: adjlist[v]) {
				System.out.print(dest+ " -> ");
				
			}
			System.out.println();
		}
    }

}
class Graph_AdjList_NonWtdMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of vertices: ");
		int vertCount = sc.nextInt();
		Graph_AdjList_NonWtd ad = new Graph_AdjList_NonWtd(vertCount);
		ad.accept(sc);
		ad.display();
		sc.close();
	}
}