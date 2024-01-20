
import java.util.Scanner;


public class HarmonikSayiHsp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N sayısını giriniz: ");
        int sayi = scanner.nextInt();
        
        double sonuc = 0;
        for(double i = 1; i <= sayi; i++){
            
            sonuc +=(1/i);
        }
        System.out.println(sonuc);
    }
}
