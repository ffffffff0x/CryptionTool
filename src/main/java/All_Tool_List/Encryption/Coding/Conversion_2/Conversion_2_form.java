/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.Encryption.Coding.Conversion_2;

import All_Tool_List.Encryption.Coding.Conversion.Conversion_impl;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author 1
 */
public class Conversion_2_form extends JPanel {
    public Conversion_2_form() {
        initComponents();
        CBOXItemADD();
    }

    private static Conversion_2_impl Conversion_2_impl = new Conversion_2_impl();

    private void Conversion_2BTActionPerformed(ActionEvent e) {
        Conversion_2DesArea.setText(Conversion_2_impl.Base_Conversion(Conversion_2SourceArea.getText(),
                Integer.parseInt(Conversion_2SourceCB.getSelectedItem().toString()),
                Integer.parseInt(Conversion_2DesCB.getSelectedItem().toString()),
                Conversion_2SplitArea.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Conversion_2 = new JPanel();
        TitleLBConversion_2 = new JLabel();
        Conversion_2SourceCB = new JComboBox();
        Conversion_2DesCB = new JComboBox();
        Conversion_2SCLP1 = new JScrollPane();
        Conversion_2SourceArea = new JTextArea();
        Conversion_2SCLP2 = new JScrollPane();
        Conversion_2DesArea = new JTextArea();
        Conversion_2SCLP3 = new JScrollPane();
        Conversion_2SplitArea = new JTextArea();
        Conversion_2BT = new JButton();
        Conversion_2LB1 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== Conversion_2 ========
        {
            Conversion_2.setBackground(null);
            Conversion_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Conversion_2.setLayout(null);

            //---- TitleLBConversion_2 ----
            TitleLBConversion_2.setText("Conversion");
            TitleLBConversion_2.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBConversion_2.setForeground(null);
            Conversion_2.add(TitleLBConversion_2);
            TitleLBConversion_2.setBounds(209, 35, 202, 54);
            Conversion_2.add(Conversion_2SourceCB);
            Conversion_2SourceCB.setBounds(50, 96, 80, 24);
            Conversion_2.add(Conversion_2DesCB);
            Conversion_2DesCB.setBounds(50, 386, 80, 24);

            //======== Conversion_2SCLP1 ========
            {

                //---- Conversion_2SourceArea ----
                Conversion_2SourceArea.setLineWrap(true);
                Conversion_2SCLP1.setViewportView(Conversion_2SourceArea);
            }
            Conversion_2.add(Conversion_2SCLP1);
            Conversion_2SCLP1.setBounds(45, 120, 530, 151);

            //======== Conversion_2SCLP2 ========
            {

                //---- Conversion_2DesArea ----
                Conversion_2DesArea.setLineWrap(true);
                Conversion_2SCLP2.setViewportView(Conversion_2DesArea);
            }
            Conversion_2.add(Conversion_2SCLP2);
            Conversion_2SCLP2.setBounds(45, 410, 530, 151);

            //======== Conversion_2SCLP3 ========
            {
                Conversion_2SCLP3.setViewportView(Conversion_2SplitArea);
            }
            Conversion_2.add(Conversion_2SCLP3);
            Conversion_2SCLP3.setBounds(238, 315, 145, 50);

            //---- Conversion_2BT ----
            Conversion_2BT.setText("Conversion");
            Conversion_2BT.addActionListener(e -> Conversion_2BTActionPerformed(e));
            Conversion_2.add(Conversion_2BT);
            Conversion_2BT.setBounds(420, 318, 115, 45);

            //---- Conversion_2LB1 ----
            Conversion_2LB1.setText("SplitString");
            Conversion_2.add(Conversion_2LB1);
            Conversion_2LB1.setBounds(238, 300, 62, 16);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Conversion_2.getComponentCount(); i++) {
                    Rectangle bounds = Conversion_2.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Conversion_2.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Conversion_2.setMinimumSize(preferredSize);
                Conversion_2.setPreferredSize(preferredSize);
            }
        }
        add(Conversion_2);
        Conversion_2.setBounds(0, 0, 620, 590);

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
    private JPanel Conversion_2;
    private JLabel TitleLBConversion_2;
    private JComboBox Conversion_2SourceCB;
    private JComboBox Conversion_2DesCB;
    private JScrollPane Conversion_2SCLP1;
    private JTextArea Conversion_2SourceArea;
    private JScrollPane Conversion_2SCLP2;
    private JTextArea Conversion_2DesArea;
    private JScrollPane Conversion_2SCLP3;
    private JTextArea Conversion_2SplitArea;
    private JButton Conversion_2BT;
    private JLabel Conversion_2LB1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        Conversion_2SourceCB.addItem("10");
        for (int i = 2; i < 9; i++) Conversion_2SourceCB.addItem(String.valueOf(i));
        for (int i = 9; i <= 30; i++) Conversion_2SourceCB.addItem(String.valueOf(i));
        Conversion_2DesCB.addItem("16");
        for (int i = 2; i < 16; i++) Conversion_2DesCB.addItem(String.valueOf(i));
        for (int i = 17; i <= 30; i++) Conversion_2DesCB.addItem(String.valueOf(i));
    }
}
