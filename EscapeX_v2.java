/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EscapeX {

    static Scanner input = new Scanner(System.in);
    static int hablad = 0, comodo = 0;
    static String nome;
    static int grampos = 0;

    public static void main(String[] args) {

        System.out.println("OlÃ¡ Jogador!!");
        System.out.println("Qual Ã© o seu nome?");
        String nome = input.next();

        System.out.println(nome + " Bem Vindo ao EscapeX!");
        System.out.println("");
        System.out.println("Vamos contar um pouquinho da sua histÃ³ria!!");
        //contar um pouco da histÃ³ria do personagem.

        System.out.println("");
        System.out.println(nome + ", Nos dias de hoje vocÃª trabalha como crÃ­tico de "
                + " arte de um famoso museu,\n porÃ©m vocÃª esconde seu passado.");
        System.out.println("VocÃª foi um falsificador muito famoso, e nunca foi pego! "
                + "Seu mentor Sr. X, ensinou tudo o que vocÃª sabe,\n tanto sobre falsificaÃ§Ã£o como "
                + "os originais! "
                + "VocÃª resolveu mudar de vida depois do sumiÃ§o de Sr. X!\n Ele era como um pai, "
                + "seu sumiÃ§o te deixou muito abalado.");
        System.out.println("");
        System.out.println("Hoje Ã© um dos dias mais importantes da sua vida!\n"
                + "Faz 5 anos desde que vocÃª comeÃ§ou a trabalhar no museu e hoje serÃ¡ \n"
                + "a primeira grande exposiÃ§Ã£o que irÃ¡ acontecer no museu, sob sua responsabilidade.");
        System.out.println("");
        System.out.println("PorÃ©m ao invÃ©s de acordar no seu quarto, vocÃª acordou em um quarto desconhecido \n"
                + "com uma baita dor de cabeÃ§a! No quarto sÃ³ existe uma cama caindo as pedaÃ§os, \n"
                + "um quadro e um balde.");
        System.out.println("");

        System.out.println(nome + ", Venha descobrir o que aconteceu!");
        int opcao;
        do {
            System.out.println("1 - InstruÃ§Ãµes");
            System.out.println("2 - Jogar");
            System.out.println("3 - CrÃ©ditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opÃ§Ã£o: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(nome + ", VocÃª estÃ¡ preso dentro de uma casa, onde para sair e \n"
                            + "descobrir o que aconteceu com vocÃª, vocÃª deverÃ¡ buscar dicas e resolver problemas para sair de um comodo da casa. \n"
                            + "Coletar itens te darÃ¡ benefÃ­cios durante o jogo!");
                    System.out.println("ApÃ³s coletar todas as dicas dos comodos e resolver os mistÃ©rios, vocÃª conseguirÃ¡ sair da casa \n\n ");
                    break;
                case 2:
                    //Inicia o Jogo
                    Jogar();
                    break;
                case 3:
                    System.out.println("CrÃ©ditos: \n"
                            + "Desenvolvido por: \n"
                            + "Gabriel \n"
                            + "Jamile \n"
                            + "Rafael \n"
                            + "Vitor \n"
                            + "Projeto Integrador 1Âº semestre Senac 2020 \n\n");
                    break;
                case 4:
                    System.out.println("VocÃª escolheu a opÃ§Ã£o Sair");
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida!");
            }
        } while (opcao != 4 && opcao != 2);
    }

    @SuppressWarnings("empty-statement")
    public static void Jogar() {

        System.out.println("Bora Jogar!");
        do {
            switch (comodo) {
                case 0:
                    System.out.println("VocÃª estÃ¡ no quarto");
                    System.out.println("resolvido");
                    comodo = 1;
                    break;
                case 1:
                    System.out.println("VocÃª estÃ¡ no corredor");
                    System.out.println("Escolha o comodo que vocÃª quer entrar:\n"
                            + "Banheiro\n"
                            + "Garagem\n"
                            + "Cozinha\n"
                            + "Sala\n");
                    String comodo2 = input.next();

                    switch (comodo2) {
                        case "Banheiro":
                        case "banheiro":
                            comodo = 2;
                            break;
                        case "Garagem":
                        case "garagem":
                            comodo = 3;
                            break;
                        case "Cozinha":
                        case "cozinha":
                            comodo = 4;
                            break;
                        case "Sala":
                        case "sala":
                            comodo = 5;
                            break;

                    }
                    break;
                case 2:
                    System.out.println("VocÃª estÃ¡ no banheiro");
                    System.out.println("VocÃª achou um armÃ¡rio, deseja abrir?");
                    String abrir = input.next();
                    
                        System.out.println("VocÃª achou uma pista \n"
                                + "â€œNo meu jardim existem 5 pÃ©s de tomate, "
                                + "\n1 de abacate e 2 de banana. Quantos pÃ©s eu tenho no total?â€�");
                    System.out.println("Guarde essa resposta!!!");
                   
                    System.out.println("");

                    System.out.println("Olhando mais de perto o chuveiro vocÃª achou cinco potes de Shampoo vazio!!");

                    System.out.println("Tinha marca de tinta fresca em um dos potes");

                    System.out.println("AtrÃ¡s da pia vocÃª acha uma escova");

                    System.out.println("Para sair do banheiro resolva o enigma:   ");

           
                    boolean acertou = false;
                    List alternativas = new ArrayList();
                    alternativas.add("2,-5"); // resposta correta
                    alternativas.add("1,-3");
                    alternativas.add("5,-2");
                    alternativas.add("2,4");
                    alternativas.add("0,3");
                    do {
                        Collections.shuffle(alternativas);
                        System.out.println("Qual a funÃ§Ã£o de f(x)=xË†2 + 3x - 10, para f(x)=0 ");
                        System.out.println("a) " + alternativas.get(0));
                        System.out.println("b) " + alternativas.get(1));
                        System.out.println("c) " + alternativas.get(2));
                        System.out.println("d) " + alternativas.get(3));
                        System.out.println("e) " + alternativas.get(4));
                        System.out.print("Escolha uma alternativa: ");
                        String resposta = input.next();
                        switch (resposta) {
                            case "a":
                            case "A":
                                if (alternativas.get(0).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    acertou = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "b":
                            case "B":
                                if (alternativas.get(1).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    acertou = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "c":
                            case "C":
                                if (alternativas.get(2).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    acertou = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "d":
                            case "D":
                                if (alternativas.get(3).equals("2,-5")) {
                                    System.out.println("Resposta correta!");

                                    acertou = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "e":
                            case "E":
                                if (alternativas.get(4).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    acertou = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            default:
                                System.out.println("Escolha invÃ¡lida!");

                        }
                    }
                        while (!acertou);

                        System.out.println("resolvido");
                        comodo = 1;
                        break;

            case 3:
				System.out.println("VocÃª estÃ¡ na garagem");
				System.out.println("Escolha um dos itens para analisar ou 'Porta' para tentar sair: \n"
				+ "Caixa\n"
				+ "Pneu\n"
				+ "Corrente\n"
				+ "Porta");
				
				String objeto = input.next();
				
				switch (objeto) {
				case "caixa:
				case "Caixa":
					System.out.println("A caixa está trancada. Você pode utilizar um grampo para abri-la ou resolver uma equação de 2º. Digite uma das opções: "
							+ "1. Usar grampo \n"
							+ "2. Resolver uma equação \n");
					String objeto = input.next();
					case "1:"
						if (grampos >= 1) {
							grampos -= 1;
							System.out.println("Caixa aberta. Você encontrou 3 grampos e 1 chave. \n"
									+ "Será redirecionado para a opção anterior. ")
							grampos+=3;
							chaveG+=1;
						} else {
							System.out.println("Você não possui grampos suficientes. Voltará para a opção anterior")
						}
						comodo = 3;
                        break;
					case "2":
	                    boolean acertou = false;
	                    List alternativas = new ArrayList();
	                    alternativas.add("– 16"); // resposta correta
	                    alternativas.add("16");
	                    alternativas.add("10");
	                    alternativas.add("– 10");
	                    alternativas.add("– 13");
	                    do {
	                        Collections.shuffle(alternativas);
	                        System.out.println("Qual é o resultado da soma das raízes reais da função f(x) = x2 + 16x + 39? ");
	                        System.out.println("a) " + alternativas.get(0));
	                        System.out.println("b) " + alternativas.get(1));
	                        System.out.println("c) " + alternativas.get(2));
	                        System.out.println("d) " + alternativas.get(3));
	                        System.out.println("e) " + alternativas.get(4));
	                        System.out.print("Escolha uma alternativa: ");
	                        String resposta = input.next();
	                        switch (resposta) {
	                            case "a":
	                            case "A":
	                                if (alternativas.get(0).equals("– 16")) {
	                                    System.out.println("Resposta correta!");
	                                    acertou = true;
	                                } else {
	                                    System.out.println("Resposta incorreta!");
	                                }
	                                break;
	                            case "b":
	                            case "B":
	                                if (alternativas.get(1).equals("– 16")) {
	                                    System.out.println("Resposta correta!");
	                                    acertou = true;
	                                } else {
	                                    System.out.println("Resposta incorreta!");
	                                }
	                                break;
	                            case "c":
	                            case "C":
	                                if (alternativas.get(2).equals("– 16")) {
	                                    System.out.println("Resposta correta!");
	                                    acertou = true;
	                                } else {
	                                    System.out.println("Resposta incorreta!");
	                                }
	                                break;
	                            case "d":
	                            case "D":
	                                if (alternativas.get(3).equals("– 16")) {
	                                    System.out.println("Resposta correta!");

	                                    acertou = true;
	                                } else {
	                                    System.out.println("Resposta incorreta!");
	                                }
	                                break;
	                            case "e":
	                            case "E":
	                                if (alternativas.get(4).equals("– 16")) {
	                                    System.out.println("Resposta correta!");
	                                    acertou = true;
	                                } else {
	                                    System.out.println("Resposta incorreta!");
	                                }
	                                break;
	                            default:
	                                System.out.println("Escolha invÃ¡lida!");

	                        }
	                    }
	                        while (!acertou);

	                        System.out.println("Caixa aberta. Você encontrou 3 grampos e 1 chave.");
	                        grampos+=3;
							chaveG+=1;
	                        comodo = 3;
	                        break;
						
				case "Pneu":
				case "pneu":
					System.out.println("Embaixo do Pneu foram encontrados 2 grampos.");
                    grampos+=2;
                    comodo = 3;
                    break;
				case "Corrente":
				case "corrente":
					System.out.println("Nenhum utensílio encontrado.");
                    comodo = 3;
                    break;
				case "porta":
				case "Porta":
					System.out.println("Para abrir a porta, você precisa de no mínimo 5 grampos ou da chave. Tentando abrir... ");
					if (grampos >= 5) || (chaveG >= 1){
						System.out.println("Porta aberta!");
						comodo = 6;
						break;						
					}else{System.out.println("Quantidade de grampos/chave insuficiente!");
						 comodo =3;
						 break
						 }		
				
				default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida!");
                    comodo =3;
					break
                    
			case 4:
				System.out.println("VocÃª estÃ¡ na cozinha");
				System.out.println("resolvido");
				comodo = 1;
				break;
			case 5:
				System.out.println("VocÃª estÃ¡ na sala");
				System.out.println("Na sela vocÃª vÃª um sofÃ¡, uma TV, um armÃ¡rio e a porta. \n"
						+ "Escolha qual item vocÃª quer analisar:\n"
						+ "SofÃ¡\n"
						+ "TV\n"
						+ "ArmÃ¡rio\n"
						+ "Porta");
				String objeto = input.next();
				
				switch (objeto) {
				case "SofÃ¡":
				case "Sofa":
				case "sofÃ¡":
				case "sofa":
					System.out.println("Em baixo das almofadas vocÃª encontra 1 grampo.");
				case "TV":
				case "tv":
				case "Tv":
					System.out.println("Na TV estÃ¡ escrito estÃ¡ equaÃ§Ã£o:");
				case "ArmÃ¡rio":
				case "armÃ¡rio":
				case "armario":
				case "Armario":
					System.out.println("Ao mexer no armÃ¡rio vocÃª encontra um fundo falso, deseja remover?");
					String fundo = input.next();
					if (fundo == "Sim") {
						System.out.println("VocÃª encontrou um cofre\n"
								+ "para abri-lo resolva a equaÃ§Ã£o:");
					}
				
				}
				
				comodo = 6;
				break;
			case 6:
				System.out.println("saiu");
				comodo = 7;
				break;									 
			} 
		
            }
            while (comodo != 7);
            System.out.println("FIM!");

        }

    

    public static void HabAbrePort() {
        if (comodo == 5 && comodo == 3) {
            int dado = (int) (1 + Math.random() * (48 - hablad));
        } else {
            int dado = (int) (1 + Math.random() * (6 - hablad));
        }

    }

}
