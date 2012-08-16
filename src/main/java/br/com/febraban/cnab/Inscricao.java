package br.com.febraban.cnab;

import static br.com.febraban.cnab.Util.formataCampo;

public  class Inscricao{
	private Integer tipo;
	private Integer numero;
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder();
		sb.append(formataCampo(getTipo(),1));
		sb.append(formataCampo(getNumero(),15));
		return sb.toString();
	}
}