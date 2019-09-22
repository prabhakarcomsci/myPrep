package graphs;

import java.util.ArrayList;
import java.util.List;

public class BSFApp {
	
	/*
	   				 1 ---------------- 0
   					/ \
  				   /   \
 				  /     \
				 /       \
				2 ------- 3

	*/
	
	public static void main(String[] args) {
		//Initialize vertices
		Vertex one = new Vertex(1);
		Vertex two = new Vertex(2);
		Vertex three = new Vertex(3);
		Vertex zero = new Vertex(0);
		
		//Add edge nodes to map
		List<Vertex> edgesZero = new ArrayList<Vertex>();
		edgesZero.add(one);
		zero.setEdgeNodes(edgesZero);
		
		List<Vertex> edgesOne = new ArrayList<Vertex>();
		edgesOne.add(zero);
		edgesOne.add(two);
		edgesOne.add(three);
		one.setEdgeNodes(edgesOne);
		
		List<Vertex> edgesTwo = new ArrayList<Vertex>();
		edgesTwo.add(one);
		edgesTwo.add(three);
		two.setEdgeNodes(edgesTwo);
		
		List<Vertex> edgesThree = new ArrayList<Vertex>();
		edgesThree.add(one);
		edgesThree.add(two);
		three.setEdgeNodes(edgesThree);
		
		BFSGraph bfs = new BFSGraph();
		bfs.breadthFirstSearch(three);

	}

}
