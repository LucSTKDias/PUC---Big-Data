import java.util.Scanner;

public class Calculadora {
	//Métodos static são invocados diretamente da sua classe
	static float somar(float a, float b) {
		return a + b;
	}
	
	static float multiplicar(float a, float b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); //Leitor de teclado
		float x, y, z; //Variáveis locais
		
		System.out.println("Entre o valor de x: ");
		x = leitor.nextFloat();
		
		System.out.println("Entre o valor de y: ");
		y = leitor.nextFloat();
		
		z = Calculadora.somar(x, y);
		System.out.println("x + y = " + z);
		
		z = Calculadora.multiplicar(x, y);
		System.out.println("x * y = " + z);
	}
}
