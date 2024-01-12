
import java.util.Scanner;


public class DordunVebesinKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sınır değeri giriniz: ");
        int n = scanner.nextInt();
        
        for(int i = 1; i<=n; i *= 4 ){
            System.out.print(i + "/");
        }
        
        System.out.println(" ");
        
        for(int j = 1; j<=n; j *=5 ){
            System.out.print(j + "/");
        }
        System.out.println(" ");
    }
}
