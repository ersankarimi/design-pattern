package Builder;

public class Kuliner {
    private String daerah,makanan,minuman;
    public void SetDaerah(String daerah){
        this.daerah = daerah;
    }
    public String GetDaerah(){
        return this.daerah;
    }
    public void SetMakanan(String makanan){
        this.makanan = makanan;
    }
    public String GetMakanan(){
        return this.makanan;
    }
    public void SetMinuman(String minuman){
        this.minuman = minuman;
    }
    public String GetMinuman(){
        return this.minuman;
    }
    public String toString(){
        return "Kota "+GetDaerah()+" Makanan Khas nya "+GetMakanan()+" dan minuman khas nya "+GetMinuman();
    }
}
