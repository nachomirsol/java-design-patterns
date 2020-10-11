package observer_pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        YoutubeChannel channel = new YoutubeChannel();
        Suscriber s1 = new Suscriber(channel);
        Suscriber s2 = new Suscriber(channel);

        channel.attach(s1);
        channel.attach(s2);

        channel.addNewVideo("Video patrón observer");
    }
}
