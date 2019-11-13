/*
 * A licença MIT
 *
 * Copyright 2019 Viniciusalopes Tecnologia <suporte@viniciusalopes.com.br>.
 *
 * É concedida permissão, gratuitamente, a qualquer pessoa que obtenha uma cópia
 * deste software e dos arquivos de documentação associados (o "Software"), para
 * negociar o Software sem restrições, incluindo, sem limitação, os direitos de uso,
 * cópia, modificação e fusão, publicar, distribuir, sublicenciar e/ou vender cópias
 * do Software, e permitir que as pessoas a quem o Software é fornecido o façam,
 * sujeitas às seguintes condições:
 *
 * O aviso de copyright acima e este aviso de permissão devem ser incluídos em
 * todas as cópias ou partes substanciais do Software.
 *
 * O SOFTWARE É FORNECIDO "NO ESTADO EM QUE SE ENCONTRA", SEM NENHUM TIPO DE GARANTIA,
 * EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE COMERCIALIZAÇÃO,
 * ADEQUAÇÃO A UM FIM ESPECÍFICO E NÃO VIOLAÇÃO. EM NENHUMA CIRCUNSTÂNCIA, OS AUTORES
 * OU PROPRIETÁRIOS DE DIREITOS DE AUTOR PODERÃO SER RESPONSABILIZADOS POR QUAISQUER
 * REIVINDICAÇÕES, DANOS OU OUTRAS RESPONSABILIDADES, QUER EM AÇÃO DE CONTRATO,
 * DELITO OU DE OUTRA FORMA, DECORRENTES DE, OU EM CONEXÃO COM O SOFTWARE OU O USO
 * OU OUTRAS NEGOCIAÇÕES NO PROGRAMAS.
 * ------------------------------------------------------------------------------------------
 * Projeto   : Projeto Bolo no Pote - Matemática e Estatística - ADS1/2019 - Grupo A1
 * Criado em : 07/11/2019
 * Autores   : Gustavo Gabriel O. Souza
 *             Gustavo Henrique
 *             Lucas Araujo da Silva
 *             Miguel Gonçalves dos Santos Neto
               Renan de Paula
 *             
 * Finalidade: Projeto Bolos no Pote
 
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

 

 * ------------------------------------------------------------------------------------------
 */
