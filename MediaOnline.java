import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MediaOnline{

    private static String link;

    public MediaOnline(String arg) {
        this.link = arg;
    }

    public static void play() {
        String song = link;
        Player mp3player = null;
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new URL(song).openStream());
            mp3player = new Player(in);
            mp3player.play();
        } catch (MalformedURLException ex) {
        } catch (IOException e) {
        } catch (JavaLayerException e) {
        } catch (NullPointerException ex) {
        }

    }

    public static void main(String args[]) {
        MediaOnline mo = new MediaOnline(args[0]);
        mo.play();
    }

}
