
import java.util.Scanner;


public class armstrongSayısıBulma {
    public static void main(String[] args) {
        /* Arms Strong sayısı
        1634= 1^4 + 6^4 + 3^4 + 4^4 (basamak */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;
        
        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;            
        }
        
        tempNumber = number;
        while(tempNumber != 0){
            basValue = tempNumber % 10;
            // 1*1*1* = 1^4;
            basPow = 1;
            
            for(int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /=10;
        }
        if(result == number){
            System.out.println(result + " sayısı armstrong sayıdır!");
        }else{
            System.out.println(number + " sayısı armstrong sayı değildir!");
        }
        
    }
}
