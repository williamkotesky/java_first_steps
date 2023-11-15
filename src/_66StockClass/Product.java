package _66StockClass;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueStock() {
		double totalValue = price*quantity;
		System.out.println("Nome: " + name);
		System.out.printf("Preço: R$%.2f%n", price);
		System.out.println("Quantidade: " + quantity);
		return totalValue;
	}
	
	public void addProducts(int productQuantity) {
		this.quantity += productQuantity;
		System.out.println("Nome: " + name);
		System.out.printf("Preço: R$%.2f%n", price);
		System.out.println("Quantidade: " + quantity);
	}
	
	public void removeProducts(int productQuantity) {
		this.quantity -= productQuantity;
		System.out.println("Nome: " + name);
		System.out.printf("Preço: R$%.2f%n", price);
		System.out.println("Quantidade: " + quantity);
	}
}
