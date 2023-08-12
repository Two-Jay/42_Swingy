package kr.seoul.ftseoul.swingy.view.WindowView.Screen;

import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class ScreenLoader {
    private JFrame frame;
    private Screen currentScreen = null;

    public ScreenLoader(JFrame frame) {
        this.frame = frame;
    }

    public void load(Screen screen) {
        screen.setup();
        if (currentScreen != null) {
            unload(currentScreen);
        }
        currentScreen = screen;
        List<JComponent> components = screen.getComponents();
        for (JComponent component : components) {
            frame.add(component);
            component.setVisible(true);
        }
    }

    public void unload(Screen screen) {
        List<JComponent> components = screen.getComponents();
        for (JComponent component : components) {
            component.setVisible(false);
            frame.remove(component);
        }
    }
}
