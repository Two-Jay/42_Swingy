package kr.ft.seoul.swingy.View.Window;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;

public class WindowMenubar extends JMenuBar {
    public WindowMenubar () {
        this.setOpaque(true);
        this.setBackground(new Color(154, 165, 127));
        this.setPreferredSize(new Dimension(200, 20));
    }
}
