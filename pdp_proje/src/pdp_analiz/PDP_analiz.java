/**
*
* @author gökçe usta gokce.usta@ogr.sakarya.edu.tr
* @since 29/11/2024
* <p>
* Programlama dilleri prensipleri 1.öğretim A grubu
* </p>
*/

package pdp_analiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PDP_analiz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dosya adı al
        System.out.print("Lütfen dosyanın adını giriniz: ");
        String dosyaAd = scanner.nextLine();

        //Dosya yok ise
        File dosya = new File(dosyaAd);
        if (!dosya.exists()) {
            System.out.println("Hata: Dosya bulunamadı.");
            return;
        }

        String yorumRegex = "//.*|/\\*.*?\\*/"; // Tek satır ve çok satır yorumlar
        String stringRegex = "\".*?\"";           // Çift tırnaklı string ifadeleri
        // Regex tanımları
        String tekliRegex = "\\+\\+|--|(?<!~)~(?!~)|(?<![=!])!(?![=])";
        String ikiliRegex = "\\*=|-=|(?<!\\\\+)\\\\+(?!\\\\+)|(?<!-)-(?!-)|\\w\\s*\\*\\s*\\w|\\+=|/=|%=|<<=|>>=|\\|=|\\^=|==|!=|<=|>=|&&|\\|\\||>>|<<|[=\\/%<>]";
        String ucluRegex = "\\?.*?:";
       
        int tekSayi = 0;
        int ikiSayi = 0;
        int ucSayi = 0;

        try (BufferedReader okuma = new BufferedReader(new FileReader(dosya))) {
            StringBuilder temizKod = new StringBuilder();
            String satir;

            // Yorum satırlarını ve string ifadelerini temizle
            while ((satir = okuma.readLine()) != null) {
            	satir = satir.replaceAll(yorumRegex, ""); // Yorumları temizle
            	satir = satir.replaceAll(stringRegex, "");  // String ifadeleri temizle
                temizKod.append(satir).append("\n");
            }

            // Temizlenmiş kodu analiz et
            Pattern tekliPattern = Pattern.compile(tekliRegex);
            Pattern ikiliPattern = Pattern.compile(ikiliRegex);
            Pattern ucluPattern = Pattern.compile(ucluRegex);

            String kod = temizKod.toString();

            tekSayi = countOperators(kod, tekliPattern);
            ikiSayi = countOperators(kod, ikiliPattern);
            ucSayi = countOperators(kod, ucluPattern);

            // Sonuçları yazdır
            System.out.println("Tekli Operatörlerin Toplam Sayısı: " + tekSayi);
            System.out.println("İkili Operatörlerin Toplam Sayısı: " + ikiSayi);
            System.out.println("Üçlü Operatörlerin Toplam Sayısı: " + ucSayi);

        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    // Operatörleri bul ve sayısını döndür
    private static int countOperators(String code, Pattern pattern) {
        Matcher matcher = pattern.matcher(code);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;  
	}

}
