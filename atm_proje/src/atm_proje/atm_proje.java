package atm_proje;

import java.util.Scanner;

public class atm_proje {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int islem_secim;
		int cekilen_para,yatirilan_para;
		double bakiye = 3500.50;

		String islemler = "\t1)Hesaptan para çekme\n"
						+ "\t2)Hesaba para yükleme\n"
						+ "\t3)Hesap bakiyesi sorgulama\n"
						+ "\t4)Çıkış\n";
		
		System.out.println("Bankamıza Hoş Geldiniz...");
		System.out.println("Gerçekleştirilebilecek işlemler:\n\n"+islemler);
		
			while(true) {
				System.out.print("Gerçekleştirmek istediğiniz işlemi seçiniz:");
				islem_secim = scanner.nextInt();
				
				if(islem_secim == 1) {
					System.out.println("Hesaptan çekilmek istenen tutar:");
					cekilen_para = scanner.nextInt();
				
					if(cekilen_para <= bakiye) {
						bakiye -= cekilen_para; 
						System.out.println("Para çekme gerçekleşmiştir.\nHesabınızın güncel bakiyesi:"+bakiye +"\n");
					}
					else {
						System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır.\n");
					}
				}
				
				else if(islem_secim == 2) {
					System.out.println("Yüklenmek istenen tutar:");
					yatirilan_para = scanner.nextInt();
				
						bakiye += yatirilan_para; 
						System.out.println("Para yatırma gerçekleşmiştir.\nHesabınızın güncel bakiyesi:"+bakiye+"\n");
					}
				
				else if(islem_secim == 3) {
					System.out.println("Hesap bakiyeniz:"+ bakiye+"\n");
					
				}
				
				else if(islem_secim == 4) {
					System.out.println("Çıkış gerçekleştiriliyor...");
					break;
				}
				
				else {
					System.out.println("Geçersiz işlem girdiniz. Lütfen tekrar deneyiniz...\n");
				}
			}
	}

}