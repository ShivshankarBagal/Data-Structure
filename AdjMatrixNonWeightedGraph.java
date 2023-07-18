package graph;

import java.util.Scanner;

public class AdjMatrixNonWeightedGraph {

	 private int vertCount;
	 private int edgeCount;
	 private int [][] adjmat;
	 
	 public AdjMatrixNonWeightedGraph( int vertexCount) {
		edgeCount=0;
		 this.vertCount=vertexCount;
		 adjmat=new int [vertCount][vertCount];
		 
		 for(int i=0;i <vertCount;i++) {
			 for(int j=0;j< vertCount;j++) {
				 adjmat[i][j]=0;
			 }
		 }
	}
	
	 public void accept(Scanner sc) {
		 System.out.println("Enter number of edges: ");
		 edgeCount=sc.nextInt();
		 
		 for(int i=0;i <edgeCount;i++) {
			 System.out.print("Enter edges (src dest): ");
			 int src=sc.nextInt();
			 int dest=sc.nextInt();
			 adjmat[src][dest]=1;
			 adjmat[dest][src]=1; //delete this line for directed graph
			 
			 
			 
		 }
		 
	 }
	 public void display() {
		 System.out.println("\n AdjecancyMatrix");
		 
		 for(int i=0;i < vertCount;i++) {
			 for(int j=0;j< vertCount;j++) {
				 
				 System.out.print(adjmat[i][j]+"\t");
				 
			 }
			 System.out.println();
		 }
		 
	 }
	 
	
}
  class AdjMatrixNonWeightedGraphMain{
	 
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number of vertices: ");
		 int vertCount=sc.nextInt();
		 AdjMatrixNonWeightedGraph ad=new AdjMatrixNonWeightedGraph(vertCount);
		 ad.accept(sc);
		 ad.display();
		 sc.close();
	}
	 
 }
