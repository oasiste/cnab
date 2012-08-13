package br.com.febraban.cnab;

import br.com.febraban.cnab.dto.HeaderLote;

public interface CnabService {
	String gerarPagamentoTitulosCobranca(HeaderLote headerLote);
}
