package br.com.febraban.cnab;

import static br.com.febraban.cnab.Util.formataCampo;
import static br.com.febraban.cnab.Util.CNAB;

import java.util.Date;

public class SegmentoR {

	private Controle controle;
	private Servico servico;
	private Desc desc2;
	private Desc desc3;
	private Multa multa;
	private String informacaoSacado;
	private String informacao3;
	private String informacao4;
	private Integer codOcorSacado;
	private DadosDebito dadosDebito;
	private Integer identEmissaoAvisoDeb;
	
	public static class Multa{
		
		private Integer codMulta;
		private Date dataMulta;
		private Double multa;
		
		public Integer getCodMulta() {
			return codMulta;
		}
		public void setCodMulta(Integer codMulta) {
			this.codMulta = codMulta;
		}
		public Date getDataMulta() {
			return dataMulta;
		}
		public void setDataMulta(Date dataMulta) {
			this.dataMulta = dataMulta;
		}
		public Double getMulta() {
			return multa;
		}
		public void setMulta(Double multa) {
			this.multa = multa;
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			sb.append(formataCampo(getCodMulta() , 1));
			sb.append(formataCampo(getDataMulta()));
			sb.append(formataCampo(getMulta()   ,13,2));
			
			return sb.toString();
		}
		
	}
	
	public static class DadosDebito{
		
		private Integer banco;
		private CC.Agencia agencia;
		private CC.Conta contaCorrente;
		private String dv;
		
		public Integer getBanco() {
			return banco;
		}
		public void setBanco(Integer banco) {
			this.banco = banco;
		}
		public CC.Agencia getAgencia() {
			return agencia;
		}
		public void setAgencia(CC.Agencia agencia) {
			this.agencia = agencia;
		}
		public CC.Conta getContaCorrente() {
			return contaCorrente;
		}
		public void setContaCorrente(CC.Conta contaCorrente) {
			this.contaCorrente = contaCorrente;
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
			sb.append(formataCampo(getBanco() , 3));
			sb.append(getAgencia().toString());
			sb.append(getContaCorrente().toString());
			sb.append(formataCampo(getDv()   , 1));
			
			return sb.toString();
		}
	}

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

	public Desc getDesc2() {
		return desc2;
	}

	public void setDesc2(Desc desc2) {
		this.desc2 = desc2;
	}

	public Desc getDesc3() {
		return desc3;
	}

	public void setDesc3(Desc desc3) {
		this.desc3 = desc3;
	}

	public Multa getMulta() {
		return multa;
	}

	public void setMulta(Multa multa) {
		this.multa = multa;
	}

	public String getInformacaoSacado() {
		return informacaoSacado;
	}

	public void setInformacaoSacado(String informacaoSacado) {
		this.informacaoSacado = informacaoSacado;
	}

	public String getInformacao3() {
		return informacao3;
	}

	public void setInformacao3(String informacao3) {
		this.informacao3 = informacao3;
	}

	public String getInformacao4() {
		return informacao4;
	}

	public void setInformacao4(String informacao4) {
		this.informacao4 = informacao4;
	}

	public Integer getCodOcorSacado() {
		return codOcorSacado;
	}

	public void setCodOcorSacado(Integer codOcorSacado) {
		this.codOcorSacado = codOcorSacado;
	}

	public DadosDebito getDadosDebito() {
		return dadosDebito;
	}

	public void setDadosDebito(DadosDebito dadosDebito) {
		this.dadosDebito = dadosDebito;
	}

	public Integer getIdentEmissaoAvisoDeb() {
		return identEmissaoAvisoDeb;
	}

	public void setIdentEmissaoAvisoDeb(Integer identEmissaoAvisoDeb) {
		this.identEmissaoAvisoDeb = identEmissaoAvisoDeb;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(getDesc2().toString());
		sb.append(getDesc3().toString());
		sb.append(getMulta().toString());
		sb.append(formataCampo(getInformacaoSacado(),10));
		sb.append(formataCampo(getInformacao3()     ,40));
		sb.append(formataCampo(getInformacao4()     ,40));
		sb.append(formataCampo(CNAB     			,20));
		sb.append(formataCampo(getCodOcorSacado()    ,8));
		sb.append(getDadosDebito().toString());
		sb.append(formataCampo(getIdentEmissaoAvisoDeb(),1));
		sb.append(formataCampo(CNAB     			 ,9));
		return sb.toString();
	}
	
}
