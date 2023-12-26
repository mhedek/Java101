
import java.util.Scanner;


public class proje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mat,fizik,kimya,trk,tarih,muzik;
        
        
        
        System.out.print("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
        
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        
        System.out.print("Türkçe notunuzu giriniz: ");
        trk = scanner.nextInt();
        
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();
        
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        
        double ort = (mat + fizik + kimya + trk + tarih + muzik) / 7;
        System.out.println("Ortalamanız: " + ort);
    }
}
