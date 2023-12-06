package lojasytem;

public class Casaco extends Estoque {
    private String capuz;

    public Casaco(String capuz, String marca, String cor, String tamanho, double valormarca) {
        super(marca, cor, tamanho, valormarca);

        this.capuz = capuz;
    }

    public String getCapuz() {
        return capuz;
    }

    public void setCapuz(String capuz) {
        this.capuz = capuz;
    }

    @Override
    public void ExibirDados(){
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("Cor: %s", getCor());
    }
}
