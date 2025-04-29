package exercicios_poo.Mercado3;

public class Main {
    public static void main(String[] args) {
        
        Mercado[] mercados = new Mercado[3];
        mercados[0] = new Mercado("Unidade Blumenau", 4000, 0.4, 2900, 0.7);
        mercados[1] = new Mercado("Unidade de Joinville", 1000, 0.55, 2500, 1);
        mercados[2] = new Mercado("Unidade de Florianópolis", 5000, 1, 6500, 1.5);
    
        //Necessário para instanciar o método, pois o outro objeto será passado no argumento.
        Mercado consulta = new Mercado("", 0, 0, 0, 0);

        String mercadoMaca = consulta.receitaLojaMacas(mercados);
        System.out.println(mercadoMaca);
    
    }
}
