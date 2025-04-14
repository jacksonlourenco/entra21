
import java.util.Scanner;

public class Avaliar_temperaturas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double matriz[][] = {
            {22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, //12
            24.3, 24.4, 24.0, 24.5, 24.1, 24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8},   
            {21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, //12
            26.2, 27.5, 28.1, 28.6, 29.2, 29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0},   
            {20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, //12
            25.0, 25.3, 25.6, 25.9, 26.2, 26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8},   
            {20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, //12
            24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2},   
            {19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, //12
            23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5},   
            {19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, //12
            28.7, 29.0, 28.3, 28.6, 28.9, 29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7},   
            {19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, //12
            23.7, 24.0, 24.3, 24.6, 24.9, 25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7}}; 
                

        String diasSemana[] = {"domingo", "segunda", "terca", "quarta", "quinta", "sexta", "sabado"};
        int index = 0;
        double somaTemp = 0;
        double somaHora = 0;
        double minTemp = Double.MAX_VALUE;
        double maxTemp = Double.MIN_VALUE;
        double ampTermica = 0;
        double ampDia = 0;
        String text = "Selecione uma opção:\n[1] Calcule a média diária de um dia da semana.\n[2] Calcule a média de uma hora dos dias da semana.\n[3] Maior amplitude térmica da semana.\n[0] Sair do programa.";
        System.out.println(text);
        System.out.print("Selecione uma opção: ");
        int option = sc.nextInt(); 
        /* 
a) A média diária de um dia da semana específico. O usuário entrará com o dia da semana por extenso, por exemplo “domingo”, então você deve pesquisar na linha correspondente. 
b) A média da hora de todos os dias da semana. O usuário entrará com a hora, por exemplo 15, então você deve pesquisar na coluna correspondente. 
c) Qual dia da semana teve a maior amplitude térmica.
            */

            while(option != 0) {
                
                
                if(option == 1) {
                    System.out.print("Escreve o dia da semana que deseja visualizar a média de temperatura: ");
                    String dia = sc.next();
                    boolean diaCerto = false;

                    for(int i = 0; i < diasSemana.length; i++) {
                        if(dia.equalsIgnoreCase(diasSemana[i])) {
                            index = i;
                            diaCerto = true;
                        }
                    }
                    
                    if(diaCerto) {
                        for(int i = 0; i < matriz.length; i++) {
                            somaTemp += matriz[index][i];
                        }
                        double mediaTemp = somaTemp / matriz.length;
                        System.out.println("A média de " + diasSemana[index] + " foi de: " + mediaTemp);

                    } else {
                        System.out.println("Dia inserido não é válido, tente novamente!");
                    }
                    
                } else if (option == 2) {
                    System.out.print("Insira a hora do dia que deseja fazer a média da semana: ");
                    int horaDia = sc.nextInt();
                    horaDia--;

                    if(horaDia <= 24 || horaDia >= 1) {
                        for (int i = 0; i < matriz.length; i++) {
                            somaHora += matriz[i][horaDia];
                        }
                        double mediaHora = somaHora / matriz.length;
                        System.out.println("A media da(s) " + (horaDia+1) + " horas foi de: " + mediaHora);

                    } else {
                        while(horaDia > 24 || horaDia < 0) {
                            System.out.print("Opção inválida, tente novamente: ");
                            horaDia = sc.nextInt();
                            horaDia--;
                        }
                    }
                    
                    
                } else if (option == 3) {
                    

                    for(int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {

                            if (matriz[i][j] > maxTemp) {
                                maxTemp = matriz[i][j];
                            }
                            
                            if(matriz[i][j] < minTemp) {
                                minTemp = matriz[i][j];
                            }

                            ampTermica = maxTemp - minTemp;
                        }

                        if(ampDia <= ampTermica) {
                            ampDia = ampTermica;
                            index = i;
                        }
                    }
                    System.out.println("A maior amplitude térmica foi " + diasSemana[index] + ", e foi de: " + ampDia);
                    break;

                } else {
                    while (option > 3 || option < 0) { 
                        System.out.print("Opção inválida, tente novamente: ");
                        option = sc.nextInt(); 
                    }
                }
                System.out.println(text);
                System.out.print("Selecione uma opção: ");
                option = sc.nextInt(); 
            }

            System.out.println("Encerrando programa...");
    }
}
