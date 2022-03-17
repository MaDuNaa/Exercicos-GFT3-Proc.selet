package Ex01;

public abstract class Investimento {
	
	private Double valorInicial;
	private Double jurosMensais;
	
	
	public Investimento(Double valorInicial, Double jurosMensais) {
		super();
		this.valorInicial = valorInicial;
		this.jurosMensais = jurosMensais;
	}
	public Double getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	public Double getJurosMensais() {
		return jurosMensais;
	}
	public void setJurosMensais(Double jurosMensais) {
		this.jurosMensais = jurosMensais;
	}
	
	public double calcularLucro(int meses) {
		return (valorInicial * Math.pow( (1 + (jurosMensais * 0.01)), meses )) - valorInicial;
	}
	
	@Override
	public String toString() {
		return "Investimento [valorInicial=" + valorInicial + ", jurosMensais=" + jurosMensais + "]";
	}
	
	

}
