
import java.util.Scanner;


public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double km,kmbasi=2.20, acilis=10, min, tutar;
        
        System.out.println("Mesafe kaç km: ");
        km = scanner.nextDouble();
        
        tutar = acilis +(km * kmbasi);
        
        if(tutar > 0 && tutar < 20){
            min = acilis + 20;
            System.out.println("Ödenecek Tutar = " + min);
        }
        else{
            System.out.println("Ödenecek tutar= " + tutar);
        }
        
    }
}
