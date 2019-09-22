package graphs;

public class Vertex{
	
	private int data;
	boolean isVisited;
	
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
}

