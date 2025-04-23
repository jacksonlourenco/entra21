package exercicios_poo.DigirirCarro;

public class Carro {
    private int velocidade;
    private int velMax;

    public Carro(int velMax) {
        setVelMax(velMax);
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= velMax) {
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade inválida. Deve ser entre 0 e " + velMax + ".");
        }
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        if (velMax <= 200 && velMax > 0) {
            this.velMax = velMax;
        } else {
            System.out.println("Velocidade inválida.");
        }
    }

    public void acelerar(int velocidade) {
        int novaVelocidade = this.velocidade + velocidade;

        if (novaVelocidade >= 0 && novaVelocidade <= this.velMax) {
            this.velocidade += velocidade;
        } else {
            throw new IllegalArgumentException("Velocidade inválida");
        }
    }

    public void reduzir(int velocidade) {
        int novaVelocidade = this.velocidade - velocidade;

        if (novaVelocidade >= 0 && novaVelocidade <= this.velMax) {
            this.velocidade -= velocidade;
        } else {
            throw new IllegalArgumentException("Velocidade inválida");
        }
    }
}
