
import java.util.Scanner;


public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int yil;
        
        System.out.print("Yıl Giriniz: ");
        yil = scanner.nextInt();
        
        
        if((yil%400 == 0 || yil%4 == 0) && (yil%400 == 0) ){
            System.out.println(yil + " bir artık yıldır.");
        }
        else{
            System.out.println(yil + " bir artık yıl DEĞİLDİR.");
        }
        
    }
}
