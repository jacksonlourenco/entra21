import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {50, 40, 30, 20, 10, 9, 0, 5, 3, 2};
		int option, num, novoNum, index = 0;
		String text = "[1] Incluir valor.\n" 
				+ "[2] Pesquisar valor\n"
				+ "[3] Alterar valor\n"
				+ "[4] Excluir valor\n"
				+ "[5] Mostrar valores\n"
				+ "[0] Sair do sistema";
		boolean estaArray = false, adicionado = false;
		
		
		System.out.println(text);
		while(true) {
			
			System.out.print("\nInsira a opção: ");
			option = sc.nextInt();
			
			if(option == 0) {
				System.out.println("\nSaindo do sistema...");
				break;
				
			} else if(option == 1){
							
				for(int i = 0; i < arr.length; i++) {
					if (arr[i] == 0) {
						
						System.out.print("Insira o novo número: ");
						novoNum = sc.nextInt();
						
						index = i;
						
						arr[i] = novoNum;
						adicionado = true;
						break;
					}
				}
				
				if(adicionado) {
					System.out.println("Número adicionado com sucesso no Index: [" + index + "].");
					System.out.println("Array atualizado: " + Arrays.toString(arr));
				} else {
					System.out.println("O array está cheio. Não foi possível adicionar!");
				}
				
				
			} else if(option == 2){
				for(int i = 0; i < arr.length; i++) {
					System.out.print("Insira um número: ");
					num = sc.nextInt();
					
					if(arr[i] == num) {
						index = i;
						estaArray = true;
						System.out.println("O numero: " + num + " esta no array. No Index ["+i+"]");
						break;
					}
				}
				
			} else if(option == 3){
				System.out.print("Insira um número que deseja substituir: ");
				num = sc.nextInt();
				
				for(int i = 0; i < arr.length; i++) {
					
					if(arr[i] == num) {
						System.out.print("Insira o novo número: ");
						novoNum = sc.nextInt();
						
						arr[i] = novoNum;
						estaArray = true;
						
						System.out.println("Array atualizado: " + Arrays.toString(arr));
						break;
						
					}
					
				}
				if(!estaArray) {
					System.out.println("===Número não encontrado!===");
				} 
				
				
				
			} else if(option == 4){
				System.out.print("Insira um número que deseja excluir do array: ");
				num = sc.nextInt();
						
				for(int i = 0; i < arr.length; i++) {
					
					if(arr[i] == num) {
						index = i;
						estaArray = true;
						
						for(int j = i; j < arr.length - 1; j++) {
							arr[j] = arr[j + 1];
						}
						arr[arr.length - 1] = 0;
						break;
					}
				}
				if(estaArray) {
					System.out.println("Array atualizado. Index [" + index + "] removido.");
					System.out.println("Array atualizado: " + Arrays.toString(arr));
				} else {
					System.out.println("Valor não encontrado no array.");
				}
				
				
			} else if(option == 5){
				System.out.println("Array: " + Arrays.toString(arr));
				
			} else {
				System.out.println("===Opção inválida, tente novamente!===");
			}
			System.out.println("\n==================\n"+text);

		}
	}
}
