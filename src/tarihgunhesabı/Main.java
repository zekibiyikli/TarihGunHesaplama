package tarihgunhesabý;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		String one="2015-10-09";
		String two="2016-10-09";
		
		Date d1=null;
		Date d2=null;
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		try {
			d1=df.parse(one);
			d2=df.parse(two);
		}catch(Exception e) {
			
		}
		
		System.out.println(d1+"//"+d2);
		 
		long fark=d2.getTime()-d1.getTime();
		fark=fark/(1000*60*60*24);
		System.out.println(fark);
		
	}

}
