package kr.seoul.ftseoul.swingy.View.TerminalView;

import java.util.HashMap;

public class ConsoleTextLoader {
    private HashMap<String, ConsoleText> consoleTexts = new HashMap<>();

    private ConsoleTextLoader() {
    }

    class Holder {
        static final ConsoleTextLoader INSTANCE = new ConsoleTextLoader();
    }

    public static ConsoleTextLoader getInstance() {
        return Holder.INSTANCE;
    }
}
