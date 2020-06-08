/*
 * Created by JFormDesigner on Tue Apr 07 15:15:13 CST 2020
 */

package All_Tool_List.Tools.TextModify.Case_conversion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Case_conversion_form extends JPanel {
    public Case_conversion_form() {
        initComponents();
    }

    private static Case_conversion_impl Case_conversion_impl = new Case_conversion_impl();

    private void Case_ConversionUPBTActionPerformed(ActionEvent e) {
        Case_ConversionRArea.setText(Case_conversion_impl.Uppercase(Case_ConversionSourceArea.getText()));
    }

    private void Case_ConversionLOBTActionPerformed(ActionEvent e) {
        Case_ConversionRArea.setText(Case_conversion_impl.Lowercase(Case_ConversionSourceArea.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Case_Conversion = new JPanel();
        Case_ConversionSCLP1 = new JScrollPane();
        Case_ConversionSourceArea = new JTextArea();
        Case_ConversionSCLP2 = new JScrollPane();
        Case_ConversionRArea = new JTextArea();
        Case_ConversionUPBT = new JButton();
        Case_ConversionLOBT = new JButton();
        TitleLBbase64 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== Case_Conversion ========
        {
            Case_Conversion.setBackground(null);
            Case_Conversion.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Case_Conversion.setForeground(null);
            Case_Conversion.setLayout(null);

            //======== Case_ConversionSCLP1 ========
            {

                //---- Case_ConversionSourceArea ----
                Case_ConversionSourceArea.setLineWrap(true);
                Case_ConversionSCLP1.setViewportView(Case_ConversionSourceArea);
            }
            Case_Conversion.add(Case_ConversionSCLP1);
            Case_ConversionSCLP1.setBounds(45, 120, 530, 151);

            //======== Case_ConversionSCLP2 ========
            {

                //---- Case_ConversionRArea ----
                Case_ConversionRArea.setLineWrap(true);
                Case_ConversionSCLP2.setViewportView(Case_ConversionRArea);
            }
            Case_Conversion.add(Case_ConversionSCLP2);
            Case_ConversionSCLP2.setBounds(45, 410, 530, 151);

            //---- Case_ConversionUPBT ----
            Case_ConversionUPBT.setText("UpperCase");
            Case_ConversionUPBT.addActionListener(e -> Case_ConversionUPBTActionPerformed(e));
            Case_Conversion.add(Case_ConversionUPBT);
            Case_ConversionUPBT.setBounds(155, 318, 115, 45);

            //---- Case_ConversionLOBT ----
            Case_ConversionLOBT.setText("LowerCase");
            Case_ConversionLOBT.addActionListener(e -> Case_ConversionLOBTActionPerformed(e));
            Case_Conversion.add(Case_ConversionLOBT);
            Case_ConversionLOBT.setBounds(352, 318, 115, 45);

            //---- TitleLBbase64 ----
            TitleLBbase64.setText("Case Conversion");
            TitleLBbase64.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBbase64.setForeground(null);
            TitleLBbase64.setBackground(null);
            Case_Conversion.add(TitleLBbase64);
            TitleLBbase64.setBounds(165, 35, 290, 54);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Case_Conversion.getComponentCount(); i++) {
                    Rectangle bounds = Case_Conversion.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Case_Conversion.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Case_Conversion.setMinimumSize(preferredSize);
                Case_Conversion.setPreferredSize(preferredSize);
            }
        }
        add(Case_Conversion);
        Case_Conversion.setBounds(0, 0, 620, 590);

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
    private JPanel Case_Conversion;
    private JScrollPane Case_ConversionSCLP1;
    private JTextArea Case_ConversionSourceArea;
    private JScrollPane Case_ConversionSCLP2;
    private JTextArea Case_ConversionRArea;
    private JButton Case_ConversionUPBT;
    private JButton Case_ConversionLOBT;
    private JLabel TitleLBbase64;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
