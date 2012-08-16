package br.com.febraban.cnab;

import static br.com.febraban.cnab.Util.formataCampo;
import static br.com.febraban.cnab.Util.CNAB;;

public class SegmentoY04 {
	
	private Controle controle;
	private Servico servico;
	private Integer codRegOpcional;
	private Destinatario dadosDestinatario;
	
	public static class Destinatario{
		
		private String email;
		private Celular celular;
		
		public static class Celular{
			private Integer ddd;
			private Integer numero;
			
			public Integer getDdd() {
				return ddd;
			}
			public void setDdd(Integer ddd) {
				this.ddd = ddd;
			}
			public Integer getNumero() {
				return numero;
			}
			public void setNumero(Integer numero) {
				this.numero = numero;
			}
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append(formataCampo(getDdd(),2));
				sb.append(formataCampo(getNumero(),8));
				return sb.toString();
			}
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(formataCampo(getEmail(),50));
			sb.append(getCelular().toString());
			return sb.toString();
		}

		public Celular getCelular() {
			return celular;
		}

		public void setCelular(Celular celular) {
			this.celular = celular;
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

	public Integer getCodRegOpcional() {
		return codRegOpcional;
	}

	public void setCodRegOpcional(Integer codRegOpcional) {
		this.codRegOpcional = codRegOpcional;
	}

	public Destinatario getDadosDestinatario() {
		return dadosDestinatario;
	}

	public void setDadosDestinatario(Destinatario dadosDestinatario) {
		this.dadosDestinatario = dadosDestinatario;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getControle().toString());
		sb.append(getServico().toString());
		sb.append(formataCampo(getCodRegOpcional(),2));
		sb.append(getDadosDestinatario().toString());
		sb.append(formataCampo(CNAB,80));
		return sb.toString();
	}
	
}
