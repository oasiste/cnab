package br.com.febraban.cnab;

import static br.com.febraban.cnab.Util.formataCampo;

class SacadorAvalista{
	private Inscricao inscricao;
	private String nome;
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
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getInscricao().toString());
		sb.append(formataCampo(getNome(),40));
		return sb.toString();
	}
}
