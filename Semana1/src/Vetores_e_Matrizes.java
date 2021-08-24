//Muitas vezes, precisamos trabalhar com listas de valores. Para isso, o Java permite definir estruturas conhecidas como vetores (arrays). 
//Elas associam um conjunto de valores a um índica, iniciado em 0. Podemos declarar um array utilizando o operador de []

public class Vetores_e_Matrizes {
	public static void main(String[] args) {
		int [] vet = new int[] {10,2,30,-5};
		
			for (int i = 0; i < 4; i++) {
				System.out.print(vet[i] + " ");
			}
			System.out.println("\nFIM\n\n");
	}
		
		String [] estudantes = new String[] {"Maria", "Pedro", "joão"};
		
			for (String estudante : estudantes) {
				 System.out.println(estudante);
			}
			
}	

