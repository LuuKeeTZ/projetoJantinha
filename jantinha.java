import java.util.Scanner;
public class projetoJantinha {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);  
      
      int maxLin = 3, maxCol = 3;
      int [][] valores = new int [maxLin][maxCol];
      
      for(int i = 0; i < maxLin; i++){
          
        for(int j = 0;j < maxCol; j++){
              valores[i][j] = leia.nextInt();
              
          }
      }
        
        
        
        
        
        
    }
    
}

