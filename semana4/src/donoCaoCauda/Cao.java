package donoCaoCauda;

public class Cao {
	private Dono meuDono;
	private String nomeCao;
	private String raca;
	private String genero;
	private int idade;
	private Cauda minhaCauda;
	
	public Cao(String nome, String raca, String genero, int idade, String forma, String tipoPelo) {
		this.nomeCao = nome;
		this.raca = raca;
		this.genero = genero;
		this.idade = idade;
		this.minhaCauda = new Cauda(forma, tipoPelo);
	}
	
	public void setMeuDono(Dono meuDono) {
		this.meuDono = meuDono;
	}
	
	public String getNomeCao() {
		return nomeCao;
	}
	
	public void printCao() {
		System.out.println(" Nome: " + this.nomeCao);
		System.out.println(" Ra�a: " + this.raca);
		System.out.println(" G�nero: " + this.genero);
		System.out.println(" Idade: " + this.idade);
		minhaCauda.printCauda();
		System.out.println();
	}
	
	public void realizarRefeicao() {
		System.out.println(this.nomeCao + " fazendo sua refei��o.");
	}
	
	public void agradarDono() {
		this.meuDono.receberFesta();
	}

}
