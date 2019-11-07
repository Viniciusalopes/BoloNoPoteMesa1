import java.util.Scanner;

public class Fase2Etapa1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int X;
        
        System.out.println("Qual o sabor você deseja?!");
        System.out.println("(1)Leite ninho com morangos \n(2)Dois amores\n"
                + "(3)Maracuja ");
        
        X = entrada.nextInt();
        
        switch(X){
            case 1 :
                System.out.println("Leite ninho com morangos");
                break;
            case 2 :
                System.out.println("Dois amores");
                break;
            case 3 :
                System.out.println("Maracuja");
                break;
        }
       

       
    }
}
