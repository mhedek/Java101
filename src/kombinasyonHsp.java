
import java.util.Scanner;


public class kombinasyonHsp {
    
    private static int faktoriyel(int sayi){
        if(sayi == 0 || sayi == 1){
            return 1;
        }
        
        int islem = 1;
        for(int i =2; i <= sayi; i++){
            islem *= i; 
        }
        return islem;
    }
    
    private static int hesaplaKombinasyon(int n, int r) {    
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı giriniz: ");
        int n = scanner.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        int r = scanner.nextInt();
        
        if( r > n){
            System.out.println("R N'den büyük olamaz...");
        }
        else{
            int kombinasyon = hesaplaKombinasyon(n, r);
            System.out.println(kombinasyon);
        }
    }
}
