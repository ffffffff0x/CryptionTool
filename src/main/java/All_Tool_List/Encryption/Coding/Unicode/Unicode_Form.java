/*
 * Created by JFormDesigner on Fri Apr 03 10:34:12 CST 2020
 */

package All_Tool_List.Encryption.Coding.Unicode;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Unicode_Form extends JPanel {
    public Unicode_Form() {
        initComponents();
    }

    private static Unicode_impl Unicode_impl = new Unicode_impl();

    private void UnicodeEnCodeBTActionPerformed(ActionEvent e) {
        UnicodeDeCodeArea.setText(Unicode_impl.stringToUnicode(UnicodeSourceArea.getText()));
    }//Unicode

    private void UnicodeDeCodeBTActionPerformed(ActionEvent e) {
        UnicodeDeCodeArea.setText(Unicode_impl.unicodeToString(UnicodeSourceArea.getText()));
    }//Unicode

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Unicode = new JPanel();
        TitleLBUnicode = new JLabel();
        UnicodeSCLP1 = new JScrollPane();
        UnicodeSourceArea = new JTextArea();
        UnicodeSCLP2 = new JScrollPane();
        UnicodeDeCodeArea = new JTextArea();
        UnicodeEnCodeBT = new JButton();
        UnicodeDeCodeBT = new JButton();

        //======== this ========
        setLayout(null);

        //======== Unicode ========
        {
            Unicode.setBackground(null);
            Unicode.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Unicode.setLayout(null);

            //---- TitleLBUnicode ----
            TitleLBUnicode.setText("Unicode");
            TitleLBUnicode.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBUnicode.setForeground(null);
            Unicode.add(TitleLBUnicode);
            TitleLBUnicode.setBounds(235, 35, 150, 54);

            //======== UnicodeSCLP1 ========
            {

                //---- UnicodeSourceArea ----
                UnicodeSourceArea.setLineWrap(true);
                UnicodeSCLP1.setViewportView(UnicodeSourceArea);
            }
            Unicode.add(UnicodeSCLP1);
            UnicodeSCLP1.setBounds(45, 120, 530, 151);

            //======== UnicodeSCLP2 ========
            {

                //---- UnicodeDeCodeArea ----
                UnicodeDeCodeArea.setLineWrap(true);
                UnicodeSCLP2.setViewportView(UnicodeDeCodeArea);
            }
            Unicode.add(UnicodeSCLP2);
            UnicodeSCLP2.setBounds(45, 410, 530, 151);

            //---- UnicodeEnCodeBT ----
            UnicodeEnCodeBT.setText("EnCode");
            UnicodeEnCodeBT.addActionListener(e -> UnicodeEnCodeBTActionPerformed(e));
            Unicode.add(UnicodeEnCodeBT);
            UnicodeEnCodeBT.setBounds(155, 318, 115, 45);

            //---- UnicodeDeCodeBT ----
            UnicodeDeCodeBT.setText("DeCode");
            UnicodeDeCodeBT.addActionListener(e -> UnicodeDeCodeBTActionPerformed(e));
            Unicode.add(UnicodeDeCodeBT);
            UnicodeDeCodeBT.setBounds(352, 318, 115, 45);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Unicode.getComponentCount(); i++) {
                    Rectangle bounds = Unicode.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Unicode.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Unicode.setMinimumSize(preferredSize);
                Unicode.setPreferredSize(preferredSize);
            }
        }
        add(Unicode);
        Unicode.setBounds(0, 0, 620, 590);

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
    private JPanel Unicode;
    private JLabel TitleLBUnicode;
    private JScrollPane UnicodeSCLP1;
    private JTextArea UnicodeSourceArea;
    private JScrollPane UnicodeSCLP2;
    private JTextArea UnicodeDeCodeArea;
    private JButton UnicodeEnCodeBT;
    private JButton UnicodeDeCodeBT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
