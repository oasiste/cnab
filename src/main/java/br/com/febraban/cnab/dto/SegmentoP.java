package br.com.febraban.cnab.dto;

public class SegmentoP {
	
	private Controle controle;
	private Servico servico;
	private CC cc;
	private String nossoNumero;
	private CaracteristicaCobranca caracteristicaCobranca;
	private String numeroDocumentoCobranca;
	private Integer dataVencimentoTitulo;
	private Double valorNominalTitulo;
	
	private Integer agenciaCobradora;
	private String digitoVerificadorAgencia;
	private Integer especieTitulo;
	private String aceite;
	private Integer dataEmissaoTitulo;
	
	private Juros juros;
	private Desc1 desc1;
	
	private Double vlrIOF;
	private Double vlrAbatimento;
	
	private String usoEmpresaCedente;
	private Integer codigoProtesto;
	private Integer prazoProtesto;
	private Integer codigoBaixaDevolucao;
	private Integer prazoBaixaDevolucao;
	private Integer codigoMoeda;
	private Integer numeroContrato;
	private String usoLivreBancoEmpresa;
	
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
	
	public class Juros{
		
		private Integer codJurosMora;
		private Integer dataJurosMora;
		private Double jurosMora;
		
		public Integer getCodJurosMora() {
			return codJurosMora;
		}
		public void setCodJurosMora(Integer codJurosMora) {
			this.codJurosMora = codJurosMora;
		}
		public Integer getDataJurosMora() {
			return dataJurosMora;
		}
		public void setDataJurosMora(Integer dataJurosMora) {
			this.dataJurosMora = dataJurosMora;
		}
		public Double getJurosMora() {
			return jurosMora;
		}
		/**
		 * Juros de Mora por Dia/Taxa
		 * @param jurosMora
		 */
		public void setJurosMora(Double jurosMora) {
			this.jurosMora = jurosMora;
		}
	}
	
	public class Desc1{
		
		private Integer codDesc1;
		private Integer dataDesc1;
		private Double desconto1;
		
		public Integer getCodDesc1() {
			return codDesc1;
		}
		public void setCodDesc1(Integer codDesc1) {
			this.codDesc1 = codDesc1;
		}
		public Integer getDataDesc1() {
			return dataDesc1;
		}
		public void setDataDesc1(Integer dataDesc1) {
			this.dataDesc1 = dataDesc1;
		}
		public Double getDesconto1() {
			return desconto1;
		}
		public void setDesconto1(Double desconto1) {
			this.desconto1 = desconto1;
		}
		@Override
		public String toString() {
			StringBuilder sb  = new StringBuilder();
			sb.append(getCodDesc1());
			sb.append(getDataDesc1());
			sb.append(getDesconto1());
			return sb.toString();
		}
	}
	
	
	public class CaracteristicaCobranca{
		
