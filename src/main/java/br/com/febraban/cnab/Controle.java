package br.com.febraban.cnab;

import br.com.febraban.cnab.Util;

class Controle{
	
	private Integer banco;
	private Integer lote;
	private Integer registro;
	
	Controle() {}
	
	public String getBanco() {
		return  Util.formataCampo(banco, 3);
	}
	public void setBanco(Integer banco) {
		this.banco = banco;
	}
	public String getLote() {
		return Util.formataCampo(lote, 4);
	}
	public void setLote(Integer lote) {
		this.lote = lote;
	}
	public String getRegistro() {
		return Util.formataCampo(registro, 1);
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return getBanco().concat(getLote()).concat(getRegistro());
	}
}