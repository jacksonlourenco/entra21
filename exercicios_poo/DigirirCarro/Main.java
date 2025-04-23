package exercicios_poo.DigirirCarro;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro(150);
        car.setVelocidade(80);

        System.out.println(car.getVelocidade());
        car.acelerar(50);
        System.out.println(car.getVelocidade());
        car.reduzir(70);
        System.out.println(car.getVelocidade());
        car.reduzir(70);
        System.out.println(car.getVelocidade());

    }
}
