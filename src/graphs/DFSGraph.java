package graphs;

import java.util.Stack;

public class DFSGraph {
	
	public void dfs(Vertex root) {
		
		Stack<Vertex> stack = new Stack<Vertex>();
		root.setVisited(true);
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			root = stack.pop();
			System.out.println(root.toString());
			
			for(Vertex v: root.getEdgeNodes()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					stack.push(v);
				}
			}
		}
	}
}
