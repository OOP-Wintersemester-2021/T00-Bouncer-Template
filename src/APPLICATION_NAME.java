import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;


public class BouncerAlsBergsteiger extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("MAP");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("APPLICATION");
    }
}