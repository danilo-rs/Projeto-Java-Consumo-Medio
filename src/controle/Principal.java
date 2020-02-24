package controle;

import java.util.Scanner;
import entidade.Veiculo;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a distância percorrida: ");
		double distancia = sc.nextDouble();
		System.out.println("Informe litros consumidos: ");
		double litros = sc.nextDouble();
		
		Veiculo v1 = new Veiculo();
		
		System.out.println("Consumo médio: " + v1.ConsumoMedio(distancia, litros) + "km/l");
		System.out.printf("Consumo médio: %2f km/l", v1.ConsumoMedio(distancia, litros));
		
		sc.close();
	}

}
