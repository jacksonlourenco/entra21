package exercicios_r_poo.Municipio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vereadores> vereadores = new ArrayList<>();
        vereadores.add(new Vereadores("Bolsonaro", "A", 51, 18));
        vereadores.add(new Vereadores("Lula", "B", 42, 26));
        vereadores.add(new Vereadores("Ciro", "C", 0, 0));
        vereadores.add(new Vereadores("Joao", "A", 15, 3));
        vereadores.add(new Vereadores("Maria", "B", 21, 8));

        System.out.println("A) " + totalProjeto(vereadores));
        System.out.println("B) " + maisProjetos(vereadores));
        System.out.println("C) " + maiorDesempenho(vereadores));
        System.out.println("D) Os vereadores com o desempenho maior do que a média da câmara são: "
                + maiorMediaDesempenho(vereadores));

        maiorDesempenhoPartido(vereadores);
    }

    public static String totalProjeto(List<Vereadores> vereadores) {
        int totalProjetos = 0;
        int projetosAprovados = 0;

        for (Vereadores v : vereadores) {
            totalProjetos += v.getQntProjeto();
            projetosAprovados += v.getApProjeto();
        }

        return "O total de projetos apresentados foi: " + totalProjetos + ". Enquanto os aprovados foram: "
                + projetosAprovados;
    }

    public static String maisProjetos(List<Vereadores> vereadores) {
        String nome = "";
        int qntProjeto = 0;

        for (Vereadores v : vereadores) {
            if (v.getQntProjeto() > qntProjeto) {
                qntProjeto = v.getQntProjeto();
                nome = v.getNome();
            }
        }

        return "O Vereador com mais projetos é: " + nome + " com " + qntProjeto + " projetos.";
    }

    public static String maiorDesempenho(List<Vereadores> vereadores) {
        double maiorDesempenho = 0;

        Vereadores vereador = null;
        for (Vereadores v : vereadores) {
            double desempenho = v.calcularDesempenho();

            if (desempenho > maiorDesempenho) {
                maiorDesempenho = desempenho;
                vereador = v;
            }
        }

        return "O vereador com o maior desempenho é: " + vereador.getNome() + " com " + maiorDesempenho;
    }

    // Os vereadores cujo desempenho seja maior que o desempenho médio de toda a
    // câmara
    public static Object maiorMediaDesempenho(List<Vereadores> vereadores) {
        double soma = 0;

        for (Vereadores v : vereadores) {
            double desempenho = v.calcularDesempenho();
            soma += desempenho;
        }

        double media = soma / vereadores.size();
        System.out.println(media);

        List<String> nomesVereadores = new ArrayList<>();

        for (Vereadores v : vereadores) {
            double desempenho = v.calcularDesempenho();

            if (desempenho > media) {
                nomesVereadores.add(v.getNome());
            }
        }

        return nomesVereadores;
    }

    public static void maiorDesempenhoPartido(List<Vereadores> vereadores) {
        List<String> partidos = new ArrayList<>();
        List<Double> somas = new ArrayList<>();
        List<Integer> contagens = new ArrayList<>();

        for (Vereadores v : vereadores) {
            String partido = v.getPartido();
            double desempenho = v.calcularDesempenho();

            if (!partidos.contains(partido)) {
                partidos.add(partido);
                somas.add(desempenho);
                contagens.add(1);
            } else {
                int idx = partidos.indexOf(partido);
                somas.set(idx, somas.get(idx) + desempenho);
                contagens.set(idx, contagens.get(idx) + 1);
            }
        }

        double melhorMedia = 0;
        String melhorPartido = "";
        for (int i = 0; i < partidos.size(); i++) {
            double mediaPartido = somas.get(i) / contagens.get(i);
            if (mediaPartido > melhorMedia) {
                melhorMedia = mediaPartido;
                melhorPartido = partidos.get(i);
            }
        }

        System.out.println("Partido com melhor desempenho médio: " + melhorPartido);

    }
}
