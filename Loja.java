package lojasytem;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Loja {
	public static void main (String []args) {
		Scanner sInput = new Scanner (System.in);
		Scanner nInput = new Scanner (System.in);
		
		String produto;
		
		System.out.println("Produto desejado pelo cliente: ");
		produto = sInput.nextLine();

			if (!produto.equalsIgnoreCase("bermuda") && !produto.equalsIgnoreCase("bone") &&
					!produto.equalsIgnoreCase("calca") && !produto.equalsIgnoreCase("camisa")
					&& !produto.equalsIgnoreCase("casaco") && !produto.equalsIgnoreCase("tenis")) {
				System.out.println("ERRO. Tente novamente...");
			}
			if (produto.equalsIgnoreCase("bone".toLowerCase())){
				Bone bon = new Bone(null, null, null, 0); //Instanciacao do objeto e construtor
				System.out.println("Digite a marca do bone: ".toLowerCase());
				bon.setMarca(sInput.nextLine());
				System.out.println("Digite a cor do bone: ".toLowerCase());
				bon.setCor(sInput.nextLine());
				System.out.println("Digite o tamanho do bone: ".toLowerCase());
				bon.setTamanho(sInput.nextLine());
				if (bon.getMarca().equalsIgnoreCase("Versace".toLowerCase())) {
					bon.setValormarca(600.0);
				}
				else if (bon.getMarca().equalsIgnoreCase("Zara".toLowerCase())) {
					bon.setValormarca(30.0);
				}
				else if (bon.getMarca().equalsIgnoreCase("Lacoste".toLowerCase())){
					bon.setValormarca(100.0);
				} else {
					bon.setValormarca(45.0);
				}

				bon.ExibirDados();
				System.out.printf("O valor do bone foi de: R$ %.2f", bon.desconto());
			}
			else if (produto.equalsIgnoreCase("bermuda".toLowerCase())){
				Bermuda ber = new Bermuda(null, null, null, 0);
				System.out.println("Digite a marca da Bermuda: ");
				ber.setMarca(sInput.nextLine());
				System.out.println("Digite a cor da bermuda: ".toLowerCase());
				ber.setCor(sInput.nextLine());
				System.out.println("Digite o tamanho da bermuda: ".toLowerCase());
				ber.setTamanho(sInput.nextLine());
				if (ber.getMarca().equalsIgnoreCase("Versace".toLowerCase())) {
					ber.setValormarca(800.0);
				}
				else if (ber.getMarca().equalsIgnoreCase("Zara".toLowerCase())) {
					ber.setValormarca(80.0); 
				}
				else if (ber.getMarca().equalsIgnoreCase("Lacoste".toLowerCase())){
					ber.setValormarca(150.0);
				} else {
					ber.setValormarca(80.0);
				}

				ber.ExibirDados();
				System.out.printf("O valor do produto foi de: R$%.2f", ber.desconto());
			}
			else if (produto.equalsIgnoreCase("camisa")){
				Camisa cam = new Camisa(null, null, null, 0);
				System.out.println("Digite a marca da camisa: ".toLowerCase());
				cam.setMarca(sInput.nextLine());
				System.out.println("Digite a cor da camisa: ".toLowerCase());
				cam.setCor(sInput.nextLine());
				System.out.println("Digite o tamanho da camisa: ".toLowerCase());
				cam.setTamanho(sInput.nextLine()); 
				if (cam.getMarca().equalsIgnoreCase("Versace")) {
					cam.setValormarca(600.0);
				}
				else if (cam.getMarca().equalsIgnoreCase("Zara")) {
					cam.setValormarca(70.0);
				}
				else if (cam.getMarca().equalsIgnoreCase("Lacoste")){
					cam.setValormarca(120.0);
				} else {
					cam.setValormarca(60.0);
				}

				cam.ExibirDados();
				System.out.printf("O valor do produto foi de: R$%.2f", cam.desconto());
			}
			else if (produto.equalsIgnoreCase("calca".toLowerCase())){
				Calca cal = new Calca(null, null, null, 0);
				System.out.println("Digite a marca da calca: ".toLowerCase());
				cal.setMarca(sInput.nextLine());
				System.out.println("Digite a cor da calca: ".toLowerCase());
				cal.setCor(sInput.nextLine());
				System.out.println("Digite o tamanho da calca: ".toLowerCase());
				cal.setTamanho(sInput.nextLine()); 
				if (cal.getMarca().equalsIgnoreCase("Versace")){
					cal.setValormarca(600.0);
				}
				else if (cal.getMarca().equalsIgnoreCase("Zara")){
					cal.setValormarca(70.0);
				}
				else if (cal.getMarca().equalsIgnoreCase("Lacoste")){
					cal.setValormarca(120.0); 
				} else {
					cal.setValormarca(60.0);
				}

				cal.ExibirDados();
				System.out.printf("O valor do produto foi de: R$%.2f", cal.desconto());
			}
			else if (produto.equalsIgnoreCase("Casaco".toLowerCase())){
				Casaco cas = new Casaco(null, null, null, null, 0);
				System.out.println("Digite a marca do casaco: ".toLowerCase());
				cas.setMarca(sInput.nextLine());
				System.out.println("Digite a cor do casaco: ".toLowerCase());
				cas.setCor(sInput.nextLine());
				System.out.println("Digite o tamanho do casaco: ".toLowerCase());
				cas.setTamanho(sInput.nextLine());
				System.out.println("O casaco tera capuz: ".toLowerCase());
				cas.setCapuz(sInput.nextLine());
				
				
				if (cas.getMarca().equalsIgnoreCase("Versace")){
					cas.setValormarca(600.0);
				}
				else if (cas.getMarca().equalsIgnoreCase("Zara")){
					cas.setValormarca(70.0);
				}
				else if (cas.getMarca().equalsIgnoreCase("Lacoste")){
					cas.setValormarca(120.0);
				} else {
					cas.setValormarca(70.0);
				}

				cas.ExibirDados();
				System.out.println("\nO casaco tem capuz: "+ cas.getCapuz());
				System.out.printf("O valor do produto foi de: R$%.2f", cas.desconto());
			}
	}
}