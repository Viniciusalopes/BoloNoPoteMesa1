/*
 * 
Muitas receitas de bolos no pote não gastam mais do que R$ 30 para fazer uma receita para 15 unidades.
E essa é uma das maiores vantagens em começar a vender bolos no pote. Inclusive, com a chegada do natal, 
você pode até mesmo apostar em bolos para essa época do ano!
Assim, foram reunidas três de receitas de coberturas, de bolos no pote.
Desenvolver um software, onde:
DESAFIO
Desenvolver um software que ao digitar os valores dos ingredientes com suas respectivas medidas, devolva para o 
usuário qual/quais receita(s) ele poderá fazer dentro do limite de gasto proposto na contextualização.
1. Resolva a situação problema proposta. Com as três receitas. Os dados podem ser fictícios (valores e medidas).
2. Calcule automaticamente o valor de custo de cada bolo no pote (incluso o valor da embalagem);
3. Calcule quanto o usuário irá ter de lucro (em R$ e em %), dado um valor de venda.
4. O software pode ser rodado no console.
5. O software deverá ser apresentado para o(s) professor(es) da(s) disciplina(s) participante(s). “Rodando”.

Para a massa do bolo:
Ingredientes:
• 300 g de açúcar
• 300 g de margarina gelada
• 4 ovos médios
• 300 g de farinha de trigo com fermento
Recheios e Coberturas:

1. Leite ninho com morangos:

• 2 latas de leite condensado (300 gramas cada)
• 2 latas de creme de leite (300 gramas cada)
• 6 colheres (de sopa) de leite ninho (100 gramas cada)
• 20 morangos

2. Dois amores:

• 2 latas de leite condensado (300 gramas cada)
• 2 latas de creme de leite (300 gramas cada)
• 6 colheres de chocolate em pó (100 gramas cada)

3. Maracujá:

• 2 xícaras de suco de maracujá (240 ml)
• 4 colheres de amido de milho (5 gramas cada)
• 6 gemas
• 1 xícara de água (250 ml)
• 1 e 1/2 xícara de açúcar (200 gramas)

 */
package bolo.de.pote;

import java.util.Scanner;

/**
 *
 * @author miguelneto
 */
public class Fase1Etapa1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int NumReceitas = 3; 
        int[] receita1 = new int [NumReceitas]; // VETOR RECEITA LEITE NINHO COM MORANGO (1);
        int[] receita2 = new int [NumReceitas]; // VETOR RECEITA DOIS AMORES (2);
        int[] receita3 = new int [NumReceitas]; // VETOR RECEITA MARACUJA (3);
        
        int a = 0; // indice manipular vetor receita1; 
        int b = 0; // indice manipular vetor receita2;
        int c = 0; // indice manipular vetor receita3;
        
        char tipo = 0; // manipular switch case receita1 (1) , receita2 (2) , receita3 (3);
        
       // ##################  CALCULO  ###################;
        
       double quantidade_litro; // (ml) suco maracuja , agua ;
       double quandidade_unidade; // gramas cada;
       double valor_pago; // valor em R$;
       double valor_venda; // valor em R$;
       double lucro_real; // calculo;
       double lucro_porcent; // calculo;
       double custo_embalagem; // calculo;
       double conversor_ml; // calculo;
       double conversor_gramas; // calculo;
       double controlador_real; //bolos no pote não gastam mais do que R$ 30;
       double controlador_unidades;//fazer uma receita para 15 unidades;
       
       
    }
    
    
}
