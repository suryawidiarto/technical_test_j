package algoritma_5;

public class Mobil extends Kendaraan {
    private String bensin = "Penuh";

    public Mobil(String suara) {
        super(suara);
    }

    @Override
    public void Akselerasi() {
        super.Akselerasi();
        bensin = "Kosong";
    }

    public String getBensin() {
        return bensin;
    }
}
