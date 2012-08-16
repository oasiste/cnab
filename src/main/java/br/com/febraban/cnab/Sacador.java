package br.com.febraban.cnab;

import static br.com.febraban.cnab.Util.formataCampo;

class Sacador{
	
	private Inscricao inscricao;
	private String nome;
	private String endereco;
	private String bairro;
	private Integer cep;
	private Integer sufixoCEP;
	private String cidade;
	private String uf;
	
	public Inscricao getInscricao() {
		return inscricao;
	}
	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public Integer getSufixoCEP() {
		return sufixoCEP;
	}
	public void setSufixoCEP(Integer sufixoCEP) {
		this.sufixoCEP = sufixoCEP;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getInscricao().toString());
		sb.append(formataCampo(getNome(),40));
		sb.append(formataCampo(getEndereco(),40));
		sb.append(formataCampo(getBairro(),15));
		sb.append(formataCampo(getCep(),5));
		sb.append(formataCampo(getSufixoCEP(),5));
		sb.append(formataCampo(getCidade(),15));
		sb.append(formataCampo(getUf(),2));
		return sb.toString();
	}
}