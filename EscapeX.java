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

    public static void main(String[] args) {

        System.out.println("Olá Jogador!!");
        System.out.println("Qual é o seu nome?");
        String nome = input.next();

        System.out.println(nome + " Bem Vindo ao EscapeX!");
        System.out.println("");
        System.out.println("Vamos contar um pouquinho da sua história!!");
        //contar um pouco da história do personagem.

        System.out.println("");
        System.out.println(nome + ", Nos dias de hoje você trabalha como crítico de "
                + " arte de um famoso museu,\n porém você esconde seu passado.");
        System.out.println("Você foi um falsificador muito famoso, e nunca foi pego! "
                + "Seu mentor Sr. X, ensinou tudo o que você sabe,\n tanto sobre falsificação como "
                + "os originais! "
                + "Você resolveu mudar de vida depois do sumiço de Sr. X!\n Ele era como um pai, "
                + "seu sumiço te deixou muito abalado.");
        System.out.println("");
        System.out.println("Hoje é um dos dias mais importantes da sua vida!\n"
                + "Faz 5 anos desde que você começou a trabalhar no museu e hoje será \n"
                + "a primeira grande exposição que irá acontecer no museu, sob sua responsabilidade.");
        System.out.println("");
        System.out.println("Porém ao invés de acordar no seu quarto, você acordou em um quarto desconhecido \n"
                + "com uma baita dor de cabeça! No quarto só existe uma cama caindo as pedaços, \n"
                + "um quadro e um balde.");
        System.out.println("");

        System.out.println(nome + ", Venha descobrir o que aconteceu!");
        int opcao;
        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(nome + ", Você está preso dentro de uma casa, onde para sair e \n"
                            + "descobrir o que aconteceu com você, você deverá buscar dicas e resolver problemas para sair de um comodo da casa. \n"
                            + "Coletar itens te dará benefícios durante o jogo!");
                    System.out.println("Após coletar todas as dicas dos comodos e resolver os mistérios, você conseguirá sair da casa \n\n ");
                    break;
                case 2:
                    //Inicia o Jogo
                    Jogar();
                    break;
                case 3:
                    System.out.println("Créditos: \n"
                            + "Desenvolvido por: \n"
                            + "Gabriel \n"
                            + "Jamile \n"
                            + "Rafael \n"
                            + "Vitor \n"
                            + "Projeto Integrador 1º semestre Senac 2020 \n\n");
                    break;
                case 4:
                    System.out.println("Você escolheu a opção Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4 && opcao != 2);
    }

    @SuppressWarnings("empty-statement")
    public static void Jogar() {

        System.out.println("Bora Jogar!");
        do {
            switch (comodo) {
                case 0:
                    System.out.println("Você está no quarto");
                    System.out.println("resolvido");
                    comodo = 1;
                    break;
                case 1:
                    System.out.println("Você está no corredor");
                    System.out.println("Escolha o comodo que você quer entrar:\n"
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
                    System.out.println("Você está no banheiro");
                    System.out.println("Você achou um armário, deseja abrir?");
                    String abrir = input.next();
                    
                        System.out.println("Você achou uma pista \n"
                                + "“No meu jardim existem 5 pés de tomate, "
                                + "\n1 de abacate e 2 de banana. Quantos pés eu tenho no total?”");
                    System.out.println("Guarde essa resposta!!!");
                   
                    System.out.println("");

                    System.out.println("Olhando mais de perto o chuveiro você achou cinco potes de Shampoo vazio!!");

                    System.out.println("Tinha marca de tinta fresca em um dos potes");

                    System.out.println("Atrás da pia você acha uma escova");

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
                        System.out.println("Qual a função de f(x)=xˆ2 + 3x - 10, para f(x)=0 ");
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
                                System.out.println("Escolha inválida!");

                        }
                    }
                        while (!acertou);

                        System.out.println("resolvido");
                        comodo = 1;
                        break;

                      case 3:
				System.out.println("Você está na garagem");
				System.out.println("resolvido");
				comodo = 6;
				break;
			case 4:
				System.out.println("Você está na cozinha");
				System.out.println("resolvido");
				comodo = 1;
				break;
			case 5:
				System.out.println("Você está na sala");
				System.out.println("Na sela você vê um sofá, uma TV, um armário e a porta. \n"
						+ "Escolha qual item você quer analisar:\n"
						+ "Sofá\n"
						+ "TV\n"
						+ "Armário\n"
						+ "Porta");
				String objeto = input.next();
				
				switch (objeto) {
				case "Sofá":
				case "Sofa":
				case "sofá":
				case "sofa":
					System.out.println("Em baixo das almofadas você encontra 1 grampo.");
				case "TV":
				case "tv":
				case "Tv":
					System.out.println("Na TV está escrito está equação:");
				case "Armário":
				case "armário":
				case "armario":
				case "Armario":
					System.out.println("Ao mexer no armário você encontra um fundo falso, deseja remover?");
					String fundo = input.next();
					if (fundo == "Sim") {
						System.out.println("Você encontrou um cofre\n"
								+ "para abri-lo resolva a equação:");
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