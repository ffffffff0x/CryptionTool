/*
 * Created by JFormDesigner on Fri Apr 03 10:32:20 CST 2020
 */

package All_Tool_List.Encryption.Coding.Base64;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Base64_Form extends JPanel {
    public Base64_Form() {
        initComponents();
    }

    private static Base64_impl Base64I = new Base64_impl();

    private void base64decodeActionPerformed(ActionEvent e) {
        base64code.setText(Base64I.Base64Decode(base64source.getText()));
    }

    private void base64encodeActionPerformed(ActionEvent e) {
        base64code.setText(Base64I.Base64Encode(base64source.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        base64 = new JPanel();
        TitleLBbase64 = new JLabel();
        base64SCLP1 = new JScrollPane();
        base64source = new JTextArea();
        base64SCLP2 = new JScrollPane();
        base64code = new JTextArea();
        base64decode = new JButton();
        base64encode = new JButton();

        //======== this ========
        setLayout(null);

        //======== base64 ========
        {
            base64.setBackground(null);
            base64.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            base64.setLayout(null);

            //---- TitleLBbase64 ----
            TitleLBbase64.setText("BASE64");
            TitleLBbase64.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBbase64.setForeground(null);
            base64.add(TitleLBbase64);
            TitleLBbase64.setBounds(240, 35, 143, 54);

            //======== base64SCLP1 ========
            {

                //---- base64source ----
                base64source.setLineWrap(true);
                base64SCLP1.setViewportView(base64source);
            }
            base64.add(base64SCLP1);
            base64SCLP1.setBounds(45, 120, 530, 151);

            //======== base64SCLP2 ========
            {

                //---- base64code ----
                base64code.setLineWrap(true);
                base64SCLP2.setViewportView(base64code);
            }
            base64.add(base64SCLP2);
            base64SCLP2.setBounds(45, 410, 530, 151);

            //---- base64decode ----
            base64decode.setText("DeCode");
            base64decode.addActionListener(e -> base64decodeActionPerformed(e));
            base64.add(base64decode);
            base64decode.setBounds(352, 318, 115, 45);

            //---- base64encode ----
            base64encode.setText("EnCode");
            base64encode.addActionListener(e -> base64encodeActionPerformed(e));
            base64.add(base64encode);
            base64encode.setBounds(155, 318, 115, 45);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < base64.getComponentCount(); i++) {
                    Rectangle bounds = base64.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = base64.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                base64.setMinimumSize(preferredSize);
                base64.setPreferredSize(preferredSize);
            }
        }
        add(base64);
        base64.setBounds(0, 0, 620, 590);

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
    private JPanel base64;
    private JLabel TitleLBbase64;
    private JScrollPane base64SCLP1;
    private JTextArea base64source;
    private JScrollPane base64SCLP2;
    private JTextArea base64code;
    private JButton base64decode;
    private JButton base64encode;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