		private Integer carteira;
		private Integer cadastramento;
		private String documento;
		private Integer emissaoBloqueto;
		private String distribBloqueto;
		public Integer getCarteira() {
			return carteira;
		}
		public void setCarteira(Integer carteira) {
			this.carteira = carteira;
		}
		public Integer getCadastramento() {
			return cadastramento;
		}
		public void setCadastramento(Integer cadastramento) {
			this.cadastramento = cadastramento;
		}
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public Integer getEmissaoBloqueto() {
			return emissaoBloqueto;
		}
		public void setEmissaoBloqueto(Integer emissaoBloqueto) {
			this.emissaoBloqueto = emissaoBloqueto;
		}
		public String getDistribBloqueto() {
			return distribBloqueto;
		}
		public void setDistribBloqueto(String distribBloqueto) {
			this.distribBloqueto = distribBloqueto;
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

	public CC getCc() {
		return cc;
	}

	public void setCc(CC cc) {
		this.cc = cc;
	}

	public String getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public CaracteristicaCobranca getCaracteristicaCobranca() {
		return caracteristicaCobranca;
	}

	public void setCaracteristicaCobranca(
			CaracteristicaCobranca caracteristicaCobranca) {
		this.caracteristicaCobranca = caracteristicaCobranca;
	}

	public String getNumeroDocumentoCobranca() {
		return numeroDocumentoCobranca;
	}

	public void setNumeroDocumentoCobranca(String numeroDocumentoCobranca) {
		this.numeroDocumentoCobranca = numeroDocumentoCobranca;
	}

	public Integer getDataVencimentoTitulo() {
		return dataVencimentoTitulo;
	}

	public void setDataVencimentoTitulo(Integer dataVencimentoTitulo) {
		this.dataVencimentoTitulo = dataVencimentoTitulo;
	}

	public Double getValorNominalTitulo() {
		return valorNominalTitulo;
	}

	public void setValorNominalTitulo(Double valorNominalTitulo) {
		this.valorNominalTitulo = valorNominalTitulo;
	}

	public Integer getAgenciaCobradora() {
		return agenciaCobradora;
	}

	public void setAgenciaCobradora(Integer agenciaCobradora) {
		this.agenciaCobradora = agenciaCobradora;
	}

	public String getDigitoVerificadorAgencia() {
		return digitoVerificadorAgencia;
	}

	public void setDigitoVerificadorAgencia(String digitoVerificadorAgencia) {
		this.digitoVerificadorAgencia = digitoVerificadorAgencia;
	}

	public Integer getEspecieTitulo() {
		return especieTitulo;
	}

	public void setEspecieTitulo(Integer especieTitulo) {
		this.especieTitulo = especieTitulo;
	}

	public String getAceite() {
		return aceite;
	}

	public void setAceite(String aceite) {
		this.aceite = aceite;
	}

	public Integer getDataEmissaoTitulo() {
		return dataEmissaoTitulo;
	}

	public void setDataEmissaoTitulo(Integer dataEmissaoTitulo) {
		this.dataEmissaoTitulo = dataEmissaoTitulo;
	}

	public Juros getJuros() {
		return juros;
	}

	public void setJuros(Juros juros) {
		this.juros = juros;
	}

	public Desc1 getDesc1() {
		return desc1;
	}

	public void setDesc1(Desc1 desc1) {
		this.desc1 = desc1;
	}

	public Double getVlrIOF() {
		return vlrIOF;
	}

	public void setVlrIOF(Double vlrIOF) {
		this.vlrIOF = vlrIOF;
	}

	public Double getVlrAbatimento() {
		return vlrAbatimento;
	}

	public void setVlrAbatimento(Double vlrAbatimento) {
		this.vlrAbatimento = vlrAbatimento;
	}

	public String getUsoEmpresaCedente() {
		return usoEmpresaCedente;
	}

	public void setUsoEmpresaCedente(String usoEmpresaCedente) {
		this.usoEmpresaCedente = usoEmpresaCedente;
	}

	public Integer getCodigoProtesto() {
		return codigoProtesto;
	}

	public void setCodigoProtesto(Integer codigoProtesto) {
		this.codigoProtesto = codigoProtesto;
	}

	public Integer getPrazaProtesto() {
		return prazoProtesto;
	}

	public void setPrazaProtesto(Integer prazaProtesto) {
		this.prazoProtesto = prazaProtesto;
	}

	public Integer getCodigoBaixaDevolucao() {
		return codigoBaixaDevolucao;
	}

	public void setCodigoBaixaDevolucao(Integer codigoBaixaDevolucao) {
		this.codigoBaixaDevolucao = codigoBaixaDevolucao;
	}

	public Integer getPrazoBaixaDevolucao() {
		return prazoBaixaDevolucao;
	}

	public void setPrazoBaixaDevolucao(Integer prazoBaixaDevolucao) {
		this.prazoBaixaDevolucao = prazoBaixaDevolucao;
	}

	public Integer getCodigoMoeda() {
		return codigoMoeda;
	}

	public void setCodigoMoeda(Integer codigoMoeda) {
		this.codigoMoeda = codigoMoeda;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getUsoLivreBancoEmpresa() {
		return usoLivreBancoEmpresa;
	}

	public void setUsoLivreBancoEmpresa(String usoLivreBancoEmpresa) {
		this.usoLivreBancoEmpresa = usoLivreBancoEmpresa;
	}
}
