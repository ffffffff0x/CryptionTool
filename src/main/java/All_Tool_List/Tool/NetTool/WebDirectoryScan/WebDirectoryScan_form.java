/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import javax.swing.*;
import java.awt.*;

/**
 * @author 1
 */
public class WebDirectoryScan_form extends JPanel {
    public WebDirectoryScan_form() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Template = new JPanel();
        TitleLBWebDirectoryScan = new JLabel();

        //======== this ========
        setLayout(null);

        //======== Template ========
        {
            Template.setBackground(null);
            Template.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Template.setLayout(null);

            //---- TitleLBWebDirectoryScan ----
            TitleLBWebDirectoryScan.setText("WebDirectoryScan");
            TitleLBWebDirectoryScan.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBWebDirectoryScan.setForeground(null);
            Template.add(TitleLBWebDirectoryScan);
            TitleLBWebDirectoryScan.setBounds(142, 35, 335, 54);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Template.getComponentCount(); i++) {
                    Rectangle bounds = Template.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Template.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Template.setMinimumSize(preferredSize);
                Template.setPreferredSize(preferredSize);
            }
        }
        add(Template);
        Template.setBounds(0, 0, 620, 590);

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
    private JPanel Template;
    private JLabel TitleLBWebDirectoryScan;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
