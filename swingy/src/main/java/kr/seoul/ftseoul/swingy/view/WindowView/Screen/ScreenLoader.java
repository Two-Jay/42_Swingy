package kr.seoul.ftseoul.swingy.view.WindowView.Screen;

import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ConcreteScreen.CharacterCreationPhaseScreen;
import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ConcreteScreen.WelcomePhaseScreen;

import java.util.HashMap;

public class ScreenLoader {
    private JFrame frame;
    private Screen currentScreen = null;
    private HashMap<String, Screen> screens = new HashMap<String, Screen>();

    private ScreenLoader() {
        screens.put("WelcomePhase", new WelcomePhaseScreen());
        screens.put("CreateHeroPhase", new CharacterCreationPhaseScreen());
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public static ScreenLoader getInstance() {
        return Holder.INSTANCE;
    }

    class Holder {
        static final ScreenLoader INSTANCE = new ScreenLoader();
    }

    public void loadimpl(Screen screen) {
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

    public void load(String screenName) {
        Screen screen = screens.get(screenName);
        if (screen == null) {
            throw new RuntimeException("Screen not found");
        }
        loadimpl(screen);
    }

    public void unload(Screen screen) {
        List<JComponent> components = screen.getComponents();
        for (JComponent component : components) {
            component.setVisible(false);
            frame.remove(component);
        }
    }
}
