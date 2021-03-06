package br.com.febraban.cnab;


public class CnabServiceImp implements CnabService{

	public String gerarPagamentoTitulosCobranca(HeaderLote headerLote,SegmentoP segmentoP,SegmentoQ segmentoQ) {
		
		StringBuilder sbheaderLote = new StringBuilder();
		sbheaderLote.append(headerLote.getControle().getBanco());
		sbheaderLote.append(headerLote.getControle().getLote());
		sbheaderLote.append(headerLote.getControle().getRegistro());
		sbheaderLote.append(headerLote.getServico().getOperacao());
		sbheaderLote.append(headerLote.getServico().getServico());
		sbheaderLote.append(headerLote.getServico().getCNAB());
		sbheaderLote.append(headerLote.getServico().getLayoutLote());
		sbheaderLote.append(headerLote.getCNAB());
		
		sbheaderLote.append(headerLote.getEmpresa().getInscricao().getTipo());
		sbheaderLote.append(headerLote.getEmpresa().getInscricao().getNumero());
		sbheaderLote.append(headerLote.getEmpresa().getConvenio());
		sbheaderLote.append(headerLote.getEmpresa().getCc().getAgencia().getCodigo());
		sbheaderLote.append(headerLote.getEmpresa().getCc().getAgencia().getDv());
		sbheaderLote.append(headerLote.getEmpresa().getCc().getConta().getNumero());
		sbheaderLote.append(headerLote.getEmpresa().getCc().getConta().getDv());
		sbheaderLote.append(headerLote.getEmpresa().getNome());
		
		sbheaderLote.append(headerLote.getInformacao1());
		sbheaderLote.append(headerLote.getInformacao2());
		
		sbheaderLote.append(headerLote.getControleCobranca().getNumRemessaRetorno());
		sbheaderLote.append(headerLote.getControleCobranca().getDtGravacao());
		sbheaderLote.append(headerLote.getDataCredito());
		sbheaderLote.append(headerLote.getCNAB(33));
		
		StringBuilder sbSegmentoP = new StringBuilder();
		
		return null;
	}
	
	private static String append(Controle controle){
		StringBuilder sbheaderLote = new StringBuilder();
		sbheaderLote.append(controle.getBanco());
		sbheaderLote.append(controle.getLote());
		sbheaderLote.append(controle.getRegistro());
		return sbheaderLote.toString();
	}

}
