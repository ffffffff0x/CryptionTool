/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.ToolView.Template;

import java.awt.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Template extends JPanel {
    public Template() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Template = new JPanel();
        TitleLBTEMP = new JLabel();
        TemplateSCLP1 = new JScrollPane();
        TempArea1 = new JTextArea();
        TemplateSCLP2 = new JScrollPane();
        TempArea2 = new JTextArea();
        Tempbutton2 = new JButton();
        Tempbutton3 = new JButton();

        //======== this ========
        setLayout(null);

        //======== Template ========
        {
            Template.setBackground(Color.gray);
            Template.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Template.setLayout(null);

            //---- TitleLBTEMP ----
            TitleLBTEMP.setText("TEMP");
            TitleLBTEMP.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBTEMP.setForeground(null);
            Template.add(TitleLBTEMP);
            TitleLBTEMP.setBounds(258, 35, 105, 54);

            //======== TemplateSCLP1 ========
            {

                //---- TempArea1 ----
                TempArea1.setLineWrap(true);
                TemplateSCLP1.setViewportView(TempArea1);
            }
            Template.add(TemplateSCLP1);
            TemplateSCLP1.setBounds(45, 120, 530, 151);

            //======== TemplateSCLP2 ========
            {

                //---- TempArea2 ----
                TempArea2.setLineWrap(true);
                TemplateSCLP2.setViewportView(TempArea2);
            }
            Template.add(TemplateSCLP2);
            TemplateSCLP2.setBounds(45, 410, 530, 151);

            //---- Tempbutton2 ----
            Tempbutton2.setText("EnCode");
            Template.add(Tempbutton2);
            Tempbutton2.setBounds(155, 318, 115, 45);

            //---- Tempbutton3 ----
            Tempbutton3.setText("DeCode");
            Template.add(Tempbutton3);
            Tempbutton3.setBounds(352, 318, 115, 45);

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
    private JLabel TitleLBTEMP;
    private JScrollPane TemplateSCLP1;
    private JTextArea TempArea1;
    private JScrollPane TemplateSCLP2;
    private JTextArea TempArea2;
    private JButton Tempbutton2;
    private JButton Tempbutton3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
