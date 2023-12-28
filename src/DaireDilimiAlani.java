
import java.util.Scanner;


public class DaireDilimiAlani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, pi=3.14, r, sonuc;
        
        System.out.print("Merkez açısı: ");
        a = scanner.nextDouble();
        
        System.out.print("Yarıçap: ");
        r = scanner.nextDouble();
        
        sonuc = (pi * (r*r) * a )/ 360;
        
        System.out.println("Alan= " + sonuc);
    }
}
