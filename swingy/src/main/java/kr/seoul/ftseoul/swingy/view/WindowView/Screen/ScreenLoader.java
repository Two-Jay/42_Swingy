package kr.seoul.ftseoul.swingy.view.WindowView.Screen;

import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ConcreteScreen.CharacterCreationPhaseScreen;
import kr.seoul.ftseoul.swingy.view.WindowView.Screen.ConcreteScreen.WelcomePhaseScreen;

import java.util.HashMap;

/*
 * ScreenLoader
 * 싱글톤으로 작성했음
 * 로딩에 필요한 콘크리트스크린 정보를 생성자에서 HashMap에 넣어둠
 * load 메소드를 통해 콘크리트스크린을 불러옴
 * 초기에는 단순히 스크린 로드를 위한 클래스였으나, 하위 콘크리트 스크린에서 작동하는 
 * 이벤트 등지에서 상위 Frame에 로딩되어 있는 스크린을 바꾸는 작업을 하기 위해
 * 해당 클래스를 싱글톤으로 작성하고 스크린 로딩에 대한 작업을 전담하도록 함
 * 
 * 스크린 객체 생성시 필요한 비용을 런타임이 아니라 빌드 초기에 지불하기 위해
 * 해쉬맵에 각 인스턴스를 미리 생성하고 이를 불러오는 전략을 취함. 
 */
public class ScreenLoader {
    private JFrame frame;
    private Screen currentScreen = null;
    private HashMap<String, Screen> screens = new HashMap<String, Screen>();

    private ScreenLoader() {
        screens.put("WelcomePhase", new WelcomePhaseScreen());
        screens.put("CreateHeroPhase", new CharacterCreationPhaseScreen());
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public static ScreenLoader getInstance() {
        return Holder.INSTANCE;
    }

    class Holder {
        static final ScreenLoader INSTANCE = new ScreenLoader();
    }

    public void loadimpl(Screen screen) {
        screen.setup();
        if (currentScreen != null) {
            unload(currentScreen);
        }
        currentScreen = screen;
        List<JComponent> components = screen.getComponents();
        for (JComponent component : components) {
            frame.add(component);
            component.setVisible(true);
        }
    }

    public void load(String screenName) {
        Screen screen = screens.get(screenName);
        if (screen == null) {
            throw new RuntimeException("Screen not found");
        }
        loadimpl(screen);
    }

    public void unload(Screen screen) {
        List<JComponent> components = screen.getComponents();
        for (JComponent component : components) {
            component.setVisible(false);
            frame.remove(component);
        }
    }
}
