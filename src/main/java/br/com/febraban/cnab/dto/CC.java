package br.com.febraban.cnab.dto;

import br.com.febraban.cnab.Util;


public class CC{
	
	private CC.Agencia agencia;
	private CC.Conta conta;
	
	
	CC() {}
	
	public class Agencia{
		private Integer codigo;
		private String dv;
		
		public String getCodigo() {
			return  Util.formataCampo(codigo, 5) ;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public String getDv() {
			return Util.formataCampo(dv, 1) ;
		}
		public void setDv(String dv) {
			this.dv = dv;
		}
	}
	
	public class Conta{
		private Integer numero;
		private String dv;
		
		public String getNumero() {
			return Util.formataCampo(numero, 12) ;
		}
		
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
		
		public String getDv() {
			return Util.formataCampo(dv, 1) ;
		}
		
		public void setDv(String dv) {
			this.dv = dv;
		}
	}

	public CC.Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(CC.Agencia agencia) {
		this.agencia = agencia;
	}

	public CC.Conta getConta() {
		return conta;
	}

	public void setConta(CC.Conta conta) {
		this.conta = conta;
	}
}
