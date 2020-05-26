package com.genera.veiculos;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setPlaca("KFM-2912");
		carro.setNmrRodas(4);
		carro.setCor("Azul");
		carro.setKmRodado(44000);
		carro.setNmrPortas(5);
		carro.setVeloMax(120);
		
		Moto moto = new Moto();
		moto.setCor("rosa");
		moto.setKmRodado(1000);
		moto.setNmrRodas(2);
		moto.setPlaca("FFE-1010");
		moto.setVeloMax(150);
		
		//aplicando polimorfismo
		System.out.println(Veiculo.venderVeiculo(moto));
		System.out.println(Veiculo.venderVeiculo(carro));
		
		
		//acelerando
		moto.acelerar(50);
		System.out.println(moto.getVelocidadeAtual());
		carro.acelerar(71);
		System.out.println(carro.getVelocidadeAtual());
		
		//freando
		carro.frear();
		moto.frear();
		
		System.out.println(carro.getVelocidadeAtual() + " " + moto.getVelocidadeAtual());
		
	
		
		//curva
		carro.acelerar(69);
		
		System.out.println(carro.fazerCurva());
		
	}

}
