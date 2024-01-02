
import java.util.Scanner;


public class siralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Sayi 1: ");
        a = scanner.nextInt();
        
        System.out.print("Sayi 2: ");
        b = scanner.nextInt();
        
        System.out.print("Sayi 3: ");
        c = scanner.nextInt();
        
        if(a > b && a > c){
            if(b > c){
                System.out.println("a > b > c == " + a + " > " + b + " > " + c );
            }
            else{
                System.out.println("a > c > b == " + a + " > " + c + " > " + b );
            }
        }
        else if(b > a && b > c){
            if(a > c){
                System.out.println("b > a > c == " + b + " > " + a + " > " + c );
            }
            else{
                System.out.println("b > c > a == " + b + " > " + c + " > " + a );
            }
        }
        else{
            if(a > b){
                System.out.println("c > a > b == " + c + " > " + a + " > " + b );
            }
            else{
                System.out.println("c > b > a == " + c + " > " + b + " > " + a );
            }
        }
    }
}
