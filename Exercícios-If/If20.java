import java.util.Scanner;

public class If20 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que funciona como um conversor universal.
		*Primeiro o usuário escolhe se ele quer converter: temperatura, peso, comprimento ou volume.
		*Depois, ele escolhe qual a unidade do valor que ele deseja converter
		*Após isso, o usuário entra com o valor desejado
		*Depois, ele escolhe para qual ele quer converter.
		*As opções de temperatura, são: celsius, fahrenheit e kelvin.
		*As opções de peso são: quilos, libras e onças
		*As opções de comprimento são: metros, pés e polegadas
		*As opções de volume são: litros, galão líquido e onças líquidas
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Categorias de conversão");
		System.out.println("[1] Temperatura");
		System.out.println("[2] Peso");
		System.out.println("[3] Comprimento");
		System.out.println("[4] Volume");
		
		System.out.print("Escolha a opção desejada: ");
		int conversor = sc.nextInt();
				 
		// If para escolher as categorias, aqui irá validar inicialmente a temperatura.
		 if(conversor == 1) {
			 System.out.println("\nInsira uma das seguintes opções de temperatura: ");
			 System.out.println("[1] Celsius");
			 System.out.println("[2] Fahrenheit");
			 System.out.println("[3] Kelvin");
			 System.out.print("Escolha a opção desejada: ");

			 int temperatura = sc.nextInt();
			 
			 if(temperatura == 1) {
				 System.out.println("Para qual você deseja converter?");
				 System.out.println("[1] Fahrenheit");
				 System.out.println("[2] Kelvin");
				 System.out.print("Escolha a opção desejada: ");

				 int option = sc.nextInt();
				 
				 if(option == 1) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double celsius = sc.nextDouble();
					 
					 celsius = (100 * 9 / 5) + 32;
					 System.out.println("\nA temperatura em Fahrenheit é: " + celsius + "°F");
					 
					 
				 } else if (option == 2) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double celsius = sc.nextDouble();
					 celsius = celsius + 273;
					 System.out.println("\nA temperatura em Kelvin é: " + celsius + "K");
					 
				 } else {
					System.out.println("Opção inválida!");

				 }
				 
			 } else if (temperatura == 2) {
				 System.out.println("Para qual você deseja converter?");
				 System.out.println("[1] Celsius");
				 System.out.println("[2] Kelvin");
				 System.out.print("Escolha a opção desejada: ");

				 int option = sc.nextInt();
				 
				 if(option == 1) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double fahrenheit = sc.nextDouble();
					 
					 fahrenheit = (fahrenheit - 32) * 5 / 9;
					 System.out.println("\nA temperatura em Celsius é: " + fahrenheit + "°C");
					 
					 
				 } else if (option == 2) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double fahrenheit = sc.nextDouble();
					 fahrenheit = ((fahrenheit - 32) * 5 / 9) + 273;
					 System.out.println("\nA temperatura em Kelvin é: " + fahrenheit + "K");
					 
				 } else {
					System.out.println("Opção inválida!");

				 }
				 
			 } else if (temperatura == 3) {
				 System.out.println("Para qual você deseja converter?");
				 System.out.println("[1] Celsius");
				 System.out.println("[2] Fahrenheit");
				 System.out.print("Escolha a opção desejada: ");

				 int option = sc.nextInt();
				 
				 if(option == 1) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double kelvin = sc.nextDouble();
					 
					 kelvin = kelvin - 273.15;
					 System.out.println("\nA temperatura em Celsius é: " + kelvin + "°C");
					 
					 
				 } else if (option == 2) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double kelvin = sc.nextDouble();
					 kelvin = kelvin * 9 / 5 - 459.67;
					 System.out.println("\nA temperatura em Fahrenheit é: " + kelvin + "°F");
					 
				 } else {
					System.out.println("Opção inválida!");

				 }
			 } 
			 
			 
			 
		 // PESO
		 } else if(conversor == 2) {
			 System.out.println("\nInsira uma das seguintes opções de Peso: ");
			 System.out.println("[1] Quilo");
			 System.out.println("[2] Libra");
			 System.out.println("[3] Onça");
			 System.out.print("Escolha a opção desejada: ");
 
			 int peso = sc.nextInt();
			 
			 if(peso == 1) {
				 System.out.println("Para qual você deseja converter?");
				 System.out.println("[1] Libra");
				 System.out.println("[2] Onça");
				 System.out.print("Escolha a opção desejada: ");
 
				 int option = sc.nextInt();
				 if(option == 1) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double quilo = sc.nextDouble();
					
					 quilo = (quilo * 2.22046);
					 System.out.println("\nO peso em libras é de: " + quilo + " lbs");
					
					
				 } else if (option == 2) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double quilo = sc.nextDouble();
					 quilo = quilo * 35.274;
					 System.out.println("\nO peso em Onças é de: " + quilo + " oz");
					
				 } else {
					System.out.println("Opção inválida!");
 
				 }
			 } else if(peso == 2) {
				 System.out.println("Para qual você deseja converter?");
				 System.out.println("[1] Quilo");
				 System.out.println("[2] Onça");
				 System.out.print("Escolha a opção desejada: ");
 
				 int option = sc.nextInt();
				 if(option == 1) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double libra  = sc.nextDouble();
					
					 libra = (libra * 0.453592);
					 System.out.println("\nO peso em Quilos é de: " + libra + " Kg");
					
					
				 } else if (option == 2) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double libra = sc.nextDouble();
					 libra = libra * 16;
					 System.out.println("\nO peso em Onças é de: " + libra + " oz");
					
				 } else {
					System.out.println("Opção inválida!");
 
				 }
			 } else if (peso == 3) {
				 System.out.println("Para qual você deseja converter?");
				 System.out.println("[1] Quilo");
				 System.out.println("[2] Libra");
				 System.out.print("Escolha a opção desejada: ");
 
				 int option = sc.nextInt();
				 if(option == 1) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double onça = sc.nextDouble();
					
					 onça = (onça * 0.0283495);
					 System.out.println("\nO peso em Lg é de: " + onça + " Kg");
					
					
				 } else if (option == 2) {
					 System.out.print("\nInsira o valor que irá converter: ");
					 double onça = sc.nextDouble();
					 onça = onça / 16;
					 System.out.println("\nO peso em Libra é de: " + onça + " lbs");
					
				 } else {
					System.out.println("Opção inválida!");
 
				 }
			 } else {
				System.out.println("Opção inválida!");

			 }
			 
			 
			 
		 } else if (conversor == 3) {
			 
			 
			 
			 
			 
			 
		 } else if (conversor == 4) {
			 
			 
			 
			 
			 
			 
		 } else {
			 System.out.println("Opção inválida!");
		 }
		
		 
		
	}
}
