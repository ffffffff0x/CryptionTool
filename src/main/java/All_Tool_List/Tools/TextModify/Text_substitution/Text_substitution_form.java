/*
 * Created by JFormDesigner on Wed Apr 08 13:59:28 CST 2020
 */

package All_Tool_List.Tools.TextModify.Text_substitution;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Text_substitution_form extends JPanel {
    public Text_substitution_form() {
        initComponents();
    }

    private Text_substitution_impl Text_substitution_impl = new Text_substitution_impl();

    private void Text_SubstitutionBTActionPerformed(ActionEvent e) {

        Text_SubstitutionArea2.setText(Text_substitution_impl.Text_substitution(Text_SubstitutionArea1.getText(),
                Text_SubstitutionCHARAREA.getText(),
                Text_SubstitutionTARGERAREA.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Text_Substitution = new JPanel();
        Text_SubstitutionLB1 = new JLabel();
        Text_SubstitutionLB3 = new JLabel();
        TitleLBText_Substitution = new JLabel();
        Text_SubstitutionSCLP1 = new JScrollPane();
        Text_SubstitutionArea1 = new JTextArea();
        Text_SubstitutionSCLP2 = new JScrollPane();
        Text_SubstitutionArea2 = new JTextArea();
        Text_SubstitutionBT = new JButton();
        Text_SubstitutionLB2 = new JLabel();
        Text_SubstitutionSCLP3 = new JScrollPane();
        Text_SubstitutionCHARAREA = new JTextArea();
        Text_SubstitutionSCPL4 = new JScrollPane();
        Text_SubstitutionTARGERAREA = new JTextArea();

        //======== this ========
        setLayout(null);

        //======== Text_Substitution ========
        {
            Text_Substitution.setBackground(null);
            Text_Substitution.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Text_Substitution.setLayout(null);

            //---- Text_SubstitutionLB1 ----
            Text_SubstitutionLB1.setText("OldString");
            Text_Substitution.add(Text_SubstitutionLB1);
            Text_SubstitutionLB1.setBounds(65, 295, 62, 16);

            //---- Text_SubstitutionLB3 ----
            Text_SubstitutionLB3.setText("NewString");
            Text_Substitution.add(Text_SubstitutionLB3);
            Text_SubstitutionLB3.setBounds(280, 295, 62, 16);

            //---- TitleLBText_Substitution ----
            TitleLBText_Substitution.setText("Text Substitution");
            TitleLBText_Substitution.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBText_Substitution.setForeground(null);
            Text_Substitution.add(TitleLBText_Substitution);
            TitleLBText_Substitution.setBounds(156, 35, 307, 54);

            //======== Text_SubstitutionSCLP1 ========
            {

                //---- Text_SubstitutionArea1 ----
                Text_SubstitutionArea1.setLineWrap(true);
                Text_SubstitutionSCLP1.setViewportView(Text_SubstitutionArea1);
            }
            Text_Substitution.add(Text_SubstitutionSCLP1);
            Text_SubstitutionSCLP1.setBounds(45, 120, 530, 151);

            //======== Text_SubstitutionSCLP2 ========
            {

                //---- Text_SubstitutionArea2 ----
                Text_SubstitutionArea2.setLineWrap(true);
                Text_SubstitutionSCLP2.setViewportView(Text_SubstitutionArea2);
            }
            Text_Substitution.add(Text_SubstitutionSCLP2);
            Text_SubstitutionSCLP2.setBounds(45, 410, 530, 151);

            //---- Text_SubstitutionBT ----
            Text_SubstitutionBT.setText("Transformation");
            Text_SubstitutionBT.addActionListener(e -> Text_SubstitutionBTActionPerformed(e));
            Text_Substitution.add(Text_SubstitutionBT);
            Text_SubstitutionBT.setBounds(430, 315, 125, 45);

            //---- Text_SubstitutionLB2 ----
            Text_SubstitutionLB2.setText("---------->");
            Text_Substitution.add(Text_SubstitutionLB2);
            Text_SubstitutionLB2.setBounds(200, 329, 65, Text_SubstitutionLB2.getPreferredSize().height);

            //======== Text_SubstitutionSCLP3 ========
            {

                //---- Text_SubstitutionCHARAREA ----
                Text_SubstitutionCHARAREA.setLineWrap(true);
                Text_SubstitutionSCLP3.setViewportView(Text_SubstitutionCHARAREA);
            }
            Text_Substitution.add(Text_SubstitutionSCLP3);
            Text_SubstitutionSCLP3.setBounds(65, 310, 120, 55);

            //======== Text_SubstitutionSCPL4 ========
            {

                //---- Text_SubstitutionTARGERAREA ----
                Text_SubstitutionTARGERAREA.setLineWrap(true);
                Text_SubstitutionSCPL4.setViewportView(Text_SubstitutionTARGERAREA);
            }
            Text_Substitution.add(Text_SubstitutionSCPL4);
            Text_SubstitutionSCPL4.setBounds(280, 310, 120, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Text_Substitution.getComponentCount(); i++) {
                    Rectangle bounds = Text_Substitution.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Text_Substitution.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Text_Substitution.setMinimumSize(preferredSize);
                Text_Substitution.setPreferredSize(preferredSize);
            }
        }
        add(Text_Substitution);
        Text_Substitution.setBounds(0, 0, 620, 590);

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
    private JPanel Text_Substitution;
    private JLabel Text_SubstitutionLB1;
    private JLabel Text_SubstitutionLB3;
    private JLabel TitleLBText_Substitution;
    private JScrollPane Text_SubstitutionSCLP1;
    private JTextArea Text_SubstitutionArea1;
    private JScrollPane Text_SubstitutionSCLP2;
    private JTextArea Text_SubstitutionArea2;
    private JButton Text_SubstitutionBT;
    private JLabel Text_SubstitutionLB2;
    private JScrollPane Text_SubstitutionSCLP3;
    private JTextArea Text_SubstitutionCHARAREA;
    private JScrollPane Text_SubstitutionSCPL4;
    private JTextArea Text_SubstitutionTARGERAREA;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
