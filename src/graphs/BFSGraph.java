package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSGraph {
	
	/*
			   1 ---------------- 0
	          / \
	         /   \
	        /     \
	       /       \
	      2 ------- 3
	      
	*/
	
	
	//Map to store all vertices/nodes and their edge vertices/nodes
	private static Map<Vertex, List<Vertex>> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		//Initialize vertices
		Vertex one = new Vertex(1);
		Vertex two = new Vertex(2);
		Vertex three = new Vertex(3);
		Vertex zero = new Vertex(0);
		
		//Add edge nodes to map
		List<Vertex> edgesZero = new ArrayList<Vertex>();
		edgesZero.add(one);
		addEdge(zero, edgesZero);
		
		List<Vertex> edgesOne = new ArrayList<Vertex>();
		edgesOne.add(zero);
		edgesOne.add(two);
		edgesOne.add(three);
		addEdge(one, edgesOne);
		
		List<Vertex> edgesTwo = new ArrayList<Vertex>();
		edgesTwo.add(one);
		edgesTwo.add(three);
		addEdge(two, edgesTwo);
		
		List<Vertex> edgesThree = new ArrayList<Vertex>();
		edgesThree.add(one);
		edgesThree.add(two);
		addEdge(three, edgesThree);
		
		breadthFirstSearch(zero);
		
	}
	
	public static void addEdge(Vertex key, List<Vertex> list) {
		map.put(key, list);
	}
	
	public static void breadthFirstSearch(Vertex vertex) {
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		vertex.setVisited(true);
		queue.add(vertex);
		
		while(!queue.isEmpty()) {
			
			vertex = queue.poll();
			List<Vertex> vertices = map.get(vertex);
			
			for(Vertex v: vertices) {
				if(!v.isVisited) {
					v.setVisited(true);
					queue.add(v);
				}
			}
			System.out.println(vertex.toString());
		}
		
	}
}
