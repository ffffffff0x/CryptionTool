import All_Tool_List.ToolView.accs;
import com.formdev.flatlaf.IntelliJTheme;

import javax.swing.*;

public class toolStart {
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        IntelliJTheme.install(toolStart.class.getResourceAsStream("Theme/Cyan_lighttheme.json"));
        //FlatLightLaf.install();
        //FlatDarculaLaf.install();
        accs accs = new accs();
        accs.init();
    }
}