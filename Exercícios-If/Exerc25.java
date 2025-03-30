import java.util.Scanner;

public class Exerc25 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        if(dia >= 1 && dia <= 31) {

            System.out.print("Digite o mês (1 a 12): ");
            int mes = sc.nextInt();

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31) {
                    System.out.print("Digite o ano: ");
                    int ano = sc.nextInt();
                    
                    if(ano >= 1 && ano <= 2025) {
                        System.out.println(dia + "/" + mes + "/" + ano);
                    } else {
                        System.out.println("Ano inválido!");
                    }
                } else {
                    System.out.println("Dia inválido para o mês escolhido.");
                }
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30) {
                    System.out.print("Digite o ano: ");
                    int ano = sc.nextInt();
                    
                    if(ano >= 1 && ano <= 2025) {
                        System.out.println(dia + "/" + mes + "/" + ano);
                    } else {
                        System.out.println("Ano inválido!");
                    }
                } else {
                    System.out.println("Dia inválido para o mês escolhido.");
                }
            }
            else if (mes == 2) {
                System.out.print("Digite o ano: ");
                int ano = sc.nextInt();
                
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    if (dia <= 29) {
                        System.out.println(dia + "/" + mes + "/" + ano);
                    } else {
                        System.out.println("Dia inválido para o mês escolhido.");
                    }
                } else {
                    if (dia <= 28) {
                        System.out.println(dia + "/" + mes + "/" + ano);
                    } else {
                        System.out.println("Dia inválido para o mês escolhido.");
                    }
                }
            }
            else {
                System.out.println("Mês inválido.");
            }

        } else {
            System.out.println("Dia inválido.");
        }
		
		
	}
}
