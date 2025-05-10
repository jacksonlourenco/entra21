package exercicios_r_poo.Matematico;

public class InteiroPositivo {

    private int numX;

    public InteiroPositivo(int numX) {
        setNumX(numX);
    }

    public int getNumX() {
        return numX;
    }

    public void setNumX(int numX) {
        if (numX < 0) {
            throw new IllegalArgumentException("O número precisa ser inteiro.");
        }
        this.numX = numX;
        System.out.println("O novo valor é: " + numX);
    }

    //A
    public void setValue(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("O número precisa ser inteiro.");
        } else {
            setNumX(num);
        }
    }

    //B
    public void multiplicarX(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("O número precisa ser inteiro.");
        } else {
            int numMultiplicado = numX * num;
            System.out.println("A multiplicação é: " + numMultiplicado);
        }
    }

    public void calcularFatorial() {

        int fatorial = 1;
        for (int i = 1; i <= numX; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numX + " é: " + fatorial);

    }

    public void mostrarDivisores() {

        int contador = 0;
        for(int i = 1; i <= numX; i++) {
            if(numX % i == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println("\nQuantidade de divisores: " + contador);
    }

}
