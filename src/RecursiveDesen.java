
import java.util.Scanner;


public class RecursiveDesen {
    
    static void Desen(int n){
        System.out.println(n);
        
        if (n <= 0){
            System.out.println(n);
            return;
        }
        
        Desen(n - 5);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        Desen(sayi);
    }
}
