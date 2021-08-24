package P1;

public class B { //A classe B tem acesso aos membros da classe A, pois o modificador dos seus membros é o default e ambas as classes estão no mesmo pacore P1.
	
	static protected void f() { //O método B.f() consegue alterar o atributo A.k. Tem permissão de acesso, pois o modificador de A.k é o default.
		System.out.println("Método f (sem modificador)");
		A.g(); //método A.g() apenas apresenta o valor de A.k na tela
		int x = A.k; //sem valor declarado, portanto o valor padrão será zero
		System.out.println("Valor de x = " + x);
		
	}
	
	public static void main (String args []) {
		
		f();
	}

}


// É possível usar o modificador PRIVATE antes da palavra-chave class, tanto na classe A quanto na classeB? O que acontece?
//  >Não é possível. A IDE apresenta o seguinte erro: "Illegal modifier for the class A; only public, abstract & final are permitted".
//   O mesmo acontece para a classe B.

// É possível usar o modificador PRIVATE nos métodos A.g() e B.f()? Justifique.
//  >Não é possível. Colocando o modificador PRIVATE nos métodos acaba tornando-os "não visíveis" entre sim. No método 
//   B.f() a IDE apresenta o seguinte erro: "The method g() from the type A is not visible." e no método A.g() aparece um alerta dizendo:
//   "The method g() from the type A is never used locally."
//  > Resolução do exercício: O método A.g() não pode ter modificador private porque ele é utilizado nos objetos da classe B.
//    O método B.f() poderia ter o modificador private porque apenas é utilizado dentro da própria classe B.

// É possível usar o modificador PROTECTED nos métodos A.g() e B.f()? Justifique
//  >
//  > Resolução do exercício: Poderíamos utilizar o modificador protected em ambos os métodos A.g() e B.f(), pois são classes que estão
//    no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.