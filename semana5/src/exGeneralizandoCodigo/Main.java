package exGeneralizandoCodigo;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		var carros = new ArrayList<Carro>();
		var motos = new ArrayList<Moto>();
		var onibuses = new ArrayList<Onibus>();
		
		onibuses.add(new Onibus("Mercedez benz", "V8", 50, true));
		onibuses.add(new Onibus("Scania Escolar", "V8", 15, true));
		
		for (var onibus : onibuses) {
			System.out.println(onibus.imprimir());
		}	
		
		carros.add(new Carro("Carro1", "V8", 50));
		carros.add(new Carro("Carro2", "V8", 15));
		
		for (var Carro : carros) {
			System.out.println(Carro.imprimir());
		}
		
		motos.add(new Moto("Moto1", "V8", 50));
		motos.add(new Moto("Moto2", "V8", 15));
		
		for (var Moto : motos) {
			System.out.println(Moto.imprimir());
		}
		
	}		

}
