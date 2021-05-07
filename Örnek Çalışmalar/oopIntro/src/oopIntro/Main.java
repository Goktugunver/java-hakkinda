package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenova", 1500, "new pc for gamer"); //Örnek oluþturma referans oluþturma		 


				
		Product product2 = new Product(); //Örnek oluþturma referans oluþturma		 
		product2.id =2;
		product2.name = "Lenova2";
		product2.unitPrice = 2500;
		product2.detail = "old computer for gamer";
		
		Product product3 = new Product(); //Örnek oluþturma referans oluþturma		 
		product3.id =3;
		product3.name = "Hp";
		product3.unitPrice = 3500;
		product3.detail = "standart computer for gamer";
		

		
		
		
		Product[] products = {product1,product2,product3} ;
		
		for (Product product : products) {
			
			System.out.println(product.name);
			System.out.println(product.unitPrice);
			System.out.println(product.detail);
			
				
			
		}
		
		System.out.println(products.length);
		
		Catagory catagory1 = new Catagory();
		catagory1.id = 1;
		catagory1.name ="Ev/Bahçe";
		

		Catagory catagory2 = new Catagory();
		catagory2.id = 2;
		catagory2.name ="Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		
		

	}

}
