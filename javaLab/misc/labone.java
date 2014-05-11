
public class labone {

	public static void swap(int a, int b)
	{
		a = a+b;
		b =  a-b;
		a =  a-b;
		System.out.println("a is " + a + "\n b is " + b);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*labone l = new labone();
		swap(Integer.parseInt(args[0]), 5);
		l.sPrint();
		System.out.println();*/
		
		String url = "http://sphotos-a.ak.fbcdn.net/hphotos-ak-prn1/c22.0.133.133/p133x133/552938_433081913376528_1645865875_n.jpg";
		
				String temp = url.replace("http://", "");
				System.out.println("yrl is " + url + " ****tructe** "  + temp);
				String trucated_url = temp.substring(0, temp.indexOf('/'));
				temp = trucated_url;
				System.out.println("temp is " + temp);
				
				int end_index = trucated_url.lastIndexOf('.');
				temp = trucated_url.substring(0, end_index);
				
				if(temp.lastIndexOf('.') > 0)
				{
					temp= temp.substring(0, temp.lastIndexOf('.'));
				}
				
				int from_index = 0;
				
				if(temp.lastIndexOf('.') > 0)
				{
					from_index =  temp.lastIndexOf('.') + 1;
				}
				//System.out.println("from "+(from_index+1) + " end " + (trucated_url.length() - end_index));
				System.out.println(trucated_url.substring(from_index, trucated_url.length()));

	}
	
	public void sPrint(){
		System.out.println("Swapna");
		
	}
	
	
}
  