package kr.seoul.ftseoul.swingy.View.WindowView.Screen.ConcreteScreen;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kr.seoul.ftseoul.swingy.View.Command.Command;
import kr.seoul.ftseoul.swingy.View.Command.ScreenCommand;
import kr.seoul.ftseoul.swingy.View.WindowView.Screen.BaseScreen;
import kr.seoul.ftseoul.swingy.View.WindowView.Screen.ScreenLoader;

import java.util.HashMap;

import java.awt.Dimension;
import java.awt.GridLayout;

public class WelcomePhaseScreen extends BaseScreen {
    private HashMap<String, Command> commands = new HashMap<String, Command>();

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
        Command exitCommand = new ScreenCommand("Exit", e -> {
            System.out.println("Exit Button Clicked");
            System.exit(0);
        });
        commands.put("Exit", exitCommand);
        buttonPanel.add(exitButton);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 800, 600);
        label.add(buttonPanel);
        addComponent(label);
    }
}
