/*
 * Created by JFormDesigner on Fri Apr 03 10:37:05 CST 2020
 */

package All_Tool_List.Encryption.Modern.SM3;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

/**
 * @author 1
 */
public class SM3_Form extends JPanel {
    public SM3_Form() {
        initComponents();
    }

    private static SM3_impl SM3_impl = new SM3_impl();

    private void SM3encodebtnActionPerformed(ActionEvent e) {
        try {
            String out = SM3_impl.byteArrayToHexString(SM3_impl.hash(SM3Source1.getText().getBytes()));
            SM3encode3.setText(out);
            SM3encode2.setText(out.toLowerCase());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        SM3 = new JPanel();
        TitleLBSM3 = new JLabel();
        SM3SCLP1 = new JScrollPane();
        SM3Source1 = new JTextArea();
        SM3SCLP2 = new JScrollPane();
        SM3encode2 = new JTextArea();
        SM3SCLP3 = new JScrollPane();
        SM3encode3 = new JTextArea();
        SM3encodebtn = new JButton();
        SM3LB4 = new JLabel();
        SM3LB5 = new JLabel();
        SM3LB6 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== SM3 ========
        {
            SM3.setBackground(null);
            SM3.setToolTipText(" ");
            SM3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            SM3.setLayout(null);

            //---- TitleLBSM3 ----
            TitleLBSM3.setText("SM3");
            TitleLBSM3.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBSM3.setForeground(null);
            SM3.add(TitleLBSM3);
            TitleLBSM3.setBounds(270, 35, 81, TitleLBSM3.getPreferredSize().height);

            //======== SM3SCLP1 ========
            {

                //---- SM3Source1 ----
                SM3Source1.setLineWrap(true);
                SM3SCLP1.setViewportView(SM3Source1);
            }
            SM3.add(SM3SCLP1);
            SM3SCLP1.setBounds(5, 129, 611, 140);

            //======== SM3SCLP2 ========
            {

                //---- SM3encode2 ----
                SM3encode2.setLineWrap(true);
                SM3SCLP2.setViewportView(SM3encode2);
            }
            SM3.add(SM3SCLP2);
            SM3SCLP2.setBounds(85, 383, 403, 57);

            //======== SM3SCLP3 ========
            {

                //---- SM3encode3 ----
                SM3encode3.setLineWrap(true);
                SM3SCLP3.setViewportView(SM3encode3);
            }
            SM3.add(SM3SCLP3);
            SM3SCLP3.setBounds(85, 469, 403, 57);

            //---- SM3encodebtn ----
            SM3encodebtn.setText("Encrypt");
            SM3encodebtn.addActionListener(e -> SM3encodebtnActionPerformed(e));
            SM3.add(SM3encodebtn);
            SM3encodebtn.setBounds(515, 420, 80, 61);

            //---- SM3LB4 ----
            SM3LB4.setText("\u2191   Source");
            SM3LB4.setBackground(new Color(51, 51, 51));
            SM3LB4.setForeground(null);
            SM3LB4.setFont(SM3LB4.getFont().deriveFont(SM3LB4.getFont().getSize() + 5f));
            SM3.add(SM3LB4);
            SM3LB4.setBounds(12, 275, 98, 22);

            //---- SM3LB5 ----
            SM3LB5.setText("Result      \u2192");
            SM3LB5.setForeground(null);
            SM3.add(SM3LB5);
            SM3LB5.setBounds(7, 401, 77, 21);

            //---- SM3LB6 ----
            SM3LB6.setText("UPResult  \u2192");
            SM3LB6.setForeground(null);
            SM3.add(SM3LB6);
            SM3LB6.setBounds(7, 487, 77, 21);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < SM3.getComponentCount(); i++) {
                    Rectangle bounds = SM3.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = SM3.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                SM3.setMinimumSize(preferredSize);
                SM3.setPreferredSize(preferredSize);
            }
        }
        add(SM3);
        SM3.setBounds(0, 0, 620, 590);

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
    private JPanel SM3;
    private JLabel TitleLBSM3;
    private JScrollPane SM3SCLP1;
    private JTextArea SM3Source1;
    private JScrollPane SM3SCLP2;
    private JTextArea SM3encode2;
    private JScrollPane SM3SCLP3;
    private JTextArea SM3encode3;
    private JButton SM3encodebtn;
    private JLabel SM3LB4;
    private JLabel SM3LB5;
    private JLabel SM3LB6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
