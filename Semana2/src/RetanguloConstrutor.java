
public class RetanguloConstrutor {
	float altura;
	float largura;
	
	public RetanguloConstrutor (float alt, float larg) {
		this.altura = alt;
		this.largura = larg;
	}
	
	float calcularPerimetro(float alt,  float larg) {
		float pm;
		pm = 2 * alt + 2 * larg;
		return pm;
	}
	
	void imprimirDados(float alt, float larg) {
		float p;
		p = calcularPerimetro(alt, larg);
		System.out.println("Retângulo: ");
		System.out.println("- altura: " + alt);
		System.out.println("- largura: " + larg);
		System.out.println("- perimetro: " + p);			
	}
	
	public static void main(String[] args) {
		System.out.println("Mundo dos Retângulos");
		
		RetanguloConstrutor retg1;
		retg1 = new RetanguloConstrutor(10, 20);
		retg1.imprimirDados(10, 20);
		
		RetanguloConstrutor retg2;
		retg2 = new RetanguloConstrutor(15, 50);
		retg2.imprimirDados(15, 50);
	}

}
