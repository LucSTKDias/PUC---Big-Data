
public class Retangulo { //Cria a classe
	//Atributos da classe = ESTADO da classe
	float altura;	// define dois atributos do tipo float
	float largura;
	
	//Métodos da classe = COMPORTAMENTO da classe
	float calcularPerimetro() {
		float pm; //variável local
		pm = 2 * altura + 2 * largura;
		return pm;
	}
	
	void imprimirDados() {
		float p;
		p = calcularPerimetro(); //calcular o perímetro do retângulo
		System.out.println("Retângulo: ");
		System.out.println("- altura: " + altura); //Imprime a string e adiciona o atributo
		System.out.println("- largura: " + largura); //Imprime a string e adiciona o atributo
		System.out.println("- perimetro: " + p); //Imprime a string e adiciona o método p
	}
	
	//Método principal - início de execução do programa
	public static void main(String[] args) {
		System.out.println("Mundo dos Retângulos");
		
		//Objeto de Retangulo retg1
		Retangulo retg1; //Referência da classe com nome do novo objeto
		retg1 = new Retangulo(); //Instanciação da classe Retangulo em objeto
		retg1.altura = 10; //Atribui valor
		retg1.largura = 20; //Atribui valor
		retg1.imprimirDados(); //Invoca método do objeto
		
		//Objeto de Retangulo retg2
		Retangulo retg2;
		retg2 = new Retangulo();
		retg2.altura = 5;
		retg2.largura = 15;
		retg2.imprimirDados();
		
		Retangulo retg3;
		retg3 = new Retangulo();
		retg3.altura = 15;
		retg3.largura = 35;
		retg3.imprimirDados();
	}

}
