package P1;

public class B { //A classe B tem acesso aos membros da classe A, pois o modificador dos seus membros � o default e ambas as classes est�o no mesmo pacore P1.
	
	static protected void f() { //O m�todo B.f() consegue alterar o atributo A.k. Tem permiss�o de acesso, pois o modificador de A.k � o default.
		System.out.println("M�todo f (sem modificador)");
		A.g(); //m�todo A.g() apenas apresenta o valor de A.k na tela
		int x = A.k; //sem valor declarado, portanto o valor padr�o ser� zero
		System.out.println("Valor de x = " + x);
		
	}
	
	public static void main (String args []) {
		
		f();
	}

}


// � poss�vel usar o modificador PRIVATE antes da palavra-chave class, tanto na classe A quanto na classeB? O que acontece?
//  >N�o � poss�vel. A IDE apresenta o seguinte erro: "Illegal modifier for the class A; only public, abstract & final are permitted".
//   O mesmo acontece para a classe B.

// � poss�vel usar o modificador PRIVATE nos m�todos A.g() e B.f()? Justifique.
//  >N�o � poss�vel. Colocando o modificador PRIVATE nos m�todos acaba tornando-os "n�o vis�veis" entre sim. No m�todo 
//   B.f() a IDE apresenta o seguinte erro: "The method g() from the type A is not visible." e no m�todo A.g() aparece um alerta dizendo:
//   "The method g() from the type A is never used locally."
//  > Resolu��o do exerc�cio: O m�todo A.g() n�o pode ter modificador private porque ele � utilizado nos objetos da classe B.
//    O m�todo B.f() poderia ter o modificador private porque apenas � utilizado dentro da pr�pria classe B.

// � poss�vel usar o modificador PROTECTED nos m�todos A.g() e B.f()? Justifique
//  >
//  > Resolu��o do exerc�cio: Poder�amos utilizar o modificador protected em ambos os m�todos A.g() e B.f(), pois s�o classes que est�o
//    no mesmo pacote e, com esse modificador, os m�todos estariam acess�veis entre as classes.