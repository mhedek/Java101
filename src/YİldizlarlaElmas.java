
import java.util.Scanner;


public class YİldizlarlaElmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basamak sayısını giriniz: ");
        int n = scanner.nextInt();
        
        int orta = n / 2 + 1;
        
        for(int i = 1; i <= orta; i++){
            for(int j = 1; j <= (orta-i); j++){
                System.out.print(" ");
            }
                
            for(int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        for(int i = orta -1; i >= 1; i--){
            for(int j = 1; j <= (orta - i); j++){
                System.out.print(" ");
            }
            
            for(int k = 1; k<= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
