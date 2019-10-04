package graphs;

import java.util.List;

public class Vertex{
	
	private int data;
	private boolean isVisited;
	private List<Vertex> edgeNodes;
	private int deapthLevel = 0;

	public Vertex(int data) {
		this.data = data;
		isVisited = false;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	public String toString() {
		return "Vertex: " + this.data;
	}
	
	public List<Vertex> getEdgeNodes() {
		return edgeNodes;
	}

	public void setEdgeNodes(List<Vertex> edgeNodes) {
		this.edgeNodes = edgeNodes;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if((obj instanceof Vertex) && ((Vertex)obj).getData() == this.getData()) {
			return true;
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.getData() * 27;
	}

	public int getDeapthLevel() {
		return deapthLevel;
	}

	public void setDeapthLevel(int deapthLevel) {
		this.deapthLevel = deapthLevel;
	}
}

