package kr.seoul.ftseoul.swingy.view.WindowView.Screen.ConcreteScreen;

import kr.seoul.ftseoul.swingy.view.WindowView.Screen.BaseScreen;
import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ScreenLoader;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;

public class WelcomePhaseScreen extends BaseScreen {
    public void setup() {
        System.out.println("WelcomePhaseScreen");

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        buttonPanel.setSize(new Dimension(100, 150));
        buttonPanel.setLocation(600, 300);

        JButton startButton = new JButton("Start");
        startButton.setBounds(100, 100, 100, 50);
        startButton.addActionListener(e -> {
            System.out.println("Start Button Clicked");
            ScreenLoader.getInstance().load("CreateHeroPhase");
        });
        buttonPanel.add(startButton);

        JButton loadButton = new JButton("Load");
        loadButton.setBounds(100, 200, 100, 50);
        loadButton.addActionListener(e -> {
            System.out.println("Load Button Clicked");
        });
        buttonPanel.add(loadButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(100, 300, 100, 50);
        exitButton.addActionListener(e -> {
            System.out.println("Exit Button Clicked");
            System.exit(0);
        });
        buttonPanel.add(exitButton);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 800, 600);
        label.add(buttonPanel);
        addComponent(label);
    }
}
