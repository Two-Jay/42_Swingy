package kr.ft.seoul.swingy.View.Window;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class WindowLabel extends JLabel {
    public WindowLabel() {
        this.setOpaque(true);
        this.setBackground(new Color(248, 213, 131));
        this.setPreferredSize(new Dimension(200, 180));
    }
}

