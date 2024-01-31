
import java.util.Scanner;


public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sayi1, sayi2, ebob=1,ekok;
        
        System.out.print("Birinci sayıyıs giriniz: ");
        sayi1 = scanner.nextInt();
            
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();
        
        int i = 1;
        while(i <=sayi1){
            if(sayi1 % i == 0 && sayi2 % i == 0){
                
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);
        

        while(i <= (sayi1*sayi2)){
            
            if(sayi1 % i == 0 && sayi2 % i == 0 ){
                
                break;
            }
            i++;
        }
        ekok = (sayi1 * sayi2)/ebob;
        System.out.println("Ekok: " + ekok);
    }
}
