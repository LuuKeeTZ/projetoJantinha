import java.util.Scanner;
public class projetoJantinha {
    public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);  
      
      char opc;
      int maxLin = 4, maxCol = 4;
      int [][] valores = new int [maxLin][maxCol];
      int cp1 = 0, cp2 = 0, cp3 = 0, cp0 = 0;
      double cvf;
      
      for(int i = 0; i < maxCol; i++){
          if(i == 0 ){
              System.out.println("Digite o valor de arroz dos pratos:");  
          }
          if(i == 1){
              System.out.println("Digite o valor do carne dos pratos:");
          }
          if(i == 2){
              System.out.println("Digite o valor da salada dos pratos:");
          }
          if(i == 3){
              System.out.println("Digite o valor do tropeiro dos pratos:");
          }
          
      for(int j = 0;j < maxLin; j++){
          if(i == 0 && j == 0 ){
              System.out.println("Prato 1");
          }
          if(i == 0 && j == 1){
              System.out.println("Prato 2");
          }
          if(i == 0 && j == 2){
              System.out.println("Prato 3");
          }
          if(i == 0 && j == 3){
              System.out.println("Prato Promoção");
          }
          if(i == 1 && j == 0){
              System.out.println("Prato 1");
          }
          if(i == 1 && j == 1){
              System.out.println("Prato 2");
          }
          if(i == 1 && j == 2){
              System.out.println("prato 3");
          }
          if(i == 1 && j == 3){
              System.out.println("Prato Promoção");
          }
          if(i == 2 && j == 0){
              System.out.println("Prato 1");
          }
          if(i == 2 && j == 1){
              System.out.println("Prato 2");
          }
          if(i == 2 && j == 2){
              System.out.println("Prato 3");
          }
          if(i == 2 && j == 3){
              System.out.println("Prato Promoção");
          }
          if(i == 3 && j == 0){
              System.out.println("Prato 1");
          }
          if(i == 3 && j == 1){
              System.out.println("Prato 2");
          }
          if(i == 3 && j == 2){
              System.out.println("Prato 3");
          }
          if(i == 3 && j == 3){
              System.out.println("Prato Promoção");
          }
          
          valores[i][j] = leia.nextInt();
          while(valores[i][j] < 0){
              System.out.println("Digite apenas valores positivos!!");
              valores[i][j] = leia.nextInt();
          }
        }
      }
      do{
          System.out.println("Qual prato escolhido? ( 0 , 1 ,2 , 3 )");
          int prato = leia.nextInt();
          
          if(prato == 0){
              //fazer o calculo do prato 1
              cp0 = cp0 + valores[0][0] + valores[1][0] + valores[2][0] + valores[3][0];
          }
          if(prato == 1){
              //fazer o calculo do prato 2
              cp1 = cp1 + valores[0][1] + valores[1][2] + valores[2][1] + valores[3][1];
          }
          if(prato == 2){
              //fazer o calculo do prato 3
              cp2 = cp2 + valores[0][2] + valores[1][2] + valores[2][2] + valores[3][2];
          }
          if(prato == 3){
              //fazr o calculo do prato promoção
              cp3 = cp3 + valores[0][3] + valores[1][3] + valores[2][3] + valores[3][3];
          }
          
          System.out.println("Deseja pedir outro? \nDigite n para sair e y para continuar");
          opc = leia.next().charAt(0);
      }while( opc != 'n');
      
      cvf = cp1 + cp2 + cp3 + cp0;  
      
      System.out.printf ("O valor final ficou: R$%.2f" , cvf ,"\n" );
        
        
        
        
        
        
    }
    
}
