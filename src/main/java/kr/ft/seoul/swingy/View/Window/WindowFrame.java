package kr.ft.seoul.swingy.View.Window;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class WindowFrame extends JFrame {
    public WindowFrame(String frameName) {
        super(frameName);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set the menu bar and add the label to the content pane.
        this.setJMenuBar(new WindowMenubar());
        this.getContentPane().add(new WindowLabel(), BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }
}
