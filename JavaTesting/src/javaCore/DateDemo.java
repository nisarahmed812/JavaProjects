package javaCore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		System.out.println(sdf2.format(d));



	}

}
