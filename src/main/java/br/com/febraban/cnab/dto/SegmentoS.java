package br.com.febraban.cnab.dto;

import br.com.febraban.cnab.Util;

import static br.com.febraban.cnab.Util.formataCampo;
import static br.com.febraban.cnab.Util.CNAB;

public class SegmentoS {

	private Controle controle;
	private Servico servico;
	private Integer tipoImpressao;
	private Integer numeroLinha;
	private String mensagem;
	private Integer tipoFonte;
	private String informacao5;
	private String informacao6;
	private String informacao7;
	private String informacao8;
	private String informacao9;
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
	public Integer getTipoImpressao() {
		return tipoImpressao;
	}
	public void setTipoImpressao(Integer tipoImpressao) {
		this.tipoImpressao = tipoImpressao;
	}
	public Integer getNumeroLinha() {
		return numeroLinha;
	}
	public void setNumeroLinha(Integer numeroLinha) {
		this.numeroLinha = numeroLinha;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getTipoFonte() {
		return tipoFonte;
	}
	public void setTipoFonte(Integer tipoFonte) {
		this.tipoFonte = tipoFonte;
	}
	public String getInformacao5() {
		return informacao5;
	}
	public void setInformacao5(String informacao5) {
		this.informacao5 = informacao5;
	}
	public String getInformacao6() {
		return informacao6;
	}
	public void setInformacao6(String informacao6) {
		this.informacao6 = informacao6;
	}
	public String getInformacao7() {
		return informacao7;
	}
	public void setInformacao7(String informacao7) {
		this.informacao7 = informacao7;
	}
	public String getInformacao8() {
		return informacao8;
	}
	public void setInformacao8(String informacao8) {
		this.informacao8 = informacao8;
	}
	public String getInformacao9() {
		return informacao9;
	}
	public void setInformacao9(String informacao9) {
		this.informacao9 = informacao9;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(formataCampo(getTipoImpressao(),1));

		if(getTipoImpressao()!=null)
			if(getTipoImpressao().intValue() == 1 || getTipoImpressao().intValue() == 2){
				sb.append(formataCampo(getNumeroLinha(),2));
				sb.append(formataCampo(getMensagem()   ,140));
				sb.append(formataCampo(getTipoFonte()  ,2));
				sb.append(formataCampo(CNAB       ,78));
			}else if(getTipoImpressao().intValue() == 3){
				sb.append(formataCampo(getInformacao5() ,40));
				sb.append(formataCampo(getInformacao6() ,40));
				sb.append(formataCampo(getInformacao7() ,40));
				sb.append(formataCampo(getInformacao8() ,40));
				sb.append(formataCampo(getInformacao9() ,40));
				sb.append(formataCampo(CNAB        ,22));
			}
		return sb.toString();
	}

}
