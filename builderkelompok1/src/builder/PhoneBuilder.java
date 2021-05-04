package builder;

public class PhoneBuilder {

    private String os, processor;
    private int ram, hdd;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setHdd(int hdd){
        this.hdd = hdd;
        return this;
    }

    public Phone buildPhone(){
        return new Phone(os, processor, ram, hdd);
    }
}


