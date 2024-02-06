
import java.util.Scanner;


public class RecursiveAsalSayi {
    
    static Boolean AsalMi(int n, int i){
        
        if(n <= 2){
            return (n == 2); 
        }
        if(n % i == 0){
            return false;
        }
        if(i*i > n ){
            return true;
        }
        return AsalMi(n, i + 1);
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        
        boolean sonuc = AsalMi(sayi, 2);
        if(sonuc){
            System.out.println(sayi + ": Asal sayıdır.");
        }
        else{
            System.out.println(sayi + ": Asal sayı değildir!");
        } 
    }
}
