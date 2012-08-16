package br.com.febraban.cnab;

import java.util.Date;
import br.com.febraban.cnab.Util;

import static br.com.febraban.cnab.Util.formataCampo;
import static br.com.febraban.cnab.Util.CNAB;

/**
 * 
 * @author otavio
 *
 */
public class SegmentoP {
	
	private Controle controle;
	private Servico servico;
	private CC cc;
	private String nossoNumero;
	private CaracteristicaCobranca caracteristicaCobranca;
	private String numeroDocumentoCobranca;
	private Date dataVencimentoTitulo;
	private Double valorNominalTitulo;
	
	private Integer agenciaCobradora;
	private String digitoVerificadorAgencia;
	private Integer especieTitulo;
	private String aceite;
	private Date dataEmissaoTitulo;
	
	private Juros juros;
	private Desc desc1;
	
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
	
	public static class Servico{
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
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(formataCampo(getNumeroRegistro()     , 5));
			sb.append(formataCampo(getSegmento()           , 1));
			sb.append(formataCampo(CNAB		            , 1));
			sb.append(formataCampo(getCodMovimentoRemessa(), 5));
			return sb.toString();
		}
	}
	
	public static class Juros{
		
		private Integer codJurosMora;
		private Date dataJurosMora;
		private Double jurosMora;
		
		public Integer getCodJurosMora() {
			return codJurosMora;
		}
		public void setCodJurosMora(Integer codJurosMora) {
			this.codJurosMora = codJurosMora;
		}
		public Date getDataJurosMora() {
			return dataJurosMora;
		}
		public void setDataJurosMora(Date dataJurosMora) {
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
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(Util.formataCampo(getCodJurosMora() , 1));
			sb.append(Util.formataCampo(getDataJurosMora()   ));
			sb.append(Util.formataCampo(getJurosMora(), 13, 2));
			sb.append(getCodJurosMora());
			return super.toString();
		}
	}
	
	public static class CaracteristicaCobranca{
		
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
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(Util.formataCampo(getCarteira()       , 1));
			sb.append(Util.formataCampo(getCadastramento()  , 1));
			sb.append(Util.formataCampo(getDocumento()		, 1));
			sb.append(Util.formataCampo(getEmissaoBloqueto(), 1));
			sb.append(Util.formataCampo(getDistribBloqueto(), 1));
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

	public Date getDataVencimentoTitulo() {
		return dataVencimentoTitulo;
	}

	public void setDataVencimentoTitulo(Date dataVencimentoTitulo) {
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

	public Date getDataEmissaoTitulo() {
		return dataEmissaoTitulo;
	}

	public void setDataEmissaoTitulo(Date dataEmissaoTitulo) {
		this.dataEmissaoTitulo = dataEmissaoTitulo;
	}

	public Juros getJuros() {
		return juros;
	}

	public void setJuros(Juros juros) {
		this.juros = juros;
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
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(controle.toString());
		sb.append(servico.toString());
		sb.append(cc.toString());
		sb.append(formataCampo(getNossoNumero(), 20));
		sb.append(caracteristicaCobranca.toString());
		sb.append(formataCampo(getNumeroDocumentoCobranca(), 15));
		sb.append(formataCampo(getDataVencimentoTitulo()       ));
		sb.append(formataCampo(getValorNominalTitulo()    ,13,2));
		sb.append(formataCampo(getAgenciaCobradora()        , 1));
		sb.append(formataCampo(getEspecieTitulo()          ,  2));
		sb.append(formataCampo(getAceite()                 ,  1));
		sb.append(formataCampo(getDataEmissaoTitulo()  		));
		sb.append(juros.toString());
		sb.append(desc1.toString());
		sb.append(formataCampo(getVlrIOF()                , 13,2));
		sb.append(formataCampo(getVlrAbatimento()         , 13,2));
		sb.append(formataCampo(getUsoEmpresaCedente()       , 25));
		sb.append(formataCampo(getCodigoProtesto()          ,  1));
		sb.append(formataCampo(getPrazaProtesto()  	     ,  2));
		sb.append(formataCampo(getCodigoBaixaDevolucao()    ,  1));
		sb.append(formataCampo(getPrazoBaixaDevolucao()     ,  3));
		sb.append(formataCampo(getCodigoMoeda()       		 ,  2));
		sb.append(formataCampo(getNumeroContrato()          , 10));
		sb.append(formataCampo(getUsoLivreBancoEmpresa()    , 240));
		
		return sb.toString();
	}
}
