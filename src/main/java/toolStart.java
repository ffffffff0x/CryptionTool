import All_Tool_List.ToolView.accs;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;

public class toolStart {
    public static void main(String[] args){
        FlatLightLaf.install();
        IntelliJTheme.install(toolStart.class.getResourceAsStream("theme.json"));
        accs accs;
        accs = new accs();
        accs.init();
    }
}
