
import java.util.Scanner;


public class ProjeKDV {
    public static void main(String[] args) {
        
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ücret tutarını giriniz: ");
        tutar = scanner.nextDouble();
        
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        
        System.out.println("Kdvsiz Tutar: " + tutar);
        System.out.println("KDV Oran: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDVli tutar: " + kdvliTutar);        
            
        }
    }

