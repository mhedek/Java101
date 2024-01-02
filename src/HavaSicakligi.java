
import java.util.Scanner;


public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hava kaç derece: ");
        int air = scanner.nextInt();
        
        if(air < 5){
            System.out.println("Kayak yapmaya gidiniz...");
        }
        else if(air >= 5 && air <= 25){
            if(air < 16){
                System.out.println("Sinemaya gidiniz...");
            }
            if(air > 9){
                System.out.println("Pikniğe gidiniz...");
            }
        }
        else{
            System.out.println("Yüzmeye gidiniz...");
        }
    }
}
