package kr.seoul.ftseoul.swingy.View.WindowView.Screen.ConcreteScreen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kr.seoul.ftseoul.swingy.View.WindowView.Screen.BaseScreen;
import kr.seoul.ftseoul.swingy.View.WindowView.Screen.ScreenLoader;

import java.awt.Dimension;
import java.awt.GridLayout;

public class CharacterCreationPhaseScreen extends BaseScreen {
    public void setup() {
        System.out.println("CharacterCreationPhaseScreen");

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1));
        buttonPanel.setSize(new Dimension(100, 150));
        buttonPanel.setLocation(600, 300);

        JButton createButton = new JButton("Create");
        createButton.setBounds(100, 100, 100, 50);
        createButton.addActionListener(e -> {
            System.out.println("Create Button Clicked");
        });
        buttonPanel.add(createButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 200, 100, 50);
        backButton.addActionListener(e -> {
            ScreenLoader.getInstance().load("WelcomePhase");
        });
        buttonPanel.add(backButton);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 800, 600);
        label.add(buttonPanel);
        addComponent(label);
    }
}
