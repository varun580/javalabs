

public class BinaryNode {

BinaryNode()
{
	this.data = null;
	this.left = null;
	this.right = null;	 
}
	
 BinaryNode(Object Data)
 {
	this.data = Data;
	this.left = null;
	this.right = null;	   
 }

 BinaryNode( Object Data, BinaryNode left, BinaryNode right )
 {
 	this.data = Data;
 	this.left = left;
 	this.right = right;	 
 }

 
 Object data;	
 BinaryNode left;
 BinaryNode right;
}
