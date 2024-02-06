
import java.util.Scanner;


public class RecursiveUsluHsp {
    
    static int power(int a, int b){
        
        if(b == 0){
            return 1;
        }

        else{
            return a * power(a, b - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Taban sayısını giriniz: ");
            int taban = scanner.nextInt();

            System.out.print("Us sayısını giriniz: ");
            int us = scanner.nextInt();

            if(us < 0){
                System.out.println("Üs negatif değer alamaz...");
                break;
            }

            int son = power(taban, us);
            System.out.println("Sonuc= " + son);
            
            System.out.println("İşlemi sonlandırmak istiyor musunuz? Yes/No");
            String secenek = scanner.nextLine();
            if(secenek.equals("Yes")){
                System.out.println("Güle güle...");
                break;
            }
        }
    }
}
