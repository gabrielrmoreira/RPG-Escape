/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapex1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EscapeX1 {

    static Scanner input = new Scanner(System.in);
    static int hablad = 0, comodo = 0;

    public static void main(String[] args) {

        System.out.println("Olá Jogador!!");
        System.out.println("Qual é o seu nome?");
        String nome = jogador();

        System.out.println("----***" + nome + " Bem Vindo ao EscapeX!***----");
        System.out.println("");
        System.out.println("Vamos contar um pouquinho da sua história!!");
        //contar um pouco da história do personagem.
        pressEnter();
        System.out.println("");
        System.out.println(nome + ", Nos dias de hoje você trabalha como crítico de "
                + " arte de um famoso museu,\n porém você esconde seu passado.");

        System.out.println("Você foi um falsificador muito famoso, e nunca foi pego! "
                + "Seu mentor Sr. X, ensinou tudo o que você sabe,\n tanto sobre falsificação como "
                + "os originais! "
                + "Você resolveu mudar de vida depois do sumiço de Sr. X!\n Ele era como um pai, "
                + "seu sumiço te deixou muito abalado.");
        pressEnter();
        System.out.println("");
        System.out.println("Hoje é um dos dias mais importantes da sua vida!\n"
                + "Faz 5 anos desde que você começou a trabalhar no museu e hoje será \n"
                + "a primeira grande exposição que irá acontecer no museu, sob sua responsabilidade.");
        System.out.println("");
        System.out.println("Porém ao invés de acordar no seu quarto, você acordou em um quarto desconhecido \n"
                + "com uma baita dor de cabeça! No quarto só existe uma cama caindo as pedaços, \n"
                + "um quadro e um balde.");
        System.out.println("");

        System.out.println(nome + ",**** Venha descobrir o que aconteceu!****");
        pressEnter();
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

        System.out.println("----*****  Bora Jogar  ****----!");
        do {

            switch (comodo) {
                case 0:
                    System.out.println("Você está no quarto");
                    System.out.println("Você olha em volta e não reconhece onde está\n"
                            + "nem sabe porque está ali."
                            + "\n olhando ao redor, percebe que só tem uma cama velha, um quadro e um balde jogado no canto ");
                    pressEnter();

                    System.out.println("Diz: O que estou fazendo aqui?");
                    System.out.println("Vai até a porta e tenta abrir!!");
                    pressEnter();
                    System.out.println("Sem saber o que fazer começa a procurar uma maneira de sair do quarto");
                    System.out.println("Ao prestar atenção no quadro você acha familiar, mas não consegue se lembrar!");

                    System.out.println("Deseja olhar o quadro melhor?S/N");
                    String olhar;
                    olhar = input.next();
                    if (olhar.equalsIgnoreCase("S")) {
                        // acrescentar if else 

                        System.out.println("Chegue mais perto");
                        pressEnter();
                        System.out.println("Cada vez o quadro parece mais familiar");
                        System.out.println("Tem alguma coisa escrita no quadro\n"
                                + "Você está aqui para eu te ajudar!"
                                + "Lembre do início da sua jornada!!");
                        System.out.println("Esse foi o primeiro quadro que eu te mostrei.");
                        pressEnter();
                        System.out.println("Estou aqui para te ajudar");
                        System.out.println("Diz: Não é possível, Sr. X, você desapareceu, como você vai me ajudar!!");
                        System.out.println("continua lendo o quadro: Lembre de tudo que eu te ensinei.");
                        System.out.println("Respirando fundo: O que o senhor quis dizer com isso. Você se lembra que\n"
                                + "o primeiro ensinamento que ele lhe ensinou foi procurar por pequenas pistas\n"
                                + "que poderiam te ajudar a descobrir se um quadro era verdadeiro ou falso");
                        System.out.println("Pensando nisso começa a analisar melhor o quarto a procura de uma pista");
                        pressEnter();
                    } else {
                        System.out.println("Pense Melhor!!");
                    }

                    int contador = 0;
                    do {

                        System.out.println("Na quarto você vê a cama e o balde \n"
                                + "Escolha qual item você quer analisar:\n"
                                + "Cama\n"
                                + "Balde\n");
                        String escolha = input.next();

                        switch (escolha) {
                            case "Cama":
                            case "cama":

                                System.out.println("Revirando a cama, você não acha nada relevante\n");
                                contador = contador + 1;
                                break;

                            case "Balde":
                            case "balde":

                                System.out.println("Dentro do balde, você acha uma chave e um enigma.\n");
                                contador = contador + 1;
                                break;

                        }
                    } while (contador < 2);

                    System.out.println("---*** Resolva o enigma e use a chave para sair do quarto ***---!!");
                    System.out.println("");
                    pressEnter();

                    boolean acertou = false;

                    do {
                        System.out.println("---  Dada a função de primeiro grau f(x) = 2x+3, Qual o valor de f(10) ---?");
                        System.out.println("a) 23"); // resposta correta
                        System.out.println("b) 33");
                        System.out.println("c) 10");
                        System.out.println("d) 30");
                        System.out.println("e) 13");
                        System.out.print("Escolha uma alternativa: ");

                        String alternativa;
                        alternativa = input.next();

                        switch (alternativa) {
                            case "a":
                            case "A":
                                System.out.println("Resposta correta!");
                                acertou = true;

                                break;
                            case "b":
                            case "B":
                            case "c":
                            case "C":
                            case "d":
                            case "D":
                            case "e":
                            case "E":
                                System.out.println("Resposta incorreta!");

                                break;
                            default:
                                System.out.println("Escolha inválida!");

                        }
                    } while (!acertou);

                    System.out.println("");

                    System.out.println("");
                    System.out.println("resolvido");
                    System.out.println("");
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

                    int contador1 = 0;
                    do {
                        System.out.println("Você está no banheiro, Desejar olhar: \n"
                                + "Armário\n"
                                + "Chuveiro\n"
                                + "Vaso\n");
                        String banheiro1 = input.next();
                        switch (banheiro1) {
                            case "Armário":
                            case "armário":
                            case "armario":
                            case "Armario":
                                System.out.println("Você achou um armário, deseja abrir?S/N");

                                String S;
                                S = input.next();

                                if (S.equalsIgnoreCase("S")) {

                                    System.out.println("Você achou uma pista \n"
                                            + "“No meu jardim existem 5 pés de tomate, "
                                            + "\n1 de abacate e 2 de banana. Quantos pés eu tenho no total?”");
                                    pressEnter();
                                    System.out.println("Guarde essa resposta!!!");
                                    contador1 = contador1 + 1;

                                } else {
                                    System.out.println("Continue procurando!!");

                                }
                                break;
                            case "Chuveiro":
                            case "chuveiro":
                                System.out.println("Olhando mais de perto o chuveiro você achou cinco potes de Shampoo vazio!!");
                                System.out.println("Tinha marca de tinta fresca em um dos potes");
                                pressEnter();
                                System.out.println("Isso quer dizer que alguém esteve aqui a pouco tempo");
                                System.out.println("Dentro do pote tem um grampo e outro bilhete:");//somar grampo
                                pressEnter();
                                System.out.println("Qual foi o conselho mais importante que eu te ensinei???");
                                System.out.println("Sempre olhar tudo nos minimos detalhes, tudo o que fizer faça com perfeição");
                                System.out.println("Com esse pensamento, gostaria de olhar os potes novamente?S/N");
                                String pote;
                                pote = input.next();
                                if (pote.equalsIgnoreCase("s")) {

                                    System.out.println("Olhando atentamente os potes de shampoo, você repara que eles foram falsificados.");
                                    System.out.println("O que será que isso tem haver?? \n"
                                            + "Como isso pode me ajudar!!");
                                    System.out.println("Olhou novamente mas não conseguiu identificar mais nada.\n");

                                    contador1 = contador1 + 1;
                                } else {

                                }

                                break;
                            case "Vaso":
                            case "vaso":
                                System.out.println("Atrás da vaso você acha uma escova");
                                System.out.println("Na tampa do vaso, está a chave do próximo comodo,"
                                        + "Para sair do comodo responda corretamente!! ");

                                contador1 = contador1 + 1;
                        }
                    } while (contador1 < 3);

                    pressEnter();

                    boolean correto = false;
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
                                    correto = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "b":
                            case "B":
                                if (alternativas.get(1).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    correto = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "c":
                            case "C":
                                if (alternativas.get(2).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    correto = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "d":
                            case "D":
                                if (alternativas.get(3).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    correto = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "e":
                            case "E":
                                if (alternativas.get(4).equals("2,-5")) {
                                    System.out.println("Resposta correta!");
                                    correto = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            default:
                                System.out.println("Escolha inválida!");

                        }
                    } while (!correto);

                    System.out.println("resolvido");
                    System.out.println("");
                    comodo = 1;
                    break;

                case 3:
                    System.out.println("Você está na garagem");
                    System.out.println("Ao entrar na garagem, você se depara com uma bancada com ferramentas,\n"
                            + "um quadro de carros que também lhe parece familiar\n"
                            + "e um armário velho!");
                    System.out.println("Em cima da bancada tem uma caixa, dentro do armário tem correntes penduradas,\n"
                            + "jogados no chão uma pilha de pneus.");

                    
                   int contador3 = 0;
                   do {
                       System.out.println("Escolha um dos itens para analisar ou 'Porta' para tentar sair: \n"
                            + "Caixa\n"
                            + "Pneu\n"
                            + "Corrente\n"
                            + "Porta");
                    int grampos = 1;
                    int chaveG = 0;
                    String objeto1 = input.next();
                        
                    switch (objeto1) {
                   
                        case "Caixa":
                        case "caixa":
                            System.out.println("A caixa está trancada. Você pode utilizar um grampo para abri-la ou resolver uma equação de 2º. Digite uma das opções: "
                                    + "1. Usar grampo \n"
                                    + "2. Resolver uma equação \n");
                            String grampo = input.next();
                         contador3=contador3+1;  
                           case "1":

                            if (grampos >= 1) {

                                grampos -= 1;
                                System.out.println("Caixa aberta. Você encontrou 3 grampos e 1 chave,  \n"
                                        + "e um bilhete: Espero que você ja tenha entendido porque te prendi aqui."
                                        + "Estou tentando salvar sua carreira"
                                        + "Será redirecionado para a opção anterior. ");
                                grampos += 3;
                                chaveG += 1;
                            } else {
                                System.out.println("Você não possui grampos suficientes. Voltará para a opção anterior");
                            }
                            comodo = 3;
                            break;
                        case "2":
                            boolean acertou1 = false;
                            List alternativas1 = new ArrayList();
                            alternativas1.add("– 16"); // resposta correta
                            alternativas1.add("16");
                            alternativas1.add("10");
                            alternativas1.add("– 10");
                            alternativas1.add("– 13");
                            do {
                                Collections.shuffle(alternativas1);
                                System.out.println("Qual é o resultado da soma das raízes reais da função f(x) = x2 + 16x + 39? ");
                                System.out.println("a) " + alternativas1.get(0));
                                System.out.println("b) " + alternativas1.get(1));
                                System.out.println("c) " + alternativas1.get(2));
                                System.out.println("d) " + alternativas1.get(3));
                                System.out.println("e) " + alternativas1.get(4));
                                System.out.print("Escolha uma alternativa: ");
                                String resposta = input.next();
                                switch (resposta) {
                                    case "a":
                                    case "A":
                                        if (alternativas1.get(0).equals("– 16")) {
                                            System.out.println("Resposta correta!");
                                            acertou1 = true;
                                        } else {
                                            System.out.println("Resposta incorreta!");
                                        }
                                        break;
                                    case "b":
                                    case "B":
                                        if (alternativas1.get(1).equals("– 16")) {
                                            System.out.println("Resposta correta!");
                                            acertou1 = true;
                                        } else {
                                            System.out.println("Resposta incorreta!");
                                        }
                                        break;
                                    case "c":
                                    case "C":
                                        if (alternativas1.get(2).equals("– 16")) {
                                            System.out.println("Resposta correta!");
                                            acertou1 = true;
                                        } else {
                                            System.out.println("Resposta incorreta!");
                                        }
                                        break;
                                    case "d":
                                    case "D":
                                        if (alternativas1.get(3).equals("– 16")) {
                                            System.out.println("Resposta correta!");

                                            acertou1 = true;
                                        } else {
                                            System.out.println("Resposta incorreta!");
                                        }
                                        break;
                                    case "e":
                                    case "E":
                                        if (alternativas1.get(4).equals("– 16")) {
                                            System.out.println("Resposta correta!");
                                            acertou1 = true;
                                        } else {
                                            System.out.println("Resposta incorreta!");
                                        }
                                        break;
                                    default:
                                    

                                }
                            } while (!acertou1);

                            System.out.println("Caixa aberta. Você encontrou 3 grampos e 1 chave.");
                            grampos += 3;
                            chaveG += 1;
                            comodo = 3;
                            break;

                        case "Pneu":
                        case "pneu":
                            System.out.println("Embaixo do Pneu foram encontrados 2 grampos.");
                            grampos += 2;
                            contador3=contador3+1;
                            comodo = 3;
                            break;
                        case "Corrente":
                        case "corrente":
                            System.out.println("Nenhum utensílio encontrado.");
                            contador3=contador3+1;
                            comodo = 3;
                            break;
                        case "porta":
                        case "Porta":
                            System.out.println("Para abrir a porta, você precisa de no mínimo 5 grampos ou da chave. Tentando abrir... ");
                            if (grampos >= 5 || chaveG >= 1) {
                                contador3=contador3+1;
                                System.out.println("Porta aberta!");
                                comodo = 6;
                                break;
                            } else {
                                System.out.println("Quantidade de grampos/chave insuficiente!");
                            }
                            comodo = 1;
                            break;
                    }
                 } while (contador3<3);

                default:
                    System.out.println("Opção Inválida!");
                    comodo = 3;
                    System.out.println("Resolvido");
                    comodo = 1;
                    break;

                case 4:
                     int contador4=0;
                    do{
                    System.out.println("Você está na cozinha");
                    System.out.println("Na cozinha você vê uma geladeira, um fogão, uma pia e armário.\n"
                            + "Escolha qual item você quer analisar:\n"
                            + "Geladeira\n"
                            + "Fogão\n"
                            + "Pia\n"
                            + "Armário ");
                    String moveis = input.next();
                   
                    switch (moveis) {
                        case "Geladeira":
                        case "geladeira":
                        
                            System.out.println("Você abre a geladeira e ela está praticamente vazia,\n"
                                    + "Só tem um leite e um pote com resto de comida.");
                            System.out.println("Você deseja olhar melhor?S/N");
                                  String S;
                                S = input.next();

                                if (S.equalsIgnoreCase("S")) {

                                    System.out.println("Você analisa o leite e que tem uma pequena foto coloda."
                                           );
                                    pressEnter();
                                    System.out.println("Na foto você reconhece o Sr. X e outra pessoa que foi amiga do Sr.X\n"
                                            + "E que brigaram e nunca mais se falaram, e tem uma criança na foto que você\n"
                                            + "não reconhece mas que lhe parece familiar.\n");
                                 
                                    System.out.println("Você fica olhando a foto, tentando lembrar de onde conhece a criança\n"
                                            + "por fim guarda a foto e continua procurando!");
                                    contador4=contador4+1;
                                    pressEnter();

                                } else {
                                    System.out.println("Continue procurando!!");
                                    
                                }
                                break;
                        case "Fogão":
                        case "fogao":
                        case "fogão":
                        case "Fogao":
                            System.out.println("No fogão tem panelas velhas.\n");
                            System.out.println("Você revira as panelas mas não encontra nada.");
                            System.out.println("No forno você acha uma caixa.\n");
                            System.out.println("Deseja abrir a caixa?s/n");
                             String caixa1;
                               caixa1 = input.next();

                                if (caixa1.equalsIgnoreCase("S")){
                                    System.out.println("Dentro da caixa tem a chave da sala.");
                                }
                                else{
                                    System.out.println("Continue procurando.");
                                } 
                                    contador4=contador4+1;
                                    break;
                            
                        case "Armário":
                        case "armário":
                        case "armario":
                        case "Armario":
                            System.out.println("Dentro do primeiro armário você não encontra nada");
                            System.out.println("No segundo armário, você encontra uma foto da criança um pouco mais velha, pintando um quadro\n"
                                    + "que você tem certeza que já viu.");
                            pressEnter();
                            System.out.println("Nos outros armários você não encontra mais nada");
                            contador4=contador4+1;
                            break;
                            
                        case "Pia":
                        case "pia":
                            
                            System.out.println("Na pia tem um copo e um prato, e um guardanapo amassado.");
                            System.out.println("Deseja abrir o guardanapo?");
                            String guardanapo = input.next();
                            
                            if (guardanapo.equalsIgnoreCase("S")) {
                                System.out.println("No guardanapo não tem nada escrito é só um papel amassado\n"
                                        + "Resolva o enigma para sair da cozinha");
                            } else {
                                
                    
                    System.out.println("Continue procurando");
                    contador4=contador4+1;
                    comodo = 1;
                            }
                            }
                   
                    } while (contador4<3); 
                    
                    
                     boolean correto3 = false;
                    List alternativas2 = new ArrayList();
                    alternativas2.add("1,3"); // resposta correta
                    alternativas2.add("3,1");
                    alternativas2.add("-1,11");
                    alternativas2.add("1,-3");
                    alternativas2.add("2,5");
                    do {
                        Collections.shuffle(alternativas2);
                        System.out.println("Qual os vertices da funçãoF(x)=2xˆ2-4x+5");
                        System.out.println("a) " + alternativas2.get(0));
                        System.out.println("b) " + alternativas2.get(1));
                        System.out.println("c) " + alternativas2.get(2));
                        System.out.println("d) " + alternativas2.get(3));
                        System.out.println("e) " + alternativas2.get(4));
                        System.out.print("Escolha uma alternativa: ");
                        String resposta = input.next();
                        switch (resposta) {
                            case "a":
                            case "A":
                                if (alternativas2.get(0).equals("1,3")) {
                                    System.out.println("Resposta correta!");
                                    correto3 = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                                case "b":
                            case "B":
                                if (alternativas2.get(1).equals("1,3")) {
                                    System.out.println("Resposta correta!");
                                    correto3 = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "c":
                            case "C":
                                if (alternativas2.get(2).equals("1,3")) {
                                    System.out.println("Resposta correta!");
                                    correto3 = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "d":
                            case "D":
                                if (alternativas2.get(3).equals("1,3")) {
                                    System.out.println("Resposta correta!");
                                    correto3 = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                }
                                break;
                            case "e":
                            case "E":
                                if (alternativas2.get(4).equals("1,3")) {
                                    System.out.println("Resposta correta!");
                                    correto3 = true;
                                } else {
                                    System.out.println("Resposta incorreta!");
                                   
                                }
                                break;
                            default:
                                System.out.println("Escolha inválida!");

                        }
                    } while (!correto3);

                    System.out.println("resolvido");
                    System.out.println("");
                    comodo = 1;
                    break;
                case 5:
                    System.out.println("Você está na sala");
                    System.out.println("Na sala você vê um sofá, uma TV, um armário e a porta. \n"
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
        } while (comodo != 7);
        System.out.println("FIM!");

    }

    public static void HabAbrePort() {
        if (comodo == 5 && comodo == 3) {
            int dado = (int) (1 + Math.random() * (48 - hablad));
        } else {
            int dado = (int) (1 + Math.random() * (6 - hablad));
        }
    }

    public static void pressEnter() {
        Scanner input = new Scanner(System.in);
        System.out.println("(press Enter)\n");

        input.nextLine();

    }

    public static String jogador() {
        Scanner input = new Scanner(System.in);

        String jogador;
        jogador = input.next();
        return jogador;
    }

}
