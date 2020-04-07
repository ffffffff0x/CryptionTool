import All_Tool_List.ToolView.RootView.RootView;
import com.formdev.flatlaf.*;

public class ToolStart {
    public static void main(String[] args) {
        IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/Hiberbee.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/Cyan_lighttheme.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/DarkFlatTheme.json"));
        //FlatLightLaf.install();
        //FlatDarculaLaf.install();
        new RootView().run();
    }
}
