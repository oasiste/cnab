package br.com.febraban.cnab;

import br.com.febraban.cnab.Util;

public class HeaderLote {
	
	private Controle controle;
	private Servico servico;
	private Empresa empresa;
	private String CNAB;
	private String informacao1;
	private String informacao2;
	private ControleCobranca controleCobranca;
	private Integer dataCredito;
	
	
	
	public class Servico{
		
		private String operacao;
		private Integer servico;
		private Integer layoutLote;
		private String CNAB;
		
		public Servico() {
			CNAB = "";
		}
		
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
		public String getCNAB() {
			return Util.formataCampo(CNAB, 2) ;
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
			
			public String getTipo() {
				return Util.formataCampo(tipo, 1);
			}
			public void setTipo(Integer tipo) {
				this.tipo = tipo;
			}
			public String getNumero() {
				return Util.formataCampo(numero, 15);
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
			return Util.formataCampo(convenio, 20);
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
		
		public String getNumRemessaRetorno() {
			return Util.formataCampo(numRemessaRetorno, 8);
		}
		public void setNumRemessaRetorno(Integer numRemessaRetorno) {
			this.numRemessaRetorno = numRemessaRetorno;
		}
		public String getDtGravacao() {
			return Util.formataCampo(dtGravacao, 8);
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
		return Util.formataCampo(informacao1, 40);
	}

	public void setInformacao1(String informacao1) {
		this.informacao1 = informacao1;
	}

	public String getInformacao2() {
		return Util.formataCampo(informacao2, 40);
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

	public String getDataCredito() {
		return Util.formataCampo(dataCredito, 8);
	}

	public void setDataCredito(Integer dataCredito) {
		this.dataCredito = dataCredito;
	}

	public String getCNAB() {
		return Util.formataCampo(CNAB, 1);
	}
	public String getCNAB(int digitos) {
		return Util.formataCampo(CNAB, digitos);
	}

	public void setCNAB(String cNAB) {
		CNAB = cNAB;
	}
}
