
import java.util.Scanner;


public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double  sonuc,a,b,c,d,e;
        
        
        System.out.print("Kaç kilo Armut: ");
        a = scanner.nextFloat();
        
        System.out.print("Kaç kilo Elma: ");
        b = scanner.nextFloat();
        
        System.out.print("Kaç kilo Domates: ");
        c = scanner.nextFloat();
        
        System.out.print("Kaç kilo Muz: ");
        d = scanner.nextFloat();
        
        System.out.print("Kaç kilo Patlıcan: ");
        e = scanner.nextFloat();   
        
        sonuc = (a*2.14) + (b*3.67) + (c*1.11) + (d*0.95) + (e*5.00);
        
        System.out.println("Total= " + sonuc + " TL");
        
    }
}
