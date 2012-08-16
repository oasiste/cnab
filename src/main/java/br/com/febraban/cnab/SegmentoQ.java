package br.com.febraban.cnab;

import static br.com.febraban.cnab.Util.formataCampo;
import br.com.febraban.cnab.Util;

public class SegmentoQ {

	private Controle controle;
	private Servico servico;
	private Sacador dadosSacado;
	private SacadorAvalista sacadorAvalista;
	private Integer bancoCorrespondente;
	private String nossoNumeroBandoCorrespondente;
	
	
	
	

	
		
	public Controle getControle() {
		return controle;
	}
	public void setControle(Controle controle) {
		this.controle = controle;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public SacadorAvalista getSacadorAvalista() {
		return sacadorAvalista;
	}
	public void setSacadorAvalista(SacadorAvalista sacadorAvalista) {
		this.sacadorAvalista = sacadorAvalista;
	}
	public Integer getBancoCorrespondente() {
		return bancoCorrespondente;
	}
	public void setBancoCorrespondente(Integer bancoCorrespondente) {
		this.bancoCorrespondente = bancoCorrespondente;
	}
	public String getNossoNumeroBandoCorrespondente() {
		return nossoNumeroBandoCorrespondente;
	}
	public void setNossoNumeroBandoCorrespondente(
			String nossoNumeroBandoCorrespondente) {
		this.nossoNumeroBandoCorrespondente = nossoNumeroBandoCorrespondente;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(getDadosSacado().toString());
		sb.append(getSacadorAvalista().toString());
		sb.append(formataCampo(getBancoCorrespondente(),3));
		sb.append(formataCampo(getNossoNumeroBandoCorrespondente(),20));
		sb.append(formataCampo(Util.CNAB,8));
		return sb.toString();
	}
	public Sacador getDadosSacado() {
		return dadosSacado;
	}
	public void setDadosSacado(Sacador dadosSacado) {
		this.dadosSacado = dadosSacado;
	}
}
