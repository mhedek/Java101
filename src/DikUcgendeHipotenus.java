
import java.util.Scanner;


public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a,b;
        double alan,hip,cevre;
        
        System.out.print("a kenarını giriniz: ");
        a = scanner.nextInt();
        
        System.out.print("b kenarını giriniz: ");
        b = scanner.nextInt();
        
        hip =Math.sqrt((a*a) + (b*b));
        
        alan = (a*b) / 2;
        
        cevre = a + b + hip;
        
        System.out.println("Hipotenus= " + hip);
        System.out.println("Alan = " + alan);
        System.out.println("Çevre = " + cevre);
        
    }
}
