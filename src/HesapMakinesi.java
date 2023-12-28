
import java.util.Scanner;


public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a, b, islem,sec;
        
        System.out.println("***************");
        System.out.println("1.Toplama\n"
                        +"2.Çıkarma\n"
                        +"3.Çarpma\n"
                        +"4.Bölme");
        System.out.println("****************");

        System.out.print("Yapmak istedğiniz işlemi seçiniz: ");
        sec = scanner.nextInt();
        
        System.out.print("Birinci sayıyı giriniz: ");
        a = scanner.nextInt();

        System.out.print("İkinci sayiyi giriniz: ");
        b = scanner.nextInt();

        switch(sec){
            case 1:
                System.out.println("Toplam= " + (a+b));
                break;
            case 2:
                System.out.println("Fark: " + Math.abs(a-b));
                break;
            case 3:
                System.out.println("Çarpma: " + (a*b));
                break;
            case 4:
                System.out.println("Bölme: " + (a/b));
                break;
            default:
                System.out.println("Lütfen geçerli işlem seçiniz...");
        }

    }
}
