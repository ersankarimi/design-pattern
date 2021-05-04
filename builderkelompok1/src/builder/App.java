package builder;

public class App {

    public static void main(String[] args) {

        PhoneBuilder builder = new PhoneBuilder();
        builder.setOs("windows");
        builder.setHdd(520);
        Phone p = builder.buildPhone();
        System.out.println(p);





    }
}
