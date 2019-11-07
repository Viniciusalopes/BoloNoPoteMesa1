package teste;

import java.util.Scanner;

 // @author Gustavo Gabriel
public class Bolo_no_Pote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Receita (1) (2) ou (3)");
        n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("Receita 1 (Leite ninho com morangos)\n\nIngredientes para a massa do bolo:\nAçúcar:\nMargarina:\nOvos:\nFarinha de trigo:\nFermento:\n\nRecheios e Coberturas:\nLeite condensado:\nCreme de leite:\nLeite ninho:\nMorangos:");
                break;
            case 2:
                System.out.println("Receita 2 (Dois amores)\n\nIngredientes para a massa do bolo:\nAçúcar:\nMargarina:\nOvos:\nFarinha de trigo:\nFermento:\n\nRecheios e Coberturas:\nLeite condensado:\nCreme de leite:\nChocolate em pó:");
                break;
            case 3:
                System.out.println("Receita 3 (Maracujá)\n\nIngredientes para a massa do bolo:\nAçúcar\nMargarina\nOvos\nFarinha de trigo\nFermento\n\nRecheios e Coberturas:\nSuco de maracujá:\nAmido de milho\n(Ovos)Gemas:\nAçúcar: ");
                break;
        }
    }

}
