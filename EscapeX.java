package jogo;

import java.util.Scanner;

public class EscapeX {
	
	public static Scanner  input = new Scanner(System.in);
	int prof=0;
	static int habcrit=0, hablad=0;
	
	public static void main(String[] args) {
		
		System.out.println("Olá Jogador!!");
		System.out.println("Qual é o seu nome?");
		String nome = input.next();
		System.out.println("Escolha a sua Profissão: \n"
				+ "1 - Critico de Arte \n"
				+ "2 - Ladrão de Arte");
		int prof = input.nextInt();
		
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
		
		System.out.println( nome + ", Venha descobrir o que aconteceu!");
		
		int opcao;
		do {
		System.out.println("1 - Instruções");
		System.out.println("2 - Jogar"); 
		System.out.println("3 - Créditos"); 
		System.out.println("4 - Sair");
		System.out.print("Escolha uma opção: "); 
		opcao = input.nextInt();
		switch (opcao) { case 1:
		System.out.println(nome + ", Você está preso dentro de uma casa, onde para sair e \n"
				+ "descobrir o que aconteceu com você, você deverá buscar dicas e resolver problemas para sair de um comodo da casa. \n"
				+ "Coletar itens te dará benefícios durante o jogo!");
		System.out.println("Após coletar todas as dicas dos comodos e resolver os mistérios, você conseguirá sair da casa \n\n ");
		break; 
		case 2:
		Jogar();
		break; 
		case 3:
		System.out.println("Créditos: \n"
				+ "Desenvolvido por: \n"
				+ "Gabriel \n"
				+ "Jamile \n"
				+ "Rafael \n"
				+ "Vitor \n"
				+ "Projeto Integrador 1º semestre Senac 2020 \n\n");
		break;
		case 4:
		System.out.println("Você escolheu a opção Sair");
		break; 
		default:
		System.out.println("Opção inválida!");
		}
		} while (opcao !=4 && opcao !=2);
		
	
	}
	
	public static void Jogar() {
		System.out.println("Bora Jogar!");
	}

	public static void HabAbrePort() {
		int dado = (int)(1 + Math.random()*(6-habcrit));
		
	}
		
		

	}