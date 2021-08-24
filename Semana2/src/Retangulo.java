
public class Retangulo { //Cria a classe
	//Atributos da classe = ESTADO da classe
	float altura;	// define dois atributos do tipo float
	float largura;
	
	//M�todos da classe = COMPORTAMENTO da classe
	float calcularPerimetro() {
		float pm; //vari�vel local
		pm = 2 * altura + 2 * largura;
		return pm;
	}
	
	void imprimirDados() {
		float p;
		p = calcularPerimetro(); //calcular o per�metro do ret�ngulo
		System.out.println("Ret�ngulo: ");
		System.out.println("- altura: " + altura); //Imprime a string e adiciona o atributo
		System.out.println("- largura: " + largura); //Imprime a string e adiciona o atributo
		System.out.println("- perimetro: " + p); //Imprime a string e adiciona o m�todo p
	}
	
	//M�todo principal - in�cio de execu��o do programa
	public static void main(String[] args) {
		System.out.println("Mundo dos Ret�ngulos");
		
		//Objeto de Retangulo retg1
		Retangulo retg1; //Refer�ncia da classe com nome do novo objeto
		retg1 = new Retangulo(); //Instancia��o da classe Retangulo em objeto
		retg1.altura = 10; //Atribui valor
		retg1.largura = 20; //Atribui valor
		retg1.imprimirDados(); //Invoca m�todo do objeto
		
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
