package br.com.febraban.cnab.dto;

import static br.com.febraban.cnab.Util.formataCampo;


public class CC{
	
	private CC.Agencia agencia;
	private CC.Conta conta;
	
	CC() {}
	
	public static class Agencia{
		private Integer codigo;
		private String dv;
		
		public Integer getCodigo() {
			return  codigo ;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public String getDv() {
			return dv ;
		}
		public void setDv(String dv) {
			this.dv = dv;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(formataCampo(getCodigo(), 5));
			sb.append(formataCampo(getDv()    , 1));
			return sb.toString();
		}
	}
	
	public static class Conta{
		
		private Integer numero;
		private String dv;
		
		public Integer getNumero() {
			return numero;
		}
		
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
		
		public String getDv() {
			return dv;
		}
		
		public void setDv(String dv) {
			this.dv = dv;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(formataCampo(getNumero(), 12));
			sb.append(formataCampo(getDv()    , 1));
			return  sb.toString();
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
	
	@Override
	public String toString() {
		return agencia.toString().concat(conta.toString());
	}
}
