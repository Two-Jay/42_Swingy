package kr.ft.seoul.swingy;

import kr.ft.seoul.swingy.View.ViewManager;

public class App 
{
    public static void main( String[] args )
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ViewManager viewManager = new ViewManager();
            }
        });
    }
}
