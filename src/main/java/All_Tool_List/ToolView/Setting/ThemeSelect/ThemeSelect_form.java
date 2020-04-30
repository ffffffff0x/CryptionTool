/*
 * Created by JFormDesigner on Tue Apr 14 11:37:40 CST 2020
 */

package All_Tool_List.ToolView.Setting.ThemeSelect;

import All_Tool_List.ToolView.Test.Form_Test;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.IntelliJTheme;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author 1
 */
public class ThemeSelect_form extends JPanel {
    public ThemeSelect_form() {
        initComponents();
        NodeAdd();
    }

    public void NodeAdd(){
        String[] themeSA = {"Hiberbee","DarkFlatTheme","MaterialTheme","One Dark","Nord"};
        JList list = new JList(themeSA);
        //ThemeSCLP.add(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ThemeSCLP.setViewportView(list);

        //IntelliJTheme.install(ThemeSelect_form.class.getResourceAsStream("/Theme/"+(list.getSelectedValue().toString()).replace(" ","_")+".json"));
        IntelliJTheme.install(Form_Test.class.getResourceAsStream("/Theme/Hiberbee.json"));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                IntelliJTheme.install(ThemeSelect_form.class.getResourceAsStream("/Theme/"+(list.getSelectedValue().toString()).replace(" ","_")+".json"));
                //SaveTheme("/Theme/"+(list.getSelectedValue().toString()).replace(" ","_")+".json");
                FlatLaf.updateUI();
                list.setSelectedIndex(list.getSelectedIndex());
            }
        });
    }

    private void ThemeCheck(String input){

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Theme = new JPanel();
        TitleLBTheme = new JLabel();
        ThemeSCLP = new JScrollPane();

        //======== this ========
        setLayout(null);

        //======== Theme ========
        {
            Theme.setBackground(null);
            Theme.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Theme.setLayout(null);

            //---- TitleLBTheme ----
            TitleLBTheme.setText("Theme");
            TitleLBTheme.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBTheme.setForeground(null);
            Theme.add(TitleLBTheme);
            TitleLBTheme.setBounds(249, 19, 122, 54);
            Theme.add(ThemeSCLP);
            ThemeSCLP.setBounds(190, 90, 240, 485);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Theme.getComponentCount(); i++) {
                    Rectangle bounds = Theme.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Theme.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Theme.setMinimumSize(preferredSize);
                Theme.setPreferredSize(preferredSize);
            }
        }
        add(Theme);
        Theme.setBounds(0, 0, 620, 590);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel Theme;
    private JLabel TitleLBTheme;
    private JScrollPane ThemeSCLP;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
