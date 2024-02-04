
public class AsalSayi {
    public static void main(String[] args) {
        
        for(int i = 2; i <= 100; i++){
            boolean isAsal = true;
            
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isAsal = false;
                    break;
                }
            }
            if(isAsal){
                System.out.println("Asal Sayilar: " + i);
            }
        }
        
    }
}
