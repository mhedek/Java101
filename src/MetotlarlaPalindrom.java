
import java.util.Scanner;


public class MetotlarlaPalindrom {
    
    static int Palindrom(int number){
        
        int temp = number, sonRakam, tersSayi = 0;
        
        while(temp != 0){
            sonRakam = temp % 10;
            tersSayi = (tersSayi * 10) + sonRakam;
            temp /= 10;
        }
        if(number == tersSayi){
            System.out.println(number + ": Palindrom Sayıdır");
            return number;
        }
        else{
            System.out.println(number + ": Palindrom Sayı Değildir");
            return tersSayi;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        System.out.println(Palindrom(sayi));
    }
}
