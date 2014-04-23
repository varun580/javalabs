import java.util.Queue;
import java.util.LinkedList;;

public class Tree {
	
	  
	
	static void LevelOrderDisplay(BinaryNode root)
	 {
		Queue<BinaryNode> que = new  LinkedList<BinaryNode>();
		que.add(new BinaryNode("+"));
		while(root!= null)
		{
		   System.out.print(root.data.toString() + '\t');	
		   if(root.left!=null)
		 		que.add(root.left);
		   if(root.right!=null)
		 		que.add(root.right);
		   
		   root = que.poll();
		   if( root.data.toString().equals("+"))
		   {
			   que.add(new BinaryNode("+"));
			   System.out.println();	
		   	   root = que.poll();
		   	   if(root.data.toString().equals("+"))
		   		   return;
		   }   
		 
		}	 		  
		   
	 }
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryNode l1 = new BinaryNode("2");
		BinaryNode r1 = new BinaryNode("5");
		BinaryNode left = new BinaryNode("4", l1, r1);

		BinaryNode l2 = new BinaryNode("7");
		BinaryNode r2 = new BinaryNode("9");
		BinaryNode right = new BinaryNode("8",l2,null);
		BinaryNode root = new BinaryNode("6", left, right); 
		LevelOrderDisplay(root);
	}

}
