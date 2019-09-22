package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {
	
	
	public void breadthFirstSearch(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			root = queue.poll();
			System.out.println(root.toString());
			List<Vertex> vertices = root.getEdgeNodes();
			
			for(Vertex v: vertices) {
				if(!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
		
	}
}
