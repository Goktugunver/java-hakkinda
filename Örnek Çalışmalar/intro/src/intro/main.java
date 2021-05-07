package intro;

public class main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't Repeat yourself
		String internetSubeButtonu ="Ýnternet Þubesi";
		double dolarDun = 8.10;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false; 
		
;		System.out.println(internetSubeButtonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar arttý resmi");
			
		}else { 
				System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1 ="Hýzlý Kredi";
		String kredi2 ="Mutlu Emekli Kredisi";
		String kredi3 ="Konut Kredi";
		String kredi4 ="Çiftçi Kredi";
		String kredi5 ="Msb Kredisi";
		String kredi6 ="Deneme Kredisi";
		String kredi7 ="Yenilenmiþ Kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredi",
				"Çiftçi Kredi",
				"Msb Kredisi",
				"Deneme Kredisi",
				"Yenilenmiþ Kredi",
		};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++ ) {
			System.out.println(krediler[0]);
		}
			
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		}

}
