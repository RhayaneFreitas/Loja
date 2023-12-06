package lojasytem;

public abstract class Estoque implements Interface {
	protected String marca;
	protected String cor;
	protected String tamanho;
	protected double valormarca;
	public Estoque(String marca, String cor, String tamanho, double valormarca) {
		super();
		
		this.marca = marca;
		this.cor = cor;
		this.tamanho = tamanho;
		this.valormarca = valormarca;
	}

	
	public double getValormarca() {
		return valormarca;
	}


	public void setValormarca(double valormarca) {
		this.valormarca = valormarca;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public abstract void ExibirDados();

	@Override
	public double desconto() {
		double desc = getValormarca() - getValormarca() * 0.15 ;
		System.out.println("\nO desconto é de 15%");
		return desc;
	}
	@Override
	public double juros() {
		double juros = getValormarca() * 0.5;
		System.out.println("O juros é de 5%");
		return juros;
	}

}
