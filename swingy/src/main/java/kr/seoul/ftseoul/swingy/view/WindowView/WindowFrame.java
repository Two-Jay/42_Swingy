package kr.seoul.ftseoul.swingy.View.WindowView;

import javax.swing.JFrame;

import kr.seoul.ftseoul.swingy.View.WindowView.Screen.ScreenLoader;

public class WindowFrame extends JFrame {
    private ScreenLoader screenLoader = ScreenLoader.getInstance();

    public WindowFrame() {
        screenLoader.setFrame(this);
        screenLoader.load("WelcomePhase");
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
