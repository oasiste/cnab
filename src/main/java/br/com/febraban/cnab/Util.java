package br.com.febraban.cnab;

public class Util {


	public static String formataCampo(int campo,int numDigito){
		String campoString = String.valueOf(campo);
		while(campoString.length()<numDigito){
			campoString = "0".concat(campoString);
		}
		return campoString;
	}

	public static String formataCampo(String campo,int numDigito){
		if(campo!=null)
			while(campo.length()<numDigito)
				campo =  campo.concat(" ");
		return campo;
	}
}
