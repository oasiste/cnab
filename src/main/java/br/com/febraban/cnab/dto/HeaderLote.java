package br.com.febraban.cnab.dto;

public class HeaderLote {
	
	private Controle controle;
	private Servico servico;
	private Empresa empresa;
	private String informacao1;
	private String informacao2;
	private ControleCobranca controleCobranca;
	private Integer dataCredito;
	
	
	
	public class Servico{
		
		private String operacao;
		private Integer servico;
		private Integer layoutLote;
		
		public String getOperacao() {
			return operacao;
		}
		public void setOperacao(String operacao) {
			this.operacao = operacao;
		}
		public Integer getServico() {
			return servico;
		}
		public void setServico(Integer servico) {
			this.servico = servico;
		}
		public Integer getLayoutLote() {
			return layoutLote;
		}
		public void setLayoutLote(Integer layoutLote) {
			this.layoutLote = layoutLote;
		}
	}
	
	public class Empresa{
		
		private Empresa.Inscricao inscricao;
		private String convenio;
		private CC cc;
		private String nome;
		
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
		
		
		
		public Empresa.Inscricao getInscricao() {
			return inscricao;
		}

		public void setInscricao(Empresa.Inscricao inscricao) {
			this.inscricao = inscricao;
		}

		public String getConvenio() {
			return convenio;
		}

		public void setConvenio(String convenio) {
			this.convenio = convenio;
		}

		public CC getCc() {
			return cc;
		}

		public void setCc(CC cc) {
			this.cc = cc;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	public class ControleCobranca{
		private Integer numRemessaRetorno;
		private Integer dtGravacao;
		public Integer getNumRemessaRetorno() {
			return numRemessaRetorno;
		}
		public void setNumRemessaRetorno(Integer numRemessaRetorno) {
			this.numRemessaRetorno = numRemessaRetorno;
		}
		public Integer getDtGravacao() {
			return dtGravacao;
		}
		public void setDtGravacao(Integer dtGravacao) {
			this.dtGravacao = dtGravacao;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getInformacao1() {
		return informacao1;
	}

	public void setInformacao1(String informacao1) {
		this.informacao1 = informacao1;
	}

	public String getInformacao2() {
		return informacao2;
	}

	public void setInformacao2(String informacao2) {
		this.informacao2 = informacao2;
	}

	public ControleCobranca getControleCobranca() {
		return controleCobranca;
	}

	public void setControleCobranca(ControleCobranca controleCobranca) {
		this.controleCobranca = controleCobranca;
	}

	public Integer getDataCredito() {
		return dataCredito;
	}

	public void setDataCredito(Integer dataCredito) {
		this.dataCredito = dataCredito;
	}
	
}
