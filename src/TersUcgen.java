
import java.util.Scanner;


public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basamak sayısı giriniz: ");
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= (i-1); j++){
                System.out.print(" ");
            }
            int star = (n + 1) - i;
            for(int k = 1; k <= (2*star)- 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}
