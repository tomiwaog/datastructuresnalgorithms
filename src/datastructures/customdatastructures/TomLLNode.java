package datastructures.customdatastructures;

public class TomLLNode {
	public TomLLNode next;
	private String data;
	
	TomLLNode(String data){
		this.data = data;
		this.next = null;
	}
	
	public String toString(){
		return data;
	}
}
