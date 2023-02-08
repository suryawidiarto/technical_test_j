package algoritma_5;

public class Sepeda extends Kendaraan {
    private String rantai = "Normal";

    public Sepeda(String suara) {
        super(suara);
    }

    @Override
    public void Akselerasi() {
        super.Akselerasi();
        rantai = "Perlu Perbaikan";
    }

    public String getRantai() {
        return rantai;
    }
}
