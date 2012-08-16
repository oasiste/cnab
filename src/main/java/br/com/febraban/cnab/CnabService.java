package br.com.febraban.cnab;

public interface CnabService {
	String gerarPagamentoTitulosCobranca(HeaderLote headerLote,SegmentoP segmentoP,SegmentoQ segmentoQ);
}
