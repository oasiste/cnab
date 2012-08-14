	package br.com.febraban.cnab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {
	
	@Test
	public void testeNumDec(){
		assertEquals("0000032000", Util.formataCampo(new Double(3.2), 6, 4));
	}

}
