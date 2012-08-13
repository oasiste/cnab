package br.com.febraban.cnab;

import br.com.febraban.cnab.dto.HeaderLote;
import br.com.febraban.cnab.dto.SegmentoP;
import br.com.febraban.cnab.dto.SegmentoQ;

public interface CnabService {
	String gerarPagamentoTitulosCobranca(HeaderLote headerLote,SegmentoP segmentoP,SegmentoQ segmentoQ);
}
