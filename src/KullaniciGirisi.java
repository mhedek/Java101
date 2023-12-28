
import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String KullaniciAdi = "Medine";
        String parola = "1234";
        
        String kullanici,sifre,cevap,yenisifre;
        while(true){
            System.out.print("Kullanıcı Adını: ");
            kullanici = scanner.nextLine();
        
            System.out.print("Şifre: ");
            sifre = scanner.nextLine();
        
        
            if(KullaniciAdi.equals(kullanici) && parola.equals(sifre)){
                System.out.println("Giriş Başarılı");
                break;

            }
            else if(KullaniciAdi.equals(kullanici) && !parola.equals(sifre)){

                System.out.println("Şifre hatalı...");

                System.out.print("Sıfırlamak ister misiniz? ");
                cevap = scanner.nextLine();

                if(cevap.equals("evet")){
                    System.out.print("Yeni şifrenizi girin: ");
                    yenisifre = scanner.nextLine();

                    if(yenisifre.equals(parola)){
                        System.out.println("Hata: Yeni şifre eskisiyle aynı olamaz.");
                    }
                    else{
                        System.out.println("Şifre yenileme başarılı...");
                    }
                }
                else{
                    System.out.println("Giriş yapılamadı...");
                    break;
                }

            }
            else if(!KullaniciAdi.equals(kullanici) && parola.equals(sifre)){
                System.out.println("Kullanıcı adı hatalı...");
            }
            else{
                System.out.println("Lütfen bilgilerinizi kontrol edip tekrar deneyiniz!");
            }
        }
    }
}
