
import java.util.Scanner;


public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();
        
        if(n <= 0){
            System.out.println("Pozitif sayı giriniz...");
            return;
        }
        
        int sayi;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i <= n; i++){
            
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scanner.nextInt();
            
            if(sayi > max){
                max = sayi;
            }
            if(sayi < min){
                min = sayi;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
