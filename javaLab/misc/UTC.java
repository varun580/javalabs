import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class UTC {
	
	public static void main(String args[])throws ParseException {
	
	//Date d// = new Date("1356524801");	
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");	
		
     sdf.setTimeZone (TimeZone.getTimeZone ("UTC")); 
     sdf.setLenient(true);
     Date d = new Date(1364268642 * 1000);
     Calendar cal = Calendar.getInstance();
     cal.setTimeInMillis((long)1364268642 * 1000);
     //d.getMonth();
     //Date d1= sdf.parse("1358524801.694");
     
     System.out.println ("Time in IST is " + cal.get(Calendar.MONTH) );
     
     
    String url = "http://1-pct.channel.facebook.com/pull?";
	int end_index = url.indexOf(".com");
	String temp = url.substring(0, end_index-1);
	temp= temp.substring(0, temp.lastIndexOf('.')-1);
	int from_index = temp.lastIndexOf('.');
	System.out.println(url.substring(from_index+1, end_index+4));
			
     
	}
	 
    

}