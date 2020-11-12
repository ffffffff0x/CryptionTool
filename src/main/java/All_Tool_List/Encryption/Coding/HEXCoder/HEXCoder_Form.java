/*
 * Created by JFormDesigner on Fri Apr 03 10:33:31 CST 2020
 */

package All_Tool_List.Encryption.Coding.HEXCoder;

import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import javax.swing.*;

/**
 * @author 1
 */
public class HEXCoder_Form extends JPanel {
    public HEXCoder_Form() {
        initComponents();
        CBOXItemADD();
    }

    private static HEXCoder_impl HEXCoder_impl = new HEXCoder_impl();

    private void HEXEnCodeBTActionPerformed(ActionEvent e) {
        try {
            HEXDeCodeArea.setText(HEXCoder_impl.Encode(HEXSourceArea.getText(), Objects.requireNonNull(HEXDelCBox.getSelectedItem()).toString()));
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();unsupportedEncodingException.printStackTrace();
        }
    }

    private void HEXDeCodeBTActionPerformed(ActionEvent e) {
        HEXDeCodeArea.setText(HEXCoder_impl.Decode(HEXSourceArea.getText(),Objects.requireNonNull(HEXDelCBox.getSelectedItem()).toString()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        HEX = new JPanel();
        TitleLBHEX = new JLabel();
        HEXSCLP1 = new JScrollPane();
        HEXSourceArea = new JTextArea();
        HEXSCLP2 = new JScrollPane();
        HEXDeCodeArea = new JTextArea();
        HEXEnCodeBT = new JButton();
        HEXDeCodeBT = new JButton();
        HEXDelCBox = new JComboBox();

        //======== this ========
        setLayout(null);

        //======== HEX ========
        {
            HEX.setBackground(null);
            HEX.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            HEX.setLayout(null);

            //---- TitleLBHEX ----
            TitleLBHEX.setText("HEX");
            TitleLBHEX.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBHEX.setForeground(null);
            HEX.add(TitleLBHEX);
            TitleLBHEX.setBounds(271, 35, 78, 54);

            //======== HEXSCLP1 ========
            {

                //---- HEXSourceArea ----
                HEXSourceArea.setLineWrap(true);
                HEXSCLP1.setViewportView(HEXSourceArea);
            }
            HEX.add(HEXSCLP1);
            HEXSCLP1.setBounds(45, 120, 530, 151);

            //======== HEXSCLP2 ========
            {

                //---- HEXDeCodeArea ----
                HEXDeCodeArea.setLineWrap(true);
                HEXSCLP2.setViewportView(HEXDeCodeArea);
            }
            HEX.add(HEXSCLP2);
            HEXSCLP2.setBounds(45, 410, 530, 151);

            //---- HEXEnCodeBT ----
            HEXEnCodeBT.setText("EnCode");
            HEXEnCodeBT.addActionListener(e -> HEXEnCodeBTActionPerformed(e));
            HEX.add(HEXEnCodeBT);
            HEXEnCodeBT.setBounds(104, 318, 115, 45);

            //---- HEXDeCodeBT ----
            HEXDeCodeBT.setText("DeCode");
            HEXDeCodeBT.addActionListener(e -> HEXDeCodeBTActionPerformed(e));
            HEX.add(HEXDeCodeBT);
            HEXDeCodeBT.setBounds(407, 318, 115, 45);
            HEX.add(HEXDelCBox);
            HEXDelCBox.setBounds(249, 321, 128, 38);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < HEX.getComponentCount(); i++) {
                    Rectangle bounds = HEX.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = HEX.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                HEX.setMinimumSize(preferredSize);
                HEX.setPreferredSize(preferredSize);
            }
        }
        add(HEX);
        HEX.setBounds(0, 0, 620, 590);

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
    private JPanel HEX;
    private JLabel TitleLBHEX;
    private JScrollPane HEXSCLP1;
    private JTextArea HEXSourceArea;
    private JScrollPane HEXSCLP2;
    private JTextArea HEXDeCodeArea;
    private JButton HEXEnCodeBT;
    private JButton HEXDeCodeBT;
    private JComboBox HEXDelCBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        HEXDelCBox.addItem("NULL");
        HEXDelCBox.addItem("0x");
        HEXDelCBox.addItem("\\x");
        HEXDelCBox.addItem("    Space");
        HEXDelCBox.addItem(",   Comma");
        HEXDelCBox.addItem(";   Semicolon");
        HEXDelCBox.addItem(":   Colon");
        HEXDelCBox.addItem("\\n Newline");
    }
}
