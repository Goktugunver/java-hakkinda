package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		System.out.println("Ben �al��t�m");
		
		
	}
	
	int id ;
	String name;
	double unitPrice;
	String detail;

	
}
