package factory_pattern;

public class Iphone implements Mobile{
    private int ramSize;
    private String processor;
    private String GPU;

    public Iphone(int ramSize, String processor, String GPU){
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = GPU;
    }
}
