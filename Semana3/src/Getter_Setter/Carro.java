package Getter_Setter;

public class Carro {
	private String marca; // atributo oculto (encapsulado / privado)
	private boolean ligado; // atributo oculto (encapsulado / privado)
	
	public Carro(String marca, boolean ligado) { // método construtor
		this.marca = marca;
		this.ligado = ligado;
	}
	
	public String getMarca() { //Retorna valor do atributo privado "marca"
		return marca;
	}
	
	public void setMarca(String marca) { //Altera valor de marca
		this.marca = marca;
	}
	
	public boolean isLigado() { //Retorna valor do atributo privado "ligado"
		return ligado;
	}
	
	public void setLigado(boolean ligado) { //Altera valor de "ligado"
		this.ligado = ligado;
	}
	
	public static void main(String[] args) {
		System.out.println("------------------------------\n");
		Carro meuCarro = new Carro("Ford", false); //Instancia Carro
		System.out.println("Marca: " + meuCarro.getMarca()); //Retorna valor
		System.out.println("Ligado: " + (meuCarro.isLigado()==true?"Ligado\n":"Desligado\n"));
		System.out.println("------------------------------\n");
		meuCarro.setMarca("Renault"); //Altera valor de atributo privado
		meuCarro.setLigado(true);
		
		System.out.println("Marca: " + meuCarro.getMarca()); //Retorna valor
		System.out.println("Ligado: " + (meuCarro.isLigado()==true?"Ligado\n":"Delisgado\n"));
		System.out.println("------------------------------\n");
	}

}
