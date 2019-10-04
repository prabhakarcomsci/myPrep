package graphs;

import java.util.Stack;

public class IDDFS {
	
	private Vertex targetVertex;
	private volatile boolean isTargetFound = false;
	
	public IDDFS(Vertex targVertex) {
		this.targetVertex = targVertex;
	}
	
	public void runAlgorithm(Vertex root) {
		
		int depth = 0;
		
		while(!isTargetFound) {
			dls(root, depth);
			System.out.println();
			depth++;
		}
	}
	
	private void dls(Vertex source, int depthLevel) {
		
		Stack<Vertex> stack = new Stack<Vertex>();
		source.setDeapthLevel(0);
		stack.push(source);
		
		while(!stack.isEmpty()) {
			
			Vertex actual = stack.pop();
			System.out.println(actual);
			
			if(actual.getData() == targetVertex.getData()) {
				this.isTargetFound = true;
				return;
			}
			
			if(actual.getDeapthLevel() >= depthLevel) {
				continue;
			}
			
			for(Vertex vertex : actual.getEdgeNodes()) {
				vertex.setDeapthLevel(actual.getDeapthLevel() + 1);
				stack.push(vertex);
			}
		}
	}
}
