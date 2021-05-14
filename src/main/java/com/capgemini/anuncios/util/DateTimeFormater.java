package com.capgemini.anuncios.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormater {
	
	
	public static Date javaDateToH2Date(Date data) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date dataConvertida = null;
		try {
			dataConvertida = fmt.parse(data.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dataConvertida;
	}

}
