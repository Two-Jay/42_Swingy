package kr.seoul.ftseoul.swingy;

import javax.swing.SwingUtilities;

import kr.seoul.ftseoul.swingy.view.WindowView.*;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar swingy.jar [console/gui]");
            System.exit(1);
        }

        if (args[0].equals("console")) {
            System.out.println("Console mode");
        } else if (args[0].equals("gui")) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    WindowView windowView = new WindowView(new WindowFrame());
                }
            });
            System.out.println("GUI mode");
        } else {
            System.out.println("Usage: java -jar swingy.jar [console/gui]");
            System.exit(1);
        }
    }
}
