/*
 * Created by JFormDesigner on Fri Apr 03 10:37:29 CST 2020
 */

package All_Tool_List.ToolView.Index;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Index_Form extends JPanel {
    public Index_Form() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        index = new JPanel();
        IndexLB = new JLabel();

        //======== this ========
        setLayout(null);

        //======== index ========
        {
            index.setBackground(new Color(228, 230, 235));
            index.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            index.setLayout(null);

            //---- IndexLB ----
            IndexLB.setIcon(new ImageIcon(getClass().getResource("/img/ffffffff0x_Logo.jpg")));
            IndexLB.setHorizontalAlignment(SwingConstants.CENTER);
            index.add(IndexLB);
            IndexLB.setBounds(0, 0, 620, 590);

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
    private JLabel IndexLB;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
