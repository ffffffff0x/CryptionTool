/*
 * Created by JFormDesigner on Fri Apr 03 15:06:51 CST 2020
 */

package All_Tool_List.ToolView.Setting;

import All_Tool_List.ToolView.RootView.RootView;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Setting_From extends JPanel {
    public Setting_From() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        try {
            new RootView().run();
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        //IntelliJTheme.install(Setting_From.class.getResourceAsStream("../../../Theme/Cyan_lighttheme.json"));
    }

    private void button2ActionPerformed(ActionEvent e) {
        FlatDarculaLaf.install();
        //IntelliJTheme.install(Setting_From.class.getResourceAsStream("Theme/Hiberbee.json"));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        index = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setLayout(null);

        //======== index ========
        {
            index.setBackground(null);
            index.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            index.setLayout(null);

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- label1 ----
                label1.setText("\u914d\u8272\u4fee\u6539");
                panel1.add(label1);
                label1.setBounds(47, 11, 55, 25);

                //---- button1 ----
                button1.setText("\u4eae\u8272\u914d\u8272");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel1.add(button1);
                button1.setBounds(14, 45, 120, 31);

                //---- button2 ----
                button2.setText("\u6697\u8272\u914d\u8272");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel1.add(button2);
                button2.setBounds(14, 86, 120, 31);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            index.add(panel1);
            panel1.setBounds(10, 10, 150, 140);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < index.getComponentCount(); i++) {
                    Rectangle bounds = index.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = index.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                index.setMinimumSize(preferredSize);
                index.setPreferredSize(preferredSize);
            }
        }
        add(index);
        index.setBounds(0, 0, 620, 590);

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
    private JPanel index;
    private JPanel panel1;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
