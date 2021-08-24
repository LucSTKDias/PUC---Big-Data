package donoCaoCauda;

public class Dono {
	private String nome;
	private Cao pet; //Dono est� associado com seu Cao
	
	public Dono(String nome) {
		this.nome = nome;
	}
	
	public void setPet(Cao pet) {
		this.pet = pet;
	}
	
	public Cao getPet() {
		return this.pet;
	}
	
	public void alimentarCao() {
		pet.realizarRefeicao();
	}
	
	public void receberFesta() {
		System.out.println(this.nome + "est� recebendo festa de "+ this.pet.getNomeCao());		
	}
	
	public static void main(String[] args) {
		Dono maria = new Dono("Maria");
		Cao pipoca = new Cao("Pipoca", "Beagle", "F�mea", 3, "Enrolada", "P�lo curtinho");
		
		maria.setPet(pipoca); //Associa pipoca com maria
		pipoca.setMeuDono(maria); //Associa maria com pipoca
		
		System.out.println("C�ozinho de " + maria.nome);
		maria.getPet().printCao();
		
		maria.alimentarCao();
		pipoca.agradarDono();
	}

}
