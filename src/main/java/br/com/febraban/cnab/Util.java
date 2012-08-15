package br.com.febraban.cnab;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	
	public static String CNAB = "";
	
	private static DateFormat dateFormat;
	
	static{
		dateFormat = new SimpleDateFormat("ddMMyyyy");
	}


	public static String formataCampo(int campo,int numDigito){
		String campoString = String.valueOf(campo);
		while(campoString.length()<numDigito)
			campoString = "0".concat(campoString);

		return campoString;
	}

	public static String formataCampo(String campo,int numDigito){
		if(campo!=null)
			while(campo.length()<numDigito)
				campo =  campo.concat(" ");
		return campo;
	}
	
	public static String formataCampo(Date date){
		
		if(date==null)
			return null;
		
		return dateFormat.format(date);
	}

	public static String formataCampo(Double campo,int numDigito,int numDec){

		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMaximumIntegerDigits(numDigito);
		decimalFormat.setMinimumIntegerDigits(numDigito);
		decimalFormat.setMinimumFractionDigits(numDec);
		decimalFormat.setMaximumFractionDigits(numDec);
		
		return decimalFormat.format(campo).replace(".", "").replaceAll(",", "");
	}
}
