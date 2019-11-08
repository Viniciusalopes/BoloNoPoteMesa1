
import java.util.Scanner;

public class Fase2_etapa2 {
   
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
        
        int opc;
        
        do {
        System.out.println("Escolha a opção que você deseja ?\nReceita 1 - Leite ninho com morango"
                + "\nReceita 2 - Dois amores \nReceita 3 - Maracujá ");
         
        opc = entrada.nextInt();
        
        if (opc!=1 && opc!=2 && opc!=3){
            
            System.out.println("Opção invalida , escolha novamente");
        }
        
    }while(opc!=1 && opc!=2 && opc!=3);
    
}
}