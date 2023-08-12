package kr.seoul.ftseoul.swingy.View.WindowView.Screen.ConcreteScreen;

import javax.swing.JFormattedTextField;

import kr.seoul.ftseoul.swingy.View.WindowView.Screen.BaseScreen;

public class ScreenLoadingScreen extends BaseScreen {
    public void setup() {
        JFormattedTextField loadingText = new JFormattedTextField("Loading...");
        loadingText.setBounds(100, 100, 100, 100);
        addComponent(loadingText);
    }
}
