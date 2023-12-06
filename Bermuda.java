package lojasytem;

public class Bermuda extends Estoque {
		
	public Bermuda( String marca, String cor, String tamanho, double valormarca) {
		super(marca, cor, tamanho, valormarca);
	}

	@Override
	public void ExibirDados(){
		System.out.printf("Marca: %s%n", getMarca());
		System.out.printf("Cor: %s%n", getCor());
		System.out.printf("Tamanho: %s", getTamanho());
	}
}
