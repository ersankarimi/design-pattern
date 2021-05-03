package Builder;

public class Controller {
    KulinerBuilder kuliner_bulider;
    public Controller(KulinerBuilder kuliner_bulider) {
        this.kuliner_bulider = kuliner_bulider;
    }

    public void Build(){
        kuliner_bulider.DaerahBuilder();
        kuliner_bulider.MakananBuilder();
        kuliner_bulider.MinumanBuilder();
    }

    public Kuliner GetKuliner(){
        return kuliner_bulider.GetKuliner();
    }
}
