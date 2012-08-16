package br.com.febraban.cnab;

public  class Desc{
	
	private Integer codDesc;
	private Integer dataDesc;
	private Double desconto;

	public Integer getCodDesc() {
		return codDesc;
	}
	public void setCodDesc(Integer codDesc) {
		this.codDesc = codDesc;
	}
	public Integer getDataDesc() {
		return dataDesc;
	}
	public void setDataDesc(Integer dataDesc) {
		this.dataDesc = dataDesc;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append(getCodDesc());
		sb.append(getDataDesc());
		sb.append(getDesconto());
		return sb.toString();
	}
}