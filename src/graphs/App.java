package graphs;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	/*
	   				 		0
	   				 	/	|   \
	   				 1		2	   3
	   				/  \    |      |
	   			  4	    5   6      7
 				  |    / \   \    /  \
	   			  8   9  10  11  12   13

	*/
	
	public static void main(String[] args) {
		//Initialize vertices
		Vertex zero = new Vertex(0);
		Vertex one = new Vertex(1);
		Vertex two = new Vertex(2);
		Vertex three = new Vertex(3);
		Vertex four = new Vertex(4);
		Vertex five = new Vertex(5);
		Vertex six = new Vertex(6);
		Vertex seven = new Vertex(7);
		Vertex eight = new Vertex(8);
		Vertex nine = new Vertex(9);
		Vertex ten = new Vertex(10);
		Vertex eleven = new Vertex(11);
		Vertex twelve = new Vertex(12);
		Vertex thirteen = new Vertex(11);
		
		//Add edge nodes to map
		List<Vertex> edgesZero = new ArrayList<Vertex>();
		edgesZero.add(one);
		edgesZero.add(two);
		edgesZero.add(three);
		zero.setEdgeNodes(edgesZero);
		
		List<Vertex> edgesOne = new ArrayList<Vertex>();
		edgesOne.add(zero);
		edgesOne.add(four);
		edgesOne.add(five);
		one.setEdgeNodes(edgesOne);
		
		List<Vertex> edgesTwo = new ArrayList<Vertex>();
		edgesTwo.add(zero);
		edgesTwo.add(six);
		two.setEdgeNodes(edgesTwo);
		
		List<Vertex> edgesThree = new ArrayList<Vertex>();
		edgesThree.add(zero);
		edgesThree.add(seven);
		three.setEdgeNodes(edgesThree);
		
		List<Vertex> edgesFour = new ArrayList<Vertex>();
		edgesFour.add(one);
		edgesFour.add(eight);
		four.setEdgeNodes(edgesFour);
		
		List<Vertex> edgesFive = new ArrayList<Vertex>();
		edgesFive.add(one);
		edgesFive.add(nine);
		edgesFive.add(ten);
		five.setEdgeNodes(edgesFive);
		
		List<Vertex> edgesSix = new ArrayList<Vertex>();
		edgesSix.add(eleven);
		edgesSix.add(two);
		six.setEdgeNodes(edgesSix);
		
		List<Vertex> edgesSeven = new ArrayList<Vertex>();
		edgesSeven.add(three);
		edgesSeven.add(twelve);
		edgesSeven.add(thirteen);
		seven.setEdgeNodes(edgesSeven);
		
		//BFS
		//BFSGraph bfs = new BFSGraph();
		//bfs.breadthFirstSearch(three);
		//System.out.println();
		
		//DFS
		//DFSGraph dfs = new DFSGraph();
		//dfs.dfs(zero);
		
		//IDDFS
		IDDFS iddfs = new IDDFS(six);
		iddfs.runAlgorithm(zero);
	}

}
