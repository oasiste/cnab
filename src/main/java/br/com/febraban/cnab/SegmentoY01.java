package br.com.febraban.cnab;

public class SegmentoY01 {
	private Controle controle;
	private Servico servico;
	private Integer codRegOpcional;
	private Sacador sacador;

	
	public SegmentoY01() {
		setControle(new Controle());
		setServico(new Servico());
		setSacador(new Sacador());
		getControle().setRegistro(3);
		getServico().setSegmento("Y");
		setCodRegOpcional(1);
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

	public Sacador getSacador() {
		return sacador;
	}

	public void setSacador(Sacador sacador) {
		this.sacador = sacador;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(getSacador().toString());
		sb.append(Util.formataCampo(Util.CNAB,85));
		return sb.toString();
	}

}
