package factory_pattern;

public class MobileFactory{
    public static Mobile createMobile(String type){
        if(type.equals(Mobile.IPHONE)){
            return new Iphone(2,"A9","A9GPU");
        }else if(type.equals(Mobile.SONY)){
            return new Sony(2,"N4");
        }else if(type.equals(Mobile.SAMSUNG)){
            return new Samsung("S6");
        }else{
            return null;
        }
    }
}
