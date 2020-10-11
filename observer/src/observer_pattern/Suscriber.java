package observer_pattern;

public class Suscriber implements Observer{
    private YoutubeChannel observable = null;

    public Suscriber (YoutubeChannel observable){
        this.observable = observable;
    }

    public void update(){
        System.out.println("New video posted");
        System.out.println(this.observable.lastVideoTitle());
    }
}
