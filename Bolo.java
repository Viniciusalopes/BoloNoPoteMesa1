
package teste;

// @author Gustavo Gabriel

import java.util.Scanner;

 
public class Bolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        
        double x =input.nextDouble();
        while(x<=0){
            System.out.println("Erro! O valor informado deve ser maior que 0\nDigite novamente : ");
            x=input.nextDouble();
        }
    }
   
       
    }
    

