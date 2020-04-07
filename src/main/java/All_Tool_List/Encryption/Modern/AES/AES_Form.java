/*
 * Created by JFormDesigner on Fri Apr 03 10:34:53 CST 2020
 */

package All_Tool_List.Encryption.Modern.AES;

import java.awt.*;
import java.awt.event.*;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.swing.*;

/**
 * @author 1
 */
public class AES_Form extends JPanel {
    public AES_Form() {
        initComponents();
        CBOXItemADD();
    }

    private AES_impl AES_impl = new AES_impl();

    private void AESEncryptBTActionPerformed(ActionEvent e) {
        try {
            AESResultArea.setText(AES_impl.AESEncrypt(AESSourceArea.getText(),
                    AESSecretKeyArea.getText(),
                    Objects.requireNonNull(AESModeCB.getSelectedItem()).toString(),
                    Objects.requireNonNull(AESOUTCB.getSelectedItem()).toString(),
                    Integer.parseInt(Objects.requireNonNull(AESKLengthCB.getSelectedItem()).toString())));
        } catch (GeneralSecurityException ex) {
            ex.printStackTrace();
        }
    }

    private void AESDecryptBTActionPerformed(ActionEvent e) {
        try {
            AESResultArea.setText(AES_impl.AESDecrypt(AESSourceArea.getText(),
                    AESSecretKeyArea.getText(),
                    Objects.requireNonNull(AESModeCB.getSelectedItem()).toString(),
                    Objects.requireNonNull(AESOUTCB.getSelectedItem()).toString(),
                    Integer.parseInt(Objects.requireNonNull(AESKLengthCB.getSelectedItem()).toString())));
        } catch (GeneralSecurityException ex) {
            ex.printStackTrace();
            AESResultArea.setText("Error");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        AES = new JPanel();
        TitleLBAES = new JLabel();
        AESSCLP1 = new JScrollPane();
        AESSourceArea = new JTextArea();
        AESSCLP2 = new JScrollPane();
        AESResultArea = new JTextArea();
        AESEncryptBT = new JButton();
        AESDecryptBT = new JButton();
        AESLB3 = new JLabel();
        AESSCLP3 = new JScrollPane();
        AESSecretKeyArea = new JTextArea();
        AESModeCB = new JComboBox();
        AESOUTCB = new JComboBox();
        AESKLengthCB = new JComboBox();
        AESLB4 = new JLabel();
        AESLB5 = new JLabel();
        AESLB6 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== AES ========
        {
            AES.setBackground(null);
            AES.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            AES.setLayout(null);

            //---- TitleLBAES ----
            TitleLBAES.setText("AES");
            TitleLBAES.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBAES.setForeground(null);
            AES.add(TitleLBAES);
            TitleLBAES.setBounds(273, 14, 73, 54);

            //======== AESSCLP1 ========
            {

                //---- AESSourceArea ----
                AESSourceArea.setLineWrap(true);
                AESSCLP1.setViewportView(AESSourceArea);
            }
            AES.add(AESSCLP1);
            AESSCLP1.setBounds(4, 81, 611, 139);

            //======== AESSCLP2 ========
            {

                //---- AESResultArea ----
                AESResultArea.setLineWrap(true);
                AESSCLP2.setViewportView(AESResultArea);
            }
            AES.add(AESSCLP2);
            AESSCLP2.setBounds(5, 421, 611, 139);

            //---- AESEncryptBT ----
            AESEncryptBT.setText("Encrypt");
            AESEncryptBT.addActionListener(e -> AESEncryptBTActionPerformed(e));
            AES.add(AESEncryptBT);
            AESEncryptBT.setBounds(123, 345, 115, 45);

            //---- AESDecryptBT ----
            AESDecryptBT.setText("Decrypt");
            AESDecryptBT.addActionListener(e -> AESDecryptBTActionPerformed(e));
            AES.add(AESDecryptBT);
            AESDecryptBT.setBounds(398, 345, 115, 45);

            //---- AESLB3 ----
            AESLB3.setText("SecretKey");
            AESLB3.setFont(AESLB3.getFont().deriveFont(AESLB3.getFont().getSize() + 5f));
            AESLB3.setForeground(null);
            AES.add(AESLB3);
            AESLB3.setBounds(75, 244, 85, AESLB3.getPreferredSize().height);

            //======== AESSCLP3 ========
            {

                //---- AESSecretKeyArea ----
                AESSecretKeyArea.setLineWrap(true);
                AESSCLP3.setViewportView(AESSecretKeyArea);
            }
            AES.add(AESSCLP3);
            AESSCLP3.setBounds(32, 274, 170, 40);
            AES.add(AESModeCB);
            AESModeCB.setBounds(233, 274, 95, 40);
            AES.add(AESOUTCB);
            AESOUTCB.setBounds(359, 274, 95, 40);
            AES.add(AESKLengthCB);
            AESKLengthCB.setBounds(485, 274, 95, 40);

            //---- AESLB4 ----
            AESLB4.setText("Mode");
            AESLB4.setFont(AESLB4.getFont().deriveFont(AESLB4.getFont().getSize() + 5f));
            AESLB4.setForeground(null);
            AES.add(AESLB4);
            AESLB4.setBounds(254, 244, 53, 23);

            //---- AESLB5 ----
            AESLB5.setText("AESLayout");
            AESLB5.setFont(AESLB5.getFont().deriveFont(AESLB5.getFont().getSize() + 5f));
            AESLB5.setForeground(null);
            AES.add(AESLB5);
            AESLB5.setBounds(361, 244, 90, 23);

            //---- AESLB6 ----
            AESLB6.setText(" KLength");
            AESLB6.setFont(AESLB6.getFont().deriveFont(AESLB6.getFont().getSize() + 5f));
            AESLB6.setForeground(null);
            AES.add(AESLB6);
            AESLB6.setBounds(492, 244, 80, 23);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < AES.getComponentCount(); i++) {
                    Rectangle bounds = AES.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = AES.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                AES.setMinimumSize(preferredSize);
                AES.setPreferredSize(preferredSize);
            }
        }
        add(AES);
        AES.setBounds(0, 0, 620, 590);

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
    private JPanel AES;
    private JLabel TitleLBAES;
    private JScrollPane AESSCLP1;
    private JTextArea AESSourceArea;
    private JScrollPane AESSCLP2;
    private JTextArea AESResultArea;
    private JButton AESEncryptBT;
    private JButton AESDecryptBT;
    private JLabel AESLB3;
    private JScrollPane AESSCLP3;
    private JTextArea AESSecretKeyArea;
    private JComboBox AESModeCB;
    private JComboBox AESOUTCB;
    private JComboBox AESKLengthCB;
    private JLabel AESLB4;
    private JLabel AESLB5;
    private JLabel AESLB6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        AESModeCB.addItem("ECB");
        AESModeCB.addItem("CBC");
        //-----------
        AESOUTCB.addItem("Base64");
        AESOUTCB.addItem("HEX");
        //-----------
        AESKLengthCB.addItem("128");
        AESKLengthCB.addItem("192");
        AESKLengthCB.addItem("256");
    }
}
