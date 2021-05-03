package Builder;

public class MaduraKuliner implements KulinerBuilder {
    private Kuliner kuliner = null;
    public MaduraKuliner() {
        kuliner = new Kuliner();
    }
    @Override
    public void DaerahBuilder() {
        kuliner.SetDaerah("Madura");
    }
    @Override
    public void MakananBuilder() {
        kuliner.SetMakanan("Sate");
    }
    @Override
    public void MinumanBuilder() {
        kuliner.SetMinuman("Es Teh");
    }
    @Override
    public Kuliner GetKuliner() {
        return kuliner;
    }
}
