
import java.util.Scanner;


public class Vki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float sonuc, boy, kilo;
        
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = scanner.nextFloat();
        
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = scanner.nextFloat();
        
        sonuc = kilo/(boy*boy);
        
        System.out.println("Vücut Kitle İndeksiniz: " + sonuc);
    }
}
