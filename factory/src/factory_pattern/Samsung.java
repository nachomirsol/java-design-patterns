package factory_pattern;

public class Samsung implements Mobile{
    private int ramSize;
    private String processor;

    public Samsung(int ramSize){
        this.ramSize = ramSize;
    }

    public Samsung(String processor){
        this.ramSize = 2;
        this.processor = processor;
    }
}
