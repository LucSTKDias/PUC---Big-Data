//Em algumas situa��es, precisamos interromper um comando de repeti��o. Para estes casos, o Java disponiviliza dois comandos exemplificados abaixo:
// Continue: interrompe a repeti��o e executa a condi��o novamente.
// Break: interrompe a repeti��o incondicionalmente.


public class Continue_e_Break {
	public static void main(String[] args ) {
		//i come�a em 1 e aumenta de 3 em 3 at� <= 20
		for (int i = 1; i <= 20; i+=3) { //1, 4, 7, 10, 13, 16, 19
			if (i % 2 == 1) { // se � n�mero �mpar: resto de i por 2 =1
				continue; // interrompe e vai para a condi��o
			}
			System.out.println(i + " ");
		}
		System.out.println("FIM 1\n\n");
		
		//i come�a em 1 e aumenta de 3 em 3 at� <= 20
		for (int i = 1; i <= 20; i+=3) { // 1, 4, 7, 10, 13, 16, 19
			if (i % 5 == 0) { //se m�ltiplo de 5: resto de i por 5 = 0
				break;
			}
			System.out.println(i + " ");
		}
		System.out.println("FIM 2");
	}
	

}
