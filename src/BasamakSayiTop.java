
import java.util.Scanner;


public class BasamakSayiTop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        
        int total = 0;
        int tempNumber = number;
        
        while(tempNumber != 0){
            int rakam = tempNumber % 10;
            total += rakam;
            tempNumber /= 10;
        }
        
        System.out.println("Girdiğiniz sayının rakamları toplamı : " + total);
    }
}
