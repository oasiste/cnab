package br.com.febraban.cnab;

import java.util.Date;
import static br.com.febraban.cnab.Util.formataCampo;
import static br.com.febraban.cnab.Util.CNAB;;

public class SegmentoY50 {
	private Controle controle;
	private Servico servico;
	private Integer codRegOpcional;
	private CC ccMantenedora;
	private String nossoNumero;
	private Integer codCalcRateioBeneficiario;
	private Integer tipoValorInformado;
	private Double valor;
	private Double percentual;
	private Integer codBancoCredBenef;
	private CC ccBeneficiario;
	private String nomeBeneficiario;
	private String parcela;
	private Integer floating;
	private Date dataCredito;
	private Integer motivoOcorrido;
	
	public Controle getControle() {
		return controle;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Integer getCodRegOpcional() {
		return codRegOpcional;
	}
	public void setCodRegOpcional(Integer codRegOpcional) {
		this.codRegOpcional = codRegOpcional;
	}
	public CC getCcMantenedora() {
		return ccMantenedora;
	}
	public void setCcMantenedora(CC ccMantenedora) {
		this.ccMantenedora = ccMantenedora;
	}
	public String getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	public Integer getCodCalcRateioBeneficiario() {
		return codCalcRateioBeneficiario;
	}
	public void setCodCalcRateioBeneficiario(Integer codCalcRateioBeneficiario) {
		this.codCalcRateioBeneficiario = codCalcRateioBeneficiario;
	}
	public Integer getTipoValorInformado() {
		return tipoValorInformado;
	}
	public void setTipoValorInformado(Integer tipoValorInformado) {
		this.tipoValorInformado = tipoValorInformado;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getPercentual() {
		return percentual;
	}
	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}
	public Integer getCodBancoCredBenef() {
		return codBancoCredBenef;
	}
	public void setCodBancoCredBenef(Integer codBancoCredBenef) {
		this.codBancoCredBenef = codBancoCredBenef;
	}
	public CC getCcBeneficiario() {
		return ccBeneficiario;
	}
	public String getNomeBeneficiario() {
		return nomeBeneficiario;
	}
	public void setNomeBeneficiario(String nomeBeneficiario) {
		this.nomeBeneficiario = nomeBeneficiario;
	}
	public String getParcela() {
		return parcela;
	}
	public void setParcela(String parcela) {
		this.parcela = parcela;
	}
	public Integer getFloating() {
		return floating;
	}
	public void setFloating(Integer floating) {
		this.floating = floating;
	}
	public Date getDataCredito() {
		return dataCredito;
	}
	public void setDataCredito(Date dataCredito) {
		this.dataCredito = dataCredito;
	}
	public Integer getMotivoOcorrido() {
		return motivoOcorrido;
	}
	public void setMotivoOcorrido(Integer motivoOcorrido) {
		this.motivoOcorrido = motivoOcorrido;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(formataCampo(getCodRegOpcional(),2));
		sb.append(getCcMantenedora().toString());
		sb.append(formataCampo(getNossoNumero(),20));
		return sb.toString();
	}
}
