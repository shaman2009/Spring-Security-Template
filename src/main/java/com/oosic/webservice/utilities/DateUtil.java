package com.oosic.webservice.utilities;

import java.util.Calendar;
import java.util.Date;
public class DateUtil {
	
	public static final int MILLISECOND = 1000;
	public static final int SECOND = 60;
	public static final int MINUTE = 60;
	
	public static float subTime(Date time){
		
		Date currentDate = new Date();
		float interval = currentDate.getTime() - time.getTime();
		float intervalHour = interval/(MILLISECOND * SECOND * MINUTE);
		
		return intervalHour;
		
	}

	public static Date getDate(){
		
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
		
	}
}
