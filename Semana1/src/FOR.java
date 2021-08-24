
public class FOR {
	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i <= 3; i++) {
			soma = soma + i; //acumula o valor de i em soma
		}
		System.out.println("Soma = " + soma);
	}

}

//A instrução for é formada por três partes, conforme apresentadas no exemplo
// a. Inicialização: permitea criação e inicialização de variáveis.
// b. Condição: mantém o for repetindo seu bloco de comandos enquanto verdadeira.
// c. Operação: executada ao final de cada iteração (repetição) do for.
