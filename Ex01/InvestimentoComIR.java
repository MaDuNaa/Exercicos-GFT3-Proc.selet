package Ex01;

public class InvestimentoComIR extends Investimento {

	public InvestimentoComIR(Double valorInicial, Double jurosMensais) {
		super(valorInicial, jurosMensais);
	}
	
	
	@Override
	public double calcularLucro(int meses) {

		if (super.getValorInicial() < 1000) {
			System.out.println("“O valor Inicial não pode ser menor que R$1000”");
			return 0;
		} else {
			
			double desconto;

			if (meses < 6) {
				desconto = 0.225;

			} else if (meses >= 6 && meses < 12) {
				desconto = 0.2;
			} else if (meses >= 12 && meses < 24) {
				desconto = 0.175;
			} else {
				desconto = 0.15;
			}

			desconto = super.calcularLucro(meses) * desconto;

			

			return super.calcularLucro(meses) - desconto;

		}
	}


}
