
import java.util.Scanner;


public class dongulerciftVedordunkati {
    public static void main(String[] args) {
        
        int sayi, total=0;
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        
        
        
        while(isTrue){
            System.out.print("Bir sayı Giriniz: ");
            sayi = scanner.nextInt();
            
            if(sayi < 0){
                isTrue = false;
            }
            if(sayi % 2 == 0 && sayi % 4 == 0){
                total += sayi;
                System.out.println("Toplam: " + total);
            }
            if(sayi % 2 != 0){
                continue;
            }
        }
        System.out.println("Son Toplam = " + total);
    }
}
