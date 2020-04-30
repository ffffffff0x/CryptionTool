import All_Tool_List.ToolView.RootView.RootView;
import All_Tool_List.ToolView.Template.Template;
import com.formdev.flatlaf.*;

public class ToolStart {
    public static void main(String[] args) {
        IntelliJTheme.install(ToolStart.class.getResourceAsStream("/Theme/Hiberbee.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/Cyan_lighttheme.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/DarkFlatTheme.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/MaterialTheme.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/One_Dark.json"));
        //IntelliJTheme.install(ToolStart.class.getResourceAsStream("Theme/Nord.json"));
        //FlatDarculaLaf.install();
        //FlatLightLaf.install();

        //FlatLaf.updateUI();
        new RootView().run();
    }
}
