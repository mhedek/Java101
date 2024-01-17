
import java.util.Scanner;


public class UsluSayiHsp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t,u, total =1;
        System.out.print("Taban Sayıyı Giriniz: ");
        t = scanner.nextInt();
        
        System.out.print("Üssü Giriniz: ");
        u = scanner.nextInt();
        
        for(int i= 1; i <= u ; i++){
            total *= t;
        }
        System.out.println(t + " üssü " + u + " = " + total);
    }
}
