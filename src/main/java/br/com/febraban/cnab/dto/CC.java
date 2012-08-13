package br.com.febraban.cnab.dto;


class CC{
	
	private CC.Agencia agencia;
	private CC.Conta conta;
	
	public class Agencia{
		private Integer codigo;
		private String dv;
		public Integer getCodigo() {
			return codigo;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public String getDv() {
			return dv;
		}
		public void setDv(String dv) {
			this.dv = dv;
		}
	}
	
	public class Conta{
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
