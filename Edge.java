import java.util.*;
import Lab3Help.BStop;;
/**
 * 
 * @author Mikael Gordani
 * @author Henrik Tran
 * 
 * This is an edge which connects
 * two nodes in the graph, it counts
 * the length of the traveling between
 * nodes. The destination, or rather
 * which node it is going to travel to,
 * and what line it is choosing.
 */
public class Edge {
	private GraphN destinaton;
	private GraphN origin;
	private int weight;
	private int line;
	
	/**
	 * Building a edge
	 * @param dest the destination of the node
	 * @param weight the weight
	 * @param line the line
	 */
	public Edge(GraphN dest, int weight, int line){
		this.destinaton = dest;
		this.weight      = weight;
		this.line        = line;
		this.origin      = null;
	}
	/**
	 * Building a edge with the max possible weight
	 * @param dest the edges destination node
	 * @param line the edges line
	 */
	
	public Edge(GraphN dest, int line) {
		this(dest,Integer.MAX_VALUE, line);
	}
	/**
	 * Sets the edges current node
	 * @param x edges current node
	 */
	public void SetOrigin(GraphN x) {
		this.origin = x;
	}
	
	/**
	 * Returns the edges destination node
	 * @return Edges destination node
	 */
	public GraphN getDest(){
		return this.destinaton;
	}
	
	/**
	 * @return The time it takes to travel through the edge
	 */
	public int getWeight() {
		return this.weight;
	}

	/**
	 * 
	 * @return The line which represents the edge
	 */
	public int getLine() {
		return this.line;
	}
	
}
	
