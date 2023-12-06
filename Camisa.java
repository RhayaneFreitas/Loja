package lojasytem;

public class Camisa extends Estoque{
	
	public Camisa(String marca, String cor, String tamanho, double valormarca) {
		super(marca, cor, tamanho, valormarca);
		
	}

	@Override
	public void ExibirDados(){
		System.out.printf("Marca: %s%n", getMarca());
		System.out.printf("Cor: %s", getCor());
	}
}
