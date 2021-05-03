package Builder;

public class OsengKuliner implements KulinerBuilder {
    private Kuliner kuliner = null;
    public OsengKuliner() {
        kuliner = new Kuliner();
    }
    @Override
    public void DaerahBuilder() {
        kuliner.SetDaerah("Banyuwangi");
    }
    @Override
    public void MakananBuilder() {
        kuliner.SetMakanan("Sego Tempong");
    }
    @Override
    public void MinumanBuilder() {
        kuliner.SetMinuman("Es Degan");
    }
    @Override
    public Kuliner GetKuliner() {
        return kuliner;
    }
}
