package graph;

import java.util.Scanner;

public class AdjMatrixWeightedGraph {

	public static final int INF=999;
	private int vertCount;
	private int edgeCount;
	private int[][] adjmat;

	public AdjMatrixWeightedGraph(int vertexCount) {
		edgeCount = 0;
		this.vertCount = vertexCount;
		adjmat = new int[vertCount][vertCount];

		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				adjmat[i][j] = INF;
			}
		}
	}

	public void accept(Scanner sc) {
		System.out.println("Enter number of edges: ");
		edgeCount = sc.nextInt();

		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter edges (src dest weight): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt=sc.nextInt();
			adjmat[src][dest] = wt;
			adjmat[dest][src] = wt; // delete this line for directed graph

		}

	}

	public void display() {
		System.out.println("\n AdjecancyMatrix");

		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				if(adjmat[i][j] ==INF)
					System.out.print("X\t");
				else
				System.out.print(adjmat[i][j] + "\t");

			}
			System.out.println();
		}

	}

}

class AdjMatrixWeightedGraphMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of vertices: ");
		int vertCount = sc.nextInt();
		AdjMatrixWeightedGraph ad = new AdjMatrixWeightedGraph(vertCount);
		ad.accept(sc);
		ad.display();
		sc.close();
	}

}
