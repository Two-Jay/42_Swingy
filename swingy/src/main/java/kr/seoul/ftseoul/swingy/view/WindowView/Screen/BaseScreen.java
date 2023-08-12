package kr.seoul.ftseoul.swingy.View.WindowView.Screen;

import javax.swing.JComponent;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseScreen implements Screen {
    private List<JComponent> components = new ArrayList<JComponent>();

    public abstract void setup();

    public void addComponent(JComponent component) {
        components.add(component);
    }

    public List<JComponent> getComponents() {
        return components;
    }
}
