package graph;




import java.util.LinkedList;
import java.util.Scanner;

class Edge{
	private int  src;
	private int dest;
	private int wt;
	
	public Edge( int  src,int dest,int wt) {
		super();
		this.src=src;
		this.dest=dest;
		this.wt=wt;
	}

	@Override
	public String toString() {
		return String.format("[%s -> %s (%s)]",src,dest,wt);
	}
	
}
public class Graph_AdjList_WtdGraph {

	private int vertCount,edgeCount;
	private LinkedList<Edge>  []adjlist;
	
	public Graph_AdjList_WtdGraph(int vertexCount) {
         this.vertCount=vertexCount;
         edgeCount=0;
         adjlist=new LinkedList[vertexCount];
         
         for(int i=0;i< vertCount;i++) {
        		 adjlist[i]=new LinkedList<Edge>();
        		 
        		 
        	 }
         
         }
	public void accept(Scanner sc) {
		System.out.println("Enter number of edges: ");
		edgeCount = sc.nextInt();

		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter edges (src dest ): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt=sc.nextInt();
			adjlist[src].add(new Edge(src, dest, wt));
			adjlist[dest].add(new Edge(dest, src, wt)); //for directed graph delete this line

			}
	}
	public void display() {
   	 
		for(int v=0;v<vertCount;v++) {
			System.out.print("vert "+ v+ " ");
			for(Edge e: adjlist[v]) {
				System.out.print(e+ " -> ");
				
			}
			System.out.println();
		}
    }

}
class Graph_AdjList_WtdGraphMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of vertices: ");
		int vertCount = sc.nextInt();
		Graph_AdjList_WtdGraph ad = new Graph_AdjList_WtdGraph(vertCount);
		ad.accept(sc);
		ad.display();
		sc.close();
	}
}