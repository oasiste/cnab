package br.com.febraban.cnab.dto;

public class SegmentoQ {

	private Controle controle;
	private Servico servico;

	public class DadosSacado{
		
		private Inscricao inscricao;
		private String nome;
		private String endereco;
		private String bairro;
		private Integer cep;
		
		public class Inscricao{
			private Integer tipo;
			private Integer numero;
			public Integer getTipo() {
				return tipo;
			}
			public void setTipo(Integer tipo) {
				this.tipo = tipo;
			}
			public Integer getNumero() {
				return numero;
			}
			public void setNumero(Integer numero) {
				this.numero = numero;
			}
		}
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
	}
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
}
