package br.com.febraban.cnab;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Util {
	
	public static String CNAB = "";


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

	public static String formataCampo(Double campo,int numDigito,int numDec){

		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMaximumIntegerDigits(numDigito);
		decimalFormat.setMinimumIntegerDigits(numDigito);
		decimalFormat.setMinimumFractionDigits(numDec);
		decimalFormat.setMaximumFractionDigits(numDec);
		
		return decimalFormat.format(campo).replace(".", "").replaceAll(",", "");
	}
}
