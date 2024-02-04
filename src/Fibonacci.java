
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz: ");
        int sayi = scanner.nextInt();
        
        int a=0, b=1;
        
        for(int i = 0; i <= sayi; i++){
            
            System.out.print(a + " ");
            
            int temp = a + b;
            a = b;
            b = temp;
        }    
    }
}
