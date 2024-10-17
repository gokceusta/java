package ibm_proje;

import java.util.Scanner;

public class ibm_proje {
		// Ekrana soru vererek kullanicidan bilgi cekme ve yazdırma projesi
	public static void main(String[] args) {
		
			System.out.println("Welcome to BMI check"); // Ekrana cikti yazdirma komutu
			
		// Veri tipleri ve tanımlanması
			
			int date = 2024; // Tam sayi atamaları icin
			
			short human_age,date_of_birth = 0,weight,height; // Daha kucuk sayilar icin
			
			double BMI; // Kesirli sayilar icin
			
			String name; // Sayisal olmayan verilerin atamasi icin
			
			
			Scanner scanner = new Scanner(System.in); // Kullanicidan veri alma tanimlamasi
			
			System.out.println("Name:"); 
			name = scanner.nextLine();		// Cekilen veriyi atama
			
			System.out.println("Date of birth:");
			date_of_birth = scanner.nextShort();

			System.out.println("Weight:");
			weight = scanner.nextShort();
			
			System.out.println("Height(cm):");
			height = scanner.nextShort();
			
			human_age =(short) (date-date_of_birth);
			
			BMI = ((double)weight/(double)(height*height)*10000);
			
			System.out.println("Hi again " + name +". We check your information");
			System.out.println("Your age is "+ human_age +" and your IBM result is "+ BMI);
			
			
			// BMI sonuca gore kiloluluk derecesi gosterme
			
			if(BMI <= 18) {
				System.out.print("You are low weight");
			}
			
			else if(BMI <=25 && BMI>18) {
				System.out.print("You are normal weight");
			}
			
			else if(BMI <=30 && BMI>25) {
				System.out.print("You are slightly overweight");
			}
			
			else if(BMI <=35 && BMI>30) {
				System.out.print("You are moderately fat");
			}
			
			else if(BMI <=40 && BMI>35) {
				System.out.print("You are severely fat");
			}
			
			else  {
				System.out.print("You are obese");
			}

	}

}
