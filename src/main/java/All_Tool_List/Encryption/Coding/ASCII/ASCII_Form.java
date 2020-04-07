/*
 * Created by JFormDesigner on Fri Apr 03 11:22:08 CST 2020
 */

package All_Tool_List.Encryption.Coding.ASCII;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author 1
 */
public class ASCII_Form extends JPanel {
    public ASCII_Form() {
        initComponents();
        CBOXItemADD();
    }

    private static ASCII_impl ASCIII = new ASCII_impl();

    private void ASKIIEncodeBTActionPerformed(ActionEvent e) {
        ASCIIDeCode.setText(ASCIII.EnCode(ASCIISource.getText(),
                Objects.requireNonNull(ASCIICBox.getSelectedItem()).toString(),
                (Integer) ASCIISpinner.getValue()
        ));

        ASCIIDeCode2.setText(ASCIII.DeCode(ASCIIDeCode.getText(),Objects.requireNonNull(ASCIICBox.getSelectedItem()).toString()));
    }

    private void ASKIIDeCodeBTActionPerformed(ActionEvent e) {
        ASCIIDeCode.setText(ASCIII.DeCode(ASCIISource.getText(),Objects.requireNonNull(ASCIICBox.getSelectedItem()).toString()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ASCII = new JPanel();
        TitleLBASCII = new JLabel();
        ASCIISCLP1 = new JScrollPane();
        ASCIISource = new JTextArea();
        ASCIISCLP2 = new JScrollPane();
        ASCIIDeCode = new JTextArea();
        ASCIIEncodeBT = new JButton();
        ASCIIDeCodeBT = new JButton();
        ASCIICBox = new JComboBox();
        ASCIISpinner = new JSpinner();
        ASCIISCLP3 = new JScrollPane();
        ASCIIDeCode2 = new JTextArea();

        //======== this ========
        setLayout(null);

        //======== ASCII ========
        {
            ASCII.setBackground(null);
            ASCII.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            ASCII.setLayout(null);

            //---- TitleLBASCII ----
            TitleLBASCII.setText("ASCII");
            TitleLBASCII.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBASCII.setForeground(null);
            ASCII.add(TitleLBASCII);
            TitleLBASCII.setBounds(259, 35, 103, 54);

            //======== ASCIISCLP1 ========
            {

                //---- ASCIISource ----
                ASCIISource.setLineWrap(true);
                ASCIISCLP1.setViewportView(ASCIISource);
            }
            ASCII.add(ASCIISCLP1);
            ASCIISCLP1.setBounds(45, 120, 530, 100);

            //======== ASCIISCLP2 ========
            {

                //---- ASCIIDeCode ----
                ASCIIDeCode.setLineWrap(true);
                ASCIISCLP2.setViewportView(ASCIIDeCode);
            }
            ASCII.add(ASCIISCLP2);
            ASCIISCLP2.setBounds(45, 349, 530, 81);

            //---- ASCIIEncodeBT ----
            ASCIIEncodeBT.setText("EnCode");
            ASCIIEncodeBT.addActionListener(e -> ASKIIEncodeBTActionPerformed(e));
            ASCII.add(ASCIIEncodeBT);
            ASCIIEncodeBT.setBounds(54, 262, 115, 45);

            //---- ASCIIDeCodeBT ----
            ASCIIDeCodeBT.setText("DeCode");
            ASCIIDeCodeBT.addActionListener(e -> ASKIIDeCodeBTActionPerformed(e));
            ASCII.add(ASCIIDeCodeBT);
            ASCIIDeCodeBT.setBounds(448, 262, 115, 45);

            //---- ASCIICBox ----
            ASCIICBox.setBackground(null);
            ASCII.add(ASCIICBox);
            ASCIICBox.setBounds(186, 265, 128, 38);
            ASCII.add(ASCIISpinner);
            ASCIISpinner.setBounds(331, 269, 100, 30);

            //======== ASCIISCLP3 ========
            {

                //---- ASCIIDeCode2 ----
                ASCIIDeCode2.setLineWrap(true);
                ASCIISCLP3.setViewportView(ASCIIDeCode2);
            }
            ASCII.add(ASCIISCLP3);
            ASCIISCLP3.setBounds(45, 475, 530, 81);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ASCII.getComponentCount(); i++) {
                    Rectangle bounds = ASCII.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ASCII.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ASCII.setMinimumSize(preferredSize);
                ASCII.setPreferredSize(preferredSize);
            }
        }
        add(ASCII);
        ASCII.setBounds(0, 0, 620, 590);

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
    private JPanel ASCII;
    private JLabel TitleLBASCII;
    private JScrollPane ASCIISCLP1;
    private JTextArea ASCIISource;
    private JScrollPane ASCIISCLP2;
    private JTextArea ASCIIDeCode;
    private JButton ASCIIEncodeBT;
    private JButton ASCIIDeCodeBT;
    private JComboBox ASCIICBox;
    private JSpinner ASCIISpinner;
    private JScrollPane ASCIISCLP3;
    private JTextArea ASCIIDeCode2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        ASCIICBox.addItem("    Space");
        ASCIICBox.addItem("NULL");
        ASCIICBox.addItem("\\n Newline");
    }
}
