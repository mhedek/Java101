
import java.util.Scanner;


public class GelismisHspMakinesi {
    
    static void Topla(){
        Scanner scanner = new Scanner(System.in);
        int sayi, sonuc = 0;
        System.out.print("Kaç adet sayı gireceksiniz? : ");
        int adet = scanner.nextInt();
        
        for(int i= 1; i <= adet; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();
            sonuc += sayi;
        }
        System.out.println("Toplam= " + sonuc);
    }
    
    static void Cıkarma(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 0, sayi;
        System.out.print("Kaç adet sayı gireceksiniz? : ");
        int adet = scanner.nextInt();
        
        for(int i = 1; i<= adet; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();
            if(i == 1){
                sonuc += sayi;
                continue;
            }
            sonuc -=sayi;
        }
        System.out.println("Cıkarma= " + sonuc);
    }
    
    static void Carpma(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 1, sayi;
        
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scanner.nextInt();
        
        for(int i = 1; i <= adet; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextInt();
            
            if(sayi == 0){
                sonuc = 0;
                break;
            }
            if(sayi == 1){
                continue;
            }
            sonuc *= sayi;
        }
        System.out.println("Carpım= " + sonuc);
    }
    
    static void Bolum(){
        Scanner scanner = new Scanner(System.in);
        double sonuc =0.0 , sayi;
        
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scanner.nextInt();
        
        System.out.println("İlk sayı her zaman bölünene eşittir!");
        for(int i = 1; i <= adet; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = scanner.nextDouble();
            
            if(sayi == 0){
                System.out.println("Bölünen sayı 0 olamaz!");
                break;
            }
            if(i == 1){
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }
        System.out.println("Bölüm= " + sonuc); 
    }
    static void Us(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 1, uss, taban;
        
        System.out.print("Taban değeri giriniz :");
        taban = scanner.nextInt();
        
        System.out.print("Üs değeri giriniz :");
        uss = scanner.nextInt();
        
        for(int i = 1; i <= taban; i++){
            sonuc *= taban;
        }
        System.out.println("Üs alma= " + sonuc);
    }
    
    static void Faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        int sonuc= 1, sayi;
        
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        
        for(int i = 1; i <= sayi; i++){
            sonuc *=i;
        }
        System.out.println("Faktoriyel= " + sonuc);
    }
    
    static void Mod(){
        Scanner scanner = new Scanner(System.in);
        int sonuc = 0, sayi1, sayi2;
        
        System.out.print("Birinci sayıyı giriniz :");
        sayi1 = scanner.nextInt();
        
        System.out.print("İkinci sayıyı giriniz :");
        sayi2 = scanner.nextInt();
        
        sonuc = sayi1 % sayi2;
        
        System.out.println("Mod= " + sonuc);
    }
    
    static void Dikdortgen(){
        Scanner scanner = new Scanner(System.in);
        int Alan,Cevre, kisaKenar, uzunKenar;
        
        System.out.print("Kısa Kenarı giriniz :");
        kisaKenar = scanner.nextInt();
        
        System.out.print("Uzun Kenarı giriniz :");
        uzunKenar = scanner.nextInt();
        
        Alan = kisaKenar * uzunKenar;
        Cevre = kisaKenar + uzunKenar;
        
        System.out.println("Alan= " + Alan);
        System.out.println("Cevre= " + Cevre);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String islemler = ("*******************\n"
                + "1- Topla:\n"
                + "2- Çıkarma:\n"
                + "3- Çarpma:\n"
                + "4- Bölme:\n"
                + "5- Üslü Sayı:\n"
                + "6- Faktoriyel:\n"
                + "7- Mod Alma:\n"
                + "8- Dikdörtgen Alan ve Çevre:\n"
                + "9- '0' çıkış yapılır:\n"
                + "*******************"); 
        do{
            System.out.println(islemler);
            System.out.print("İşlem Seçiniz: ");
            select = scanner.nextInt();
            switch(select){
                case 0:
                    System.out.println("Güle Güle :) ");
                    break;
                case 1:
                    Topla();
                    break;
                case 2:
                    Cıkarma();
                    break;
                case 3:
                    Carpma();
                    break;
                case 4:
                    Bolum();
                    break;
                case 5:
                    Us();
                    break;
                case 6:
                    Faktoriyel();
                    break;
                case 7:
                    Mod();
                    break;
                case 8:
                    Dikdortgen();
                    break;
                default:
                    System.out.println("Geçersiz değer girdiniz..");
            }
        }
        while(select != 0);
    }
}
