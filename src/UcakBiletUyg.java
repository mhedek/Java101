
import java.util.Scanner;


public class UcakBiletUyg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mesafe, yas,yolculukTipi;
        
        System.out.println("******************************");
        System.out.println("Fly Hava Yollarına Hoşgeldiniz");
        System.out.println("******************************");
        System.out.println("");
        
        System.out.print("Yolculuğunuzun mesafesini giriniz: ");
        mesafe = scanner.nextInt();
        
        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();
        
        
        System.out.print("Yolculuk Tipinizi giriniz (Tek Yön ise 1 , Gidiş-Dönüş ise 2): ");
        yolculukTipi = scanner.nextInt();
        
        double NormalTutar, yasİndirimi, indirimlitutar, yoltipiİndirimi, ToplamTutar;
        
        if(mesafe > 0 && yas > 0){
            if(yas < 12){
                NormalTutar = mesafe * 0.10;
                yasİndirimi = NormalTutar * 0.5;
                indirimlitutar = NormalTutar - yasİndirimi;
                
                if(yolculukTipi == 2){
                    
                    yoltipiİndirimi = indirimlitutar * 0.2;
                    ToplamTutar = (indirimlitutar - yoltipiİndirimi) * 2;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar);
                    
                }
                else if(yolculukTipi == 1){
                    
                    ToplamTutar = indirimlitutar;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar);
                    
                }
                else{
                    System.out.println("Yolculuk tipini kontrol ediniz...");
                }
            }
            else if(yas >= 12 && yas <= 24){
                NormalTutar = mesafe * 0.10;
                yasİndirimi = NormalTutar * 0.1;
                indirimlitutar = NormalTutar - yasİndirimi;
                
                if(yolculukTipi == 2){
                    
                    yoltipiİndirimi = indirimlitutar * 0.2;
                    ToplamTutar = (indirimlitutar - yoltipiİndirimi) * 2;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar + " TL");
                }
                else if(yolculukTipi == 1){
                    
                    ToplamTutar = indirimlitutar;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar +" TL");
                    
                }
                else{
                    System.out.println("Yolculuk tipini kontrol ediniz...");
                }                
            }
            else if(yas >= 65){
                
                NormalTutar = mesafe * 0.10;
                yasİndirimi =NormalTutar * 0.3;
                indirimlitutar = NormalTutar - yasİndirimi;
                
                if(yolculukTipi == 2){
                    
                    yoltipiİndirimi = indirimlitutar * 0.2;
                    ToplamTutar = (indirimlitutar - yolculukTipi) * 2;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar + " TL");
                    
                }
                else if(yolculukTipi == 1){
                    
                    ToplamTutar = indirimlitutar;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar + " TL");
                    
                }
                else{
                    
                    System.out.println("Yolculuk tipini kontrol ediniz...");
                    
                }
            }
            else if(yas >= 25 && yas < 65){
                NormalTutar = mesafe * 0.1;
                
                if(yolculukTipi == 2){
                    
                    yoltipiİndirimi = NormalTutar * 0.2;
                    ToplamTutar = (NormalTutar - yoltipiİndirimi) * 2;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar + " TL");
                    
                }
                else if(yolculukTipi == 1){
                    ToplamTutar = NormalTutar;
                    System.out.println("Ödenecek Tutar= " + ToplamTutar + " TL");
                }
                else{
                    System.out.println("Yolculuk tipini kontrol ediniz...");
                }
            }
        }
        else{
            System.out.println("Hatalı Veri Girdiniz! ");
        }
    }
}
