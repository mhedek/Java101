
import java.util.Scanner;


public class YildizlarlaUcgen {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basamak sayısını giriniz: ");
        int sayi = scanner.nextInt();
        
        for(int i = 1; i<= sayi; i++){
            for(int k = 1; k<=(sayi-i); k++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
 
}
