package javaCore;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy");
		System.out.println(simpleDateFormat.format(calendar.getTime())); // 11/11/2023

		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 11
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 2
		System.out.println(calendar.get(Calendar.AM_PM)); // 1
		System.out.println(calendar.get(Calendar.MINUTE)); // 41

	}

}
