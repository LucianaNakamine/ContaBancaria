package conta.util;

import java.util.Scanner;

public class Cores {


	private static final String TEXT_WHITE_BOLD = null;
	private static final String TEXT_RESET = null;
	private static final String TEXT_WHITE = null;
	private static final String TEXT_RED_BOLD = null;
	private static final int TEXT_YELLOW = 0;
	private static final int ANSI_BLACK_BACKGROUND = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reset Color
				final String TEXT_RESET = "\u001B[0m";

				//Text Color
				final String TEXT_BLACK = "\u001B[30m";
				final String TEXT_RED = "\u001B[31m";
				final String TEXT_GREEN = "\u001B[32m";
				final String TEXT_YELLOW = "\u001B[33m";
				final String TEXT_BLUE = "\u001B[34m";
				final String TEXT_PURPLE = "\u001B[35m";
				final String TEXT_CYAN = "\u001B[36m";
				final String TEXT_WHITE = "\u001B[37m";

				//Text Color Bold
				final String TEXT_BLACK_BOLD = "\033[1;30m";
				final String TEXT_RED_BOLD = "\033[1;31m";
				final String TEXT_GREEN_BOLD = "\033[1;32m";
				final String TEXT_YELLOW_BOLD = "\033[1;33m"; 
				final String TEXT_BLUE_BOLD = "\033[1;34m";
				final String TEXT_PURPLE_BOLD = "\033[1;35m";
				final String TEXT_CYAN_BOLD = "\033[1;36m";
				final String TEXT_WHITE_BOLD = "\033[1;37m";

				//Reset Text Underline
				final String TEXT_BLACK_UNDERLINED = "\033[4;30m"; 
				final String TEXT_RED_UNDERLINED = "\033[4;31m"; 
				final String TEXT_GREEN_UNDERLINED = "\033[4;32m"; 
				final String TEXT_YELLOW_UNDERLINED = "\033[4;33m"; 
				final String TEXT_BLUE_UNDERLINED = "\033[4;34m"; 
				final String TEXT_PURPLE_UNDERLINED = "\033[4;35m"; 
				final String TEXT_CYAN_UNDERLINED = "\033[4;36m"; 
				final String TEXT_WHITE_UNDERLINED = "\033[4;37m"; 
						
				// Text Color High Intensity
				final String TEXT_BLACK_BRIGHT = "\033[0;90m";  
				final String TEXT_RED_BRIGHT = "\033[0;91m";    
				final String TEXT_GREEN_BRIGHT = "\033[0;92m";  
				final String TEXT_YELLOW_BRIGHT = "\033[0;93m"; 
				final String TEXT_BLUE_BRIGHT = "\033[0;94m";  
				final String TEXT_PURPLE_BRIGHT = "\033[0;95m"; 
				final String TEXT_CYAN_BRIGHT = "\033[0;96m";   
				final String TEXT_WHITE_BRIGHT = "\033[0;97m";  

				// Text Color Bold High Intensity
				final String TEXT_BLACK_BOLD_BRIGHT = "\033[1;90m"; 
				final String TEXT_RED_BOLD_BRIGHT = "\033[1;91m";   
				final String TEXT_GREEN_BOLD_BRIGHT = "\033[1;92m"; 
				final String TEXT_YELLOW_BOLD_BRIGHT = "\033[1;93m";
				final String TEXT_BLUE_BOLD_BRIGHT = "\033[1;94m";  
				final String TEXT_PURPLE_BOLD_BRIGHT = "\033[1;95m";
				final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m";  
				final String TEXT_WHITE_BOLD_BRIGHT = "\033[1;97m"; 

				// Background Color
				final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
				final String ANSI_RED_BACKGROUND = "\u001B[41m";
				final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
				final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
				final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
				final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
				final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
				final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
						
				// Background Color High Intensity
				final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
				final String ANSI_RED_BACKGROUND_BRIGHT = "\033[0;101m";
				final String ANSI_GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
				final String ANSI_YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
				final String ANSI_BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
				final String ANSI_PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; 
				final String ANSI_CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  
				final String ANSI_WHITE_BACKGROUND_BRIGHT = "\033[0;107m";
				
				Scanner leia = new Scanner(System.in);
				
				int opcao;
						
				while(true) {

					System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
							+ "*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                BANCO DO BRAZIL COM Z                ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Criar Conta                          ");
					System.out.println("            2 - Listar todas as Contas               ");
					System.out.println("            3 - Buscar Conta por Numero              ");
					System.out.println("            4 - Atualizar Dados da Conta             ");
					System.out.println("            5 - Apagar Conta                         ");
					System.out.println("            6 - Sacar                                ");
					System.out.println("            7 - Depositar                            ");
					System.out.println("            8 - Transferir valores entre Contas      ");
					System.out.println("            9 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     " + Cores.TEXT_RESET);
					
					opcao = leia.nextInt();
						
					if (opcao == 9) {
						System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
						leia.close();
						System.exit(0);
					}
						
					switch (opcao) {
						case 1:
							System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
						
		                    break;
						case 2:
							System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
							
		                    break;
						case 3:
							System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
			
		                    break;
						case 4:
							System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
							
		                    break;
						case 5:
							System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
				
		                    break;
						case 6:
							System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

		                    break;
						case 7:
							System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
							
		                    break;
						case 8:
							System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
							
		                    break;
						default:
							System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
		                    break;
					}
				}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
