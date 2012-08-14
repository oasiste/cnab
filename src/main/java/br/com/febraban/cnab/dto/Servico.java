package br.com.febraban.cnab.dto;

import static br.com.febraban.cnab.Util.CNAB;
import static br.com.febraban.cnab.Util.formataCampo;

public class Servico{
	private Integer numeroRegistro;
	private String segmento;
	private Integer codMovimentoRemessa;
	public Integer getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(Integer numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public Integer getCodMovimentoRemessa() {
		return codMovimentoRemessa;
	}
	public void setCodMovimentoRemessa(Integer codMovimentoRemessa) {
		this.codMovimentoRemessa = codMovimentoRemessa;
	}
	@Override
	public String toString() {
		StringBuilder sb = new  StringBuilder();
		sb.append(formataCampo(getNumeroRegistro()		, 5));
		sb.append(formataCampo(getSegmento()      		, 1));
		sb.append(formataCampo(CNAB				  		, 1));
		sb.append(formataCampo(getCodMovimentoRemessa() , 2));
		return sb.toString();
	}
}