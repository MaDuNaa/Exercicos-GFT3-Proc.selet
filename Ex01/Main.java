package Ex01;

public class Main {

	public static void main(String[] Args) {
		
	InvestimentoComIR s0 = new InvestimentoComIR(1000.00, 4.0);
		
	InvestimentoComIR s1 = new InvestimentoComIR(4000.00, 1.2);
	
	InvestimentoSemIR s2 = new InvestimentoSemIR(2000.00, 0.7);
	
	
	
	System.out.println(s0.calcularLucro(2));
	
	System.out.println(s1.calcularLucro(17));

	System.out.println(s2.calcularLucro(10));


	
	}
	
	
}
