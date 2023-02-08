package algoritma_5;

public class TestGround {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Swoosh");
        System.out.println(sepeda.getRantai());
        sepeda.Akselerasi();
        System.out.println(sepeda.getRantai());

        System.out.println("--------------");

        Mobil mobil = new Mobil("Vroom");
        System.out.println(mobil.getBensin());
        mobil.Akselerasi();
        System.out.println(mobil.getBensin());
    }
}
