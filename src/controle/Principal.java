package controle;

import java.util.Scanner;
import entidade.Veiculo;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a dist�ncia percorrida: ");
		double distancia = sc.nextDouble();
		System.out.println("Informe litros consumidos: ");
		double litros = sc.nextDouble();
		
		Veiculo v1 = new Veiculo();
		
		System.out.println("Consumo m�dio: " + v1.ConsumoMedio(distancia, litros) + "km/l");
		System.out.printf("Consumo m�dio: %2f km/l", v1.ConsumoMedio(distancia, litros));
		
		sc.close();
	}

}
