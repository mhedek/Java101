
import java.util.Scanner;


public class dongulerUcVeDortOrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sayi, toplam=0,ortaksayıadet = 0, ortalama;
        
        System.out.print("Bir Sayı Giriniz: ");
        sayi = scanner.nextInt();
        
        for(int i=0; i <= sayi; i++){
            if(i%3==0 && i%4==0){
                ortaksayıadet++;
                toplam+=i;
                
                System.out.println(i);
            }
        }
        ortalama = toplam/ortaksayıadet;
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);        
    }
}
