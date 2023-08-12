package kr.seoul.ftseoul.swingy.View.Command;

import java.awt.event.ActionListener;

public class ScreenCommand implements Command {
    private int key;
    private ActionListener actionListener;

    public ScreenCommand(String commandName, ActionListener actionListener) {
        this.key = commandName.hashCode();
        this.actionListener = actionListener;
    }

    @Override
    public void execute() {
        actionListener.actionPerformed(null);
    }
}
