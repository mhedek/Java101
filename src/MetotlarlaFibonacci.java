
import java.util.Scanner;


public class MetotlarlaFibonacci {
    static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        System.out.println(fib(sayi));
    }
}