package doc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Fase1_Etapa1 - miguelneto -----------------------------------------------------
        Scanner entrada = new Scanner(System.in);
         

        int NumReceitas = 3;
        double[][] receita1 = new double[9][2];
        double[][] receita2 = new double[8][2];
        double[][] receita3 = new double[10][2];
        boolean erro = false;
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

        // FIM Fase1_Etapa1 - miguelneto ------------------------------------------------------
        //
        // FIM Fase2_Etapa1 - renanrpads  -----------------------------------------------------
        System.out.println("Viabilidade das receitas:");
        System.out.println("Receita 1 - Leite ninho com morango\n"
                + "Receita 2 - Dois amores\n"
                + "Receita 3 - Maracujá\n\n"
                + "Escolha a opção que você deseja (1, 2 ou 3): ");
        // FIM Fase2_Etapa1 - renanrpads  -----------------------------------------------------
        //
        // Fase2_Etapa2 - gustavo henrique ----------------------------------------------------------
        int opc;

        do {

            try { // CORREÇÃO DA VALIDAÇÃO @GUSTAVO G.
                opc = entrada.nextInt();
                if (opc != 1 && opc != 2 && opc != 3) {
                    System.out.println("Você digitou uma opção inválida!");
                    System.out.println("Digite um número correspondente a uma das receitas !");
                }
            } catch (InputMismatchException e) {
                System.out.println("Você digitou uma opção inválida!");
                System.out.println("Digite um número correspondente a uma das receitas !");
                opc = 0;
            }
            entrada.nextLine();
        } while (opc == 0 || opc != 1 && opc != 2 && opc != 3);

        // FIM Fase2_Etapa2 - gustavo henrique  -----------------------------------------------------
        // 
        // Fase3_Etapa1 - gustavo  ----------------------------------------------------------
       switch (opc) {

            case 1:
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            if (i == 0) {
                                System.out.println("Açúcar\nQuantidade em Gramas : ");
                            }
                            if (i == 1) {
                                System.out.println("Margarina\nQuantidade em Gramas : ");
                            }
                            if (i == 2) {
                                System.out.println("Ovos\nQuantidade em Unidades : ");
                            }
                            if (i == 3) {
                                System.out.println("Farinha de trigo com Fermento\nQuantidade em Gramas : ");
                            }
                            if (i == 4) {
                                System.out.println("Leite condensado\nQuantidade em Gramas : ");
                            }
                            if (i == 5) {
                                System.out.println("Creme de leite\nQuantidade em Gramas : ");
                            }
                            if (i == 6) {
                                System.out.println("Leite ninho\nQuantidade em Gramas : ");
                            }
                            if (i == 7) {
                                System.out.println("Morangos\nQuantidade em Unidades : ");
                            }
                            if (i == 8) {
                                System.out.println("Potes de 220ml \nQuantidade em Unidades : ");
                            }
                            do {
                                try {
                                    receita1[i][j] = recebeQuantidadeProduto(i);
                                    erro = true;
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Erro! Você digitou um valor negativo ou igual a 0!");
                                        System.out.println("Digite um valor valido!");
                                        if (j == 0) {
                                            System.out.println("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.println("Valor: ");
                                        }

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro! opção invalida!");
                                    System.out.println("Digite um valor valido!");
                                    if (j == 0) {
                                        System.out.println("Quantidade: ");
                                    }
                                    if (j == 1) {
                                        System.out.println("Valor em R$ : ");
                                    }

                                }

                            } while (erro == false || receita1[i][j] <= 0);

                        } else if (j == 1) {
                            System.out.println("Valor em R$ : ");
                            do {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    erro = true;
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Erro! Você digitou um valor negativo ou igual a 0!");
                                        System.out.println("Digite um valor valido!");
                                        if (j == 0) {
                                            System.out.println("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.println("Valor em R$ : ");
                                        }

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro! opção invalida!");
                                    System.out.println("Digite um valor valido!");
                                    if (j == 0) {
                                        System.out.println("Quantidade: ");
                                    }
                                    if (j == 1) {
                                        System.out.println("Valor em R$ : ");
                                    }

                                }
                                entrada.nextLine();
                            } while (erro == false || receita1[i][j] <= 0);
                        }
                    }
                }
                break;
            case 2:
              for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            if (i == 0) {
                                System.out.println("Açúcar\nQuantidade em Gramas : ");
                            }
                            if (i == 1) {
                                System.out.println("Margarina\nQuantidade em Gramas : ");
                            }
                            if (i == 2) {
                                System.out.println("Ovos\nQuantidade em Unidades : ");
                            }
                            if (i == 3) {
                                System.out.println("Farinha de trigo com Fermento\nQuantidade em Gramas : ");
                            }
                            if (i == 4) {
                                System.out.println("Leite condensado\nQuantidade em Gramas : ");
                            }
                            if (i == 5) {
                                System.out.println("Creme de leite\nQuantidade em Gramas :  ");
                            }
                            if (i == 6) {
                                System.out.println("Chocolate em pó\nQuantidade em Gramas ");
                            }
                            if (i == 7) {
                                System.out.println("Potes de 220ml \nQuantidade em Unidades : ");
                            }
                            do {
                                try {
                                    receita1[i][j] = recebeQuantidadeProduto2(i);
                                    erro = true;
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Erro! Você digitou um valor negativo ou igual a 0!");
                                        System.out.println("Digite um valor valido!");
                                        if (j == 0) {
                                            System.out.println("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.println("Valor: ");
                                        }

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro! opção invalida!");
                                    System.out.println("Digite um valor valido!");
                                    if (j == 0) {
                                        System.out.println("Quantidade: ");
                                    }
                                    if (j == 1) {
                                        System.out.println("Valor em R$ : ");
                                    }

                                }

                            } while (erro == false || receita1[i][j] <= 0);

                        } else if (j == 1) {
                            System.out.println("Valor em R$ : ");
                            do {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    erro = true;
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Erro! Você digitou um valor negativo ou igual a 0!");
                                        System.out.println("Digite um valor valido!");
                                        if (j == 0) {
                                            System.out.println("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.println("Valor em R$ : ");
                                        }

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro! opção invalida!");
                                    System.out.println("Digite um valor valido!");
                                    if (j == 0) {
                                        System.out.println("Quantidade: ");
                                    }
                                    if (j == 1) {
                                        System.out.println("Valor em R$ : ");
                                    }

                                }
                                entrada.nextLine();
                            } while (erro == false || receita1[i][j] <= 0);
                        }
                    }
                }
                break;
            case 3:
               for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            if (i == 0) {
                                System.out.println("Açúcar\nQuantidade em Gramas : ");
                            }
                            if (i == 1) {
                                System.out.println("Margarina\nQuantidade em Gramas : ");
                            }
                            if (i == 2) {
                                System.out.println("Ovos\nQuantidade em Unidades : ");
                            }
                            if (i == 3) {
                                System.out.println("Farinha de trigo com Fermento\nQuantidade em Gramas : ");
                            }
                            if (i == 4) {
                                System.out.println("Suco de maracujá\nQuantidade em ml : ");
                            }
                            if (i == 5) {
                                System.out.println("Amido de milho\nQuantidade em Gramas : ");
                            }
                            if (i == 6) {
                                System.out.println("Água\nQuantidade em ml : ");
                            }
                            if (i == 7) {
                                System.out.println("Leite\nQuantidade em ml : ");
                            } if (i == 8) {
                                    System.out.println("Manteiga\nQuantidade em Gramas : ");
                                }if (i == 9) {
                                        System.out.println("Potes de 220ml\nQuantidade em Unidades : ");
                                    }
                            do {
                                try {
                                    receita1[i][j] = recebeQuantidadeProduto3(i);
                                    erro = true;
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Erro! Você digitou um valor negativo ou igual a 0!");
                                        System.out.println("Digite um valor valido!");
                                        if (j == 0) {
                                            System.out.println("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.println("Valor: ");
                                        }

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro! opção invalida!");
                                    System.out.println("Digite um valor valido!");
                                    if (j == 0) {
                                        System.out.println("Quantidade: ");
                                    }
                                    if (j == 1) {
                                        System.out.println("Valor em R$ : ");
                                    }

                                }

                            } while (erro == false || receita1[i][j] <= 0);

                        } else if (j == 1) {
                            System.out.println("Valor em R$ : ");
                            do {
                                try {
                                    receita1[i][j] = entrada.nextDouble();
                                    erro = true;
                                    if (receita1[i][j] <= 0) {
                                        System.out.println("Erro! Você digitou um valor negativo ou igual a 0!");
                                        System.out.println("Digite um valor valido!");
                                        if (j == 0) {
                                            System.out.println("Quantidade: ");
                                        }
                                        if (j == 1) {
                                            System.out.println("Valor em R$ : ");
                                        }

                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro! opção invalida!");
                                    System.out.println("Digite um valor valido!");
                                    if (j == 0) {
                                        System.out.println("Quantidade: ");
                                    }
                                    if (j == 1) {
                                        System.out.println("Valor em R$ : ");
                                    }

                                }
                                entrada.nextLine();
                            } while (erro == false || receita1[i][j] <= 0);
                        }
                    }
                }
                break;
                }
        }
    
        // FIM Fase3_Etapa1 - gustavo  -----------------------------------------------------

        /*
         * Fase4_Etapa2 -------------------------------------------------------------------
        
        Verificar se os ingredientes inseridos são suficientes para pelo menos uma receita
        Se SIM:
            Executar o código da Fase4_Etapa3
        Se NÃO:
            Exibe uma mensagem de erro.
            Solicita todos os ingredientes novamente.
            
        FIM Fase4_Etapa2 -------------------------------------------------------------------

         */
        //
        //
        //
        /* Fase4_Etapa3 -------------------------------------------------------------------

            Calcular o custo da receita
            Calcular o custo de um bolo
            Verificar se a receita é viável ou não, porque e % de lucro
        
        FIM Fase4_Etapa3 -------------------------------------------------------------------
         */
        //
        //
        //
        /* Fase5_Etapa1 (FINAL) -------------------------------------------------------------------
        
        Colocar todo o programa dentro de um laco e perguntar no final se deseja
        analisar outra receita.
        Se SIM:
            Volta para o início do programa
        Se Não:
            Encerra o programa.
        
        FIM Fase5_Etapa1 (FINAL) -------------------------------------------------------------------
         */
    private static double recebeQuantidadeProduto(int i) {
      

        Scanner entrada = new Scanner(System.in);

        int quantidadeMinima = 0;
        if (i == 0) {
            quantidadeMinima = 300;
        } else if (i == 1) {
            quantidadeMinima = 300;
        } else if (i == 2) {
            quantidadeMinima = 4;
        } else if (i == 3) {
            quantidadeMinima = 300;
        } else if (i == 4) {
            quantidadeMinima = 600;
        } else if (i == 5) {
            quantidadeMinima = 600;
        } else if (i == 6) {
            quantidadeMinima = 600;
        } else if (i == 7) {
            quantidadeMinima = 20;
        } else if (i == 8) {
            quantidadeMinima = 15;
        }

        int quantidade = entrada.nextInt();
        while (quantidade < quantidadeMinima) {
            System.out.println("Quantidade insuficiente, informe novamente: ");
            quantidade = entrada.nextInt();
        }

        return quantidade;
    }
    private static double recebeQuantidadeProduto2(int i) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeMinima = 0;
        if (i == 0) {
            quantidadeMinima = 300;
        } else if (i == 1) {
            quantidadeMinima = 300;
        } else if (i == 2) {
            quantidadeMinima = 4;
        } else if (i == 3) {
            quantidadeMinima = 300;
        } else if (i == 4) {
            quantidadeMinima = 600;
        } else if (i == 5) {
            quantidadeMinima = 600;
        } else if (i == 6) {
            quantidadeMinima = 600;
        } else if (i == 7) {
            quantidadeMinima = 15;
        }

        int quantidade = entrada.nextInt();
        while (quantidade < quantidadeMinima) {
            System.out.println("Quantidade insuficiente, informe novamente: ");
            quantidade = entrada.nextInt();
        }

        return quantidade;
    }
    private static double recebeQuantidadeProduto3(int i) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeMinima = 0;
        if (i == 0) {
            quantidadeMinima = 500;
        } else if (i == 1) {
            quantidadeMinima = 300;
        } else if (i == 2) {
            quantidadeMinima = 10;
        } else if (i == 3) {
            quantidadeMinima = 300;
        } else if (i == 4) {
            quantidadeMinima = 480;
        } else if (i == 5) {
            quantidadeMinima = 20;
        } else if (i == 6) {
            quantidadeMinima = 250;
        } else if (i == 7) {
            quantidadeMinima = 200;
        }else if (i == 8) {
            quantidadeMinima = 50;
        }else if (i == 9) {
            quantidadeMinima = 15;
        }

        int quantidade = entrada.nextInt();
        while (quantidade < quantidadeMinima) {
            System.out.println("Quantidade insuficiente, informe novamente: ");
            quantidade = entrada.nextInt();
        }

        return quantidade;
    }
    }

