
import java.applet.Applet;
import java.awt.*;

public class appletimpl extends Applet {
    private Color currentColor = Color.red;


    // init() method
    public void init() {
        setBackground(Color.white);
        currentColor = Color.red;
    }

    // start() method
    public void start() {
        currentColor = Color.green;
    }

    // paint() method
    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.fillRect(20, 20, 100, 100);
    }

    // stop() method
    public void stop() {
        currentColor = Color.blue;
    }

    // destroy() method
    public void destroy() {
        currentColor = Color.gray;
    }
}
