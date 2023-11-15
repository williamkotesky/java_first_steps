import java.util.Scanner;

import _66StockClass.Product;

public class StockProgram {

	public static void main(String[] args) {
		Product productA, productB;
		
		productA = new Product();
		productB = new Product();
		
		productA.name = "Arroz";
		productA.price = 17.25;
		productA.quantity = 124;
		
		productB.name = "Feijão";
		productB.price = 6.90;
		productB.quantity = 178;
		
		double totalValueStock = productA.totalValueStock();
		System.out.printf("Valor total: R$%.2f%n", totalValueStock);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adcionar stock do produto A:");
		int addProduct = sc.nextInt();
		productA.addProducts(addProduct);
		System.out.println("Remover stock do produto A");
		int removeProduct = sc.nextInt();
		productA.removeProducts(removeProduct);
		sc.close();
	}

}
