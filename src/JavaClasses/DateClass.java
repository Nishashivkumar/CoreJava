package JavaClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		getCalendar();
	}
	
	public static void getTime() {
		Date d = new Date();
		System.out.println(d);
		
		//Simple date format
		SimpleDateFormat SDF = new SimpleDateFormat("mm/dd/yyyy");
		System.out.println( SDF.format(d));
		
		//TO print time
		SimpleDateFormat SD = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
		System.out.println(SD.format(d));
	}
	
	public static void getCalendar() {
		//Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeInMillis());
		SimpleDateFormat SDF1 = new SimpleDateFormat();
		System.out.println(SDF1.format(cal.getTime())); 
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.APRIL));
		System.out.println(cal.get(Calendar.LONG_FORMAT));
	}

}
