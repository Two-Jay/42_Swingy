package kr.seoul.ftseoul.swingy.view.WindowView.Screen;

import java.util.List;
import javax.swing.JComponent;

public interface Screen {
    public void setup();

    public List<JComponent> getComponents();
}
