package builder;

public class Phone {

    private String os,processor;
    private int ram,hdd;

    public Phone(String os, String processor, int ram, int hdd) {
        super();
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String toString(){
        return "Phone [OS = " + os + " , Processor = " + processor + " , ram = " + ram + " , ram = " + ram + " , HDD = " + hdd + "]";
    }
}
