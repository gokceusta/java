package hesapmakinesi_proje;

import java.util.Scanner;

public class hesapmakinesi_proje {
	
	public static double toplama(double birinci, double ikinci) {
		return birinci+ikinci;
		
	}
	public static double cikarma(double birinci, double ikinci) {
		return birinci-ikinci;
	}
	public static double carpma(double birinci, double ikinci) {
		return birinci*ikinci;
	}
	
	public static double bolme(double birinci, double ikinci) {
		return birinci/ikinci;
	}

	public static void main(String[] args) {
		
		double sayi1,sayi2;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hesap Makinesine Hoş Geldiniz\n");
		
		String islemler = "\n\tToplama için '+'\n"
				+ "\tÇıkarma için '-'\n"
				+ "\tÇarpma için  'x'\n"
				+ "\tBölme için   '/'\n"
				+ "\tÇıkış için   'E'\n";
		
		System.out.print("Gerçeklenebilecek işlemler:\n"+islemler);
		
		while(true) {
			
			System.out.println("\nGerçekleştirmek istediğiniz işlem:");
			char secilen = scanner.next().charAt(0);
		
			if(secilen == '+') {
				
				System.out.println("Birinci sayıyı girin:");
				sayi1 = scanner.nextDouble();
			
				System.out.println("Birinci sayıyı girin:");
				sayi2 = scanner.nextDouble();
	    		
				System.out.println("Sonuç:"+toplama(sayi1,sayi2));

			}
		
			else if(secilen == '-') {
				
				System.out.println("Birinci sayıyı girin:");
				sayi1 = scanner.nextDouble();
			
				System.out.println("Birinci sayıyı girin:");
				sayi2 = scanner.nextDouble();
	    	
				System.out.println("Sonuç:"+cikarma(sayi1,sayi2));
			}
		
			else if(secilen == '/') {
				
				System.out.println("Birinci sayıyı girin:");
				sayi1 = scanner.nextDouble();
			
				System.out.println("Birinci sayıyı girin:");
				sayi2 = scanner.nextDouble();
	    	
				System.out.println("Sonuç:"+bolme(sayi1,sayi2));
			
			}
		
			else if(secilen == 'x') {
				
				System.out.println("Birinci sayıyı girin:");
				sayi1 = scanner.nextDouble();
			
				System.out.println("Birinci sayıyı girin:");
				sayi2 = scanner.nextDouble();
	    	
				System.out.println("Sonuç:"+carpma(sayi1,sayi2));
			}
		
			else if(secilen == 'E' || secilen == 'e') {
			
				System.out.print("Sistemden çıkılıyor...");
				break;
			}
			
			else {
				
				System.out.println("Geçersiz işlem girdiniz.");
			}
		
		}
		
	}
	
}
