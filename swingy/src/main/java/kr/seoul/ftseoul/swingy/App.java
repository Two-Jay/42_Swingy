package kr.seoul.ftseoul.swingy;

import javax.swing.SwingUtilities;

import kr.seoul.ftseoul.swingy.view.WindowView.*;

class RunnableView implements Runnable {
    private void create() {
        WindowView windowView = new WindowView(new WindowFrame());
    }

    @Override
    public void run() {
        create();
    }
}

public class App {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar swingy.jar [console/gui]");
            System.exit(1);
        }

        if (args[0].equals("console")) {
            System.out.println("Console mode");
        } else if (args[0].equals("gui")) {
            SwingUtilities.invokeLater(new RunnableView());
            System.out.println("GUI mode");
        } else {
            System.out.println("Usage: java -jar swingy.jar [console/gui]");
            System.exit(1);
        }
    }
}
