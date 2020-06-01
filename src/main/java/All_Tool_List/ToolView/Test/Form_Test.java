package All_Tool_List.ToolView.Test;

import All_Tool_List.Encryption.Modern.SM4.SM4_Form;
import All_Tool_List.Tool.NetTool.WebDirectoryScan.WebDirectoryScan_form;
import All_Tool_List.ToolView.Setting.ThemeSelect.ThemeSelect_form;
import All_Tool_List.ToolView.Template.Template;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.IntelliJTheme;

import javax.swing.*;

public class Form_Test {
    public static void main(String[] args) {

        //TestForm(new WebDirectoryScan_form());
        TestForm(new Template());
        IntelliJTheme.install(Form_Test.class.getResourceAsStream("/Theme/Hiberbee.json"));
        FlatLaf.updateUI();
    }

    public static void TestForm(JPanel a){
        JFrame f = new JFrame();
        f.add(a);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
