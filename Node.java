import java.util.*;
public class Node<E>{

	private int key;
	private E value;
	private Node previous;
	
	private int PreviousLine;
	private int PreviousTime;

	/**
	 * Constructs a node with a specified key & value
	 * @param value value in the node
	 * @param key the key which is used to priority
	 * the node
	 */
	public Node(E value, int key){
		this.value = value;
		this.key = key;
	}
	/**
	 * Constructs a node with an maximum value on a key
	 * @param value value in the node
	 */
	
	public Node(E value){
		this(value, Integer.MAX_VALUE);
	}
	/**
	 * 
	 * @return The closest node to our current node
	 */
	
	public Node<E> getPrevious(){
		return this.previous;
	}
	
	/**
	 * Sets the closest node previously of current node
	 * @param a the closest node previously to current one
	 */
	
	public void setPrevious(Node a) {
		this.previous = a;
	}
	
	/**
	 * 
	 * @param time sets the time taken to get from current node to previous closest node
	 */
	
	public void setPreviousTime(int time) {
		this.PreviousTime = time;
	}
	
	
	/**
	 * 
	 * @return time taken to get from the actual node to the previous closest node
	 */
	
	public int getPreviousTime() {
		return this.PreviousTime;
	}
	
	/**
	 * Specifies which line that is used to get to the 
	 * quickest route from the previous node to the
	 * current node
	 * @param line the line hat is used
	 */
	public void setLine(int line) {
		this.PreviousLine = line;
	}
	
	/**
	 * 
	 * @return The line which you got to the node with (the route)
	 */
	public int getLine(){
		return this.PreviousLine;
	}
	/**
	 * 
	 * @return the nodes key
	 */
	public int getKey(){
		return this.key;
	
	}
	
	/**
	 * Sets the nodes key
	 * @param key the new key
	 */
	public void setKey(int key){
		this.key=key;
	}
	/**
	 * 
	 * @return the value of the node
	 */
	
	public E getValue(){
		return this.value;
	}
	
	/**
	 * Sets the Nodes new value
	 * @param value the new value
	 */
	public void setValue(E value){
		this.value=value;
	}
	
	/**
	 * Compares two nodes key & value to check
	 * if they are the same
	 * @return either true or false depending on the conditions
	 */

}
