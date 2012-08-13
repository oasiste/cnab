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
	
}
