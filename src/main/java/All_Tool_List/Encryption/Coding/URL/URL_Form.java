/*
 * Created by JFormDesigner on Fri Apr 03 16:22:14 CST 2020
 */

package All_Tool_List.Encryption.Coding.URL;

import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import javax.swing.*;

/**
 * @author 1
 */
public class URL_Form extends JPanel {
    public URL_Form() {
        initComponents();
    }

    private static URL_impl URL_impl = new URL_impl();

    private void URLEnCodeBTActionPerformed(ActionEvent e) {
        try {
            URLDeCodeArea.setText(URL_impl.URLEncode(URLSourceArea.getText()));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

    private void URLDeCodeBTActionPerformed(ActionEvent e) {
        try {
            URLDeCodeArea.setText(URL_impl.URLDecode(URLSourceArea.getText()));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        URL = new JPanel();
        TitleLBURL = new JLabel();
        URLSCLP1 = new JScrollPane();
        URLSourceArea = new JTextArea();
        URLSCLP2 = new JScrollPane();
        URLDeCodeArea = new JTextArea();
        URLEnCodeBT = new JButton();
        URLDeCodeBT = new JButton();

        //======== this ========
        setLayout(null);

        //======== URL ========
        {
            URL.setBackground(null);
            URL.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            URL.setLayout(null);

            //---- TitleLBURL ----
            TitleLBURL.setText("URL");
            TitleLBURL.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBURL.setForeground(null);
            URL.add(TitleLBURL);
            TitleLBURL.setBounds(271, 35, 78, 54);

            //======== URLSCLP1 ========
            {

                //---- URLSourceArea ----
                URLSourceArea.setLineWrap(true);
                URLSCLP1.setViewportView(URLSourceArea);
            }
            URL.add(URLSCLP1);
            URLSCLP1.setBounds(45, 120, 530, 151);

            //======== URLSCLP2 ========
            {

                //---- URLDeCodeArea ----
                URLDeCodeArea.setLineWrap(true);
                URLSCLP2.setViewportView(URLDeCodeArea);
            }
            URL.add(URLSCLP2);
            URLSCLP2.setBounds(45, 410, 530, 151);

            //---- URLEnCodeBT ----
            URLEnCodeBT.setText("EnCode");
            URLEnCodeBT.addActionListener(e -> URLEnCodeBTActionPerformed(e));
            URL.add(URLEnCodeBT);
            URLEnCodeBT.setBounds(155, 318, 115, 45);

            //---- URLDeCodeBT ----
            URLDeCodeBT.setText("DeCode");
            URLDeCodeBT.addActionListener(e -> URLDeCodeBTActionPerformed(e));
            URL.add(URLDeCodeBT);
            URLDeCodeBT.setBounds(352, 318, 115, 45);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < URL.getComponentCount(); i++) {
                    Rectangle bounds = URL.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = URL.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                URL.setMinimumSize(preferredSize);
                URL.setPreferredSize(preferredSize);
            }
        }
        add(URL);
        URL.setBounds(0, 0, 620, 590);

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
    private JPanel URL;
    private JLabel TitleLBURL;
    private JScrollPane URLSCLP1;
    private JTextArea URLSourceArea;
    private JScrollPane URLSCLP2;
    private JTextArea URLDeCodeArea;
    private JButton URLEnCodeBT;
    private JButton URLDeCodeBT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
