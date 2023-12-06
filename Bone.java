package lojasytem;

public class Bone extends Estoque {

    public Bone(String marca, String cor, String tamanho, double valormarca) {
		super(marca, cor, tamanho, valormarca);
	}

	@Override
    public void ExibirDados(){
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("Cor: %s%n", getCor());
        System.out.printf("Tamanho do bone: %s%n", getTamanho());
    }
}
