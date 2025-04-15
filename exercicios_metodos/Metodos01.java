package exercicios_metodos;

import java.util.Scanner;

public class Metodos01 {
    public static void clima() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Verão\n[2] Outono\n[3] Inverno\n[4] Primavera");
        System.out.print("Insira a opção: ");

        int option = sc.nextInt();

        if  (option >= 1 || option <= 4) {
            if  (option == 1) {
                verao();
            } else if (option == 2) {
                inverno();
            } else if (option == 3) {
                outono();
            } else if (option == 4) {
                primavera();
            }
        } else {
            System.out.println("Escolha inserida não é válida.");
        }
    }

    public static void verao() {
        System.out.println("É verão, está quente.");
    }
    public static void inverno() {
        System.out.println("É inverno, o clima está frio.");
    }
    public static void outono() {
        System.out.println("É outono, o clima está começando a ficar frio.");
    }
    public static void primavera() {
        System.out.println("É primavera, o clima está agradável.");
    }
    

    public static void main(String[] args) {
        clima();
    }
}
