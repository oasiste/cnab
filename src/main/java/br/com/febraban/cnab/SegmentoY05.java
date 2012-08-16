package br.com.febraban.cnab;

public class SegmentoY05 {
	
	private Controle controle;
	private Servico servico;
	private Integer codRegOpcional;
	private String CMC7cheque1;
	private String CMC7cheque2;
	private String CMC7cheque3;
	private String CMC7cheque4;
	private String CMC7cheque5;
	private String CMC7cheque6;
	
	public SegmentoY05() {
		setControle(new Controle());
		setServico(new Servico());
		
		getControle().setRegistro(3);
		getServico().setSegmento("Y");
		setCodRegOpcional(4);
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
	public Integer getCodRegOpcional() {
		return codRegOpcional;
	}
	public void setCodRegOpcional(Integer codRegOpcional) {
		this.codRegOpcional = codRegOpcional;
	}
	public String getCMC7cheque1() {
		return CMC7cheque1;
	}
	public void setCMC7cheque1(String cMC7cheque1) {
		CMC7cheque1 = cMC7cheque1;
	}
	public String getCMC7cheque2() {
		return CMC7cheque2;
	}
	public void setCMC7cheque2(String cMC7cheque2) {
		CMC7cheque2 = cMC7cheque2;
	}
	public String getCMC7cheque3() {
		return CMC7cheque3;
	}
	public void setCMC7cheque3(String cMC7cheque3) {
		CMC7cheque3 = cMC7cheque3;
	}
	public String getCMC7cheque4() {
		return CMC7cheque4;
	}
	public void setCMC7cheque4(String cMC7cheque4) {
		CMC7cheque4 = cMC7cheque4;
	}
	public String getCMC7cheque5() {
		return CMC7cheque5;
	}
	public void setCMC7cheque5(String cMC7cheque5) {
		CMC7cheque5 = cMC7cheque5;
	}
	public String getCMC7cheque6() {
		return CMC7cheque6;
	}
	public void setCMC7cheque6(String cMC7cheque6) {
		CMC7cheque6 = cMC7cheque6;
	}
}
