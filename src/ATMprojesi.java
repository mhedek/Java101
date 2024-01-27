
import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        boolean isError = true;
        
        do {
            System.out.println("************************");
            System.out.println("Çıkış '0'\n"
                + "1-Para yatırma\n"
                + "2-Para çekme\n"
                + "3-Bakiye sorgulama");
            System.out.println("************************");
        
            System.out.print("Lütfen işlem seçiniz: ");
        int islem = scanner.nextInt();
            switch(islem){
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    isError = false;
                    break;
                case 1:
                    System.out.print("Yatırmak istediğiniz tutar giriniz: ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    
                    bakiye += tutar;
                    System.out.println("Güncel tutar: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    int tutar2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(bakiye - tutar2 < 0){
                        System.out.println("Yetersiz bakiye!! Bakiye: " + bakiye + " TL");
                        
                    }
                    else {
                        bakiye -= tutar2;
                        System.out.println("Toplam bakiye: " + bakiye + " TL");
                    }
                    break;
                case 3:
                    System.out.println("Güncel Bakiye: " + bakiye + " TL");
                    break;
                default:
                    System.out.println("Geçersiz işlem...");
            }
        } while (isError);
            System.out.println("İyi günler...");
    }
}
