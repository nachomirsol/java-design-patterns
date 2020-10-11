package observer_pattern;

import java.util.ArrayList;

public class YoutubeChannel implements Observable{

    private ArrayList<Observer> channelSuscribers = new ArrayList<Observer>();
    private String lastVideoPosted = "";

    public void attach(Observer o){
        channelSuscribers.add(o);
    }

    public void detach(Observer o){
        channelSuscribers.remove(o);
    }

    public void addNewVideo(String title){
        this.lastVideoPosted = title;
        this.notifySuscribers();
        System.out.println("New youtube video added to channel");
    }

    public String lastVideoTitle(){
        return this.lastVideoPosted;
    }

    public void notifySuscribers(){
        for(Observer suscriptor : channelSuscribers){
            suscriptor.update();
        }
    }



}
