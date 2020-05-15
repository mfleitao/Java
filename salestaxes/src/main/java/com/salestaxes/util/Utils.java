package com.salestaxes.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static String convertDateToString(Date date) {
		return new SimpleDateFormat("dd/MMM/YYYY HH:mm").format(date).toString();
	}
	
}
