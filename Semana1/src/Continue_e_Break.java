//Em algumas situações, precisamos interromper um comando de repetição. Para estes casos, o Java disponiviliza dois comandos exemplificados abaixo:
// Continue: interrompe a repetição e executa a condição novamente.
// Break: interrompe a repetição incondicionalmente.


public class Continue_e_Break {
	public static void main(String[] args ) {
		//i começa em 1 e aumenta de 3 em 3 até <= 20
		for (int i = 1; i <= 20; i+=3) { //1, 4, 7, 10, 13, 16, 19
			if (i % 2 == 1) { // se é número ímpar: resto de i por 2 =1
				continue; // interrompe e vai para a condição
			}
			System.out.println(i + " ");
		}
		System.out.println("FIM 1\n\n");
		
		//i começa em 1 e aumenta de 3 em 3 até <= 20
		for (int i = 1; i <= 20; i+=3) { // 1, 4, 7, 10, 13, 16, 19
			if (i % 5 == 0) { //se múltiplo de 5: resto de i por 5 = 0
				break;
			}
			System.out.println(i + " ");
		}
		System.out.println("FIM 2");
	}
	

}
