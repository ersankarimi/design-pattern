package Builder;

public class MainClass {
    public static void main(String[] args) {
        KulinerBuilder oseng = new OsengKuliner();
        Controller controller = new Controller(oseng);
        controller.Build();
        Kuliner kuliner = controller.GetKuliner();
        System.out.println(kuliner);

        KulinerBuilder madura = new MaduraKuliner();
        controller = new Controller(madura);
        controller.Build();
        kuliner = controller.GetKuliner();
        System.out.println(kuliner);
    }
}
