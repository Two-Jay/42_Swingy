package kr.seoul.ftseoul.swingy.view.WindowView;

import javax.swing.JFrame;

import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ScreenLoader;
import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ConcreteScreen.WelcomePhaseScreen;

public class WindowFrame extends JFrame {
    private ScreenLoader screenLoader = new ScreenLoader(this);

    public WindowFrame() {
        screenLoader.load(new WelcomePhaseScreen());
        basicSetup();
    }

    private void basicSetup() {
        setTitle("Swingy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
