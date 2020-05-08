/*
 * Created by JFormDesigner on Fri Apr 03 10:35:43 CST 2020
 */

package All_Tool_List.Encryption.Modern.Hash;

import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.util.Objects;
import javax.swing.*;

/**
 * @author 1
 */
public class Hash_Form extends JPanel {
    public Hash_Form() {
        initComponents();
        CBOXItemADD();
    }

    private Hash_ipml Hash_ipml = new Hash_ipml();

    private void button1ActionPerformed(ActionEvent e) {
        HashencodeHEX.setText(new BigInteger(1, java.util.Base64.getDecoder().decode(Hash_ipml.HashEncode(HashSource.getText(), Objects.requireNonNull(HashCBox.getSelectedItem().toString())))).toString(16));
        HashencodeHEXUP.setText(new BigInteger(1, java.util.Base64.getDecoder().decode(Hash_ipml.HashEncode(HashSource.getText(), Objects.requireNonNull(HashCBox.getSelectedItem().toString())))).toString(16).toUpperCase());
        HashencodeBase64.setText(Hash_ipml.HashEncode(HashSource.getText(), Objects.requireNonNull(HashCBox.getSelectedItem().toString())));

    }

    private void md5fileActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Hash = new JPanel();
        TitleLBHASH = new JLabel();
        HASHSCLP1 = new JScrollPane();
        HashSource = new JTextArea();
        HASHSCLP3 = new JScrollPane();
        HashencodeHEX = new JTextArea();
        HASHSCLP4 = new JScrollPane();
        HashencodeHEXUP = new JTextArea();
        HASHSCLP5 = new JScrollPane();
        HashencodeBase64 = new JTextArea();
        MD5encodebtn = new JButton();
        HASHLB1 = new JLabel();
        HASHLB2 = new JLabel();
        HASHLB3 = new JLabel();
        HASHLB4 = new JLabel();
        HashfileBT = new JButton();
        HashCBox = new JComboBox();

        //======== this ========
        setLayout(null);

        //======== Hash ========
        {
            Hash.setBackground(null);
            Hash.setToolTipText(" ");
            Hash.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Hash.setLayout(null);

            //---- TitleLBHASH ----
            TitleLBHASH.setText("HASH");
            TitleLBHASH.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBHASH.setForeground(null);
            Hash.add(TitleLBHASH);
            TitleLBHASH.setBounds(262, 35, 97, TitleLBHASH.getPreferredSize().height);

            //======== HASHSCLP1 ========
            {

                //---- HashSource ----
                HashSource.setLineWrap(true);
                HASHSCLP1.setViewportView(HashSource);
            }
            Hash.add(HASHSCLP1);
            HASHSCLP1.setBounds(5, 129, 611, 120);

            //======== HASHSCLP3 ========
            {

                //---- HashencodeHEX ----
                HashencodeHEX.setLineWrap(true);
                HASHSCLP3.setViewportView(HashencodeHEX);
            }
            Hash.add(HASHSCLP3);
            HASHSCLP3.setBounds(85, 392, 403, 40);

            //======== HASHSCLP4 ========
            {

                //---- HashencodeHEXUP ----
                HashencodeHEXUP.setLineWrap(true);
                HASHSCLP4.setViewportView(HashencodeHEXUP);
            }
            Hash.add(HASHSCLP4);
            HASHSCLP4.setBounds(85, 449, 403, 40);

            //======== HASHSCLP5 ========
            {

                //---- HashencodeBase64 ----
                HashencodeBase64.setLineWrap(true);
                HASHSCLP5.setViewportView(HashencodeBase64);
            }
            Hash.add(HASHSCLP5);
            HASHSCLP5.setBounds(85, 506, 403, 40);

            //---- MD5encodebtn ----
            MD5encodebtn.setText("Encrypt");
            MD5encodebtn.addActionListener(e -> button1ActionPerformed(e));
            Hash.add(MD5encodebtn);
            MD5encodebtn.setBounds(515, 464, 80, 61);

            //---- HASHLB1 ----
            HASHLB1.setText("\u2191   Source");
            HASHLB1.setBackground(new Color(51, 51, 51));
            HASHLB1.setForeground(null);
            HASHLB1.setFont(HASHLB1.getFont().deriveFont(HASHLB1.getFont().getSize() + 5f));
            Hash.add(HASHLB1);
            HASHLB1.setBounds(12, 258, 98, 22);

            //---- HASHLB2 ----
            HASHLB2.setText("R/HEX");
            HASHLB2.setForeground(null);
            Hash.add(HASHLB2);
            HASHLB2.setBounds(30, 402, 41, 21);

            //---- HASHLB3 ----
            HASHLB3.setText("UPResult");
            HASHLB3.setForeground(null);
            Hash.add(HASHLB3);
            HASHLB3.setBounds(20, 459, 51, 21);

            //---- HASHLB4 ----
            HASHLB4.setText("R/Base64");
            HASHLB4.setForeground(null);
            Hash.add(HASHLB4);
            HASHLB4.setBounds(16, 516, 55, 21);

            //---- HashfileBT ----
            HashfileBT.setText("File");
            HashfileBT.setEnabled(false);
            HashfileBT.addActionListener(e -> md5fileActionPerformed(e));
            Hash.add(HashfileBT);
            HashfileBT.setBounds(122, 295, 96, 53);
            Hash.add(HashCBox);
            HashCBox.setBounds(506, 401, 98, 36);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Hash.getComponentCount(); i++) {
                    Rectangle bounds = Hash.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Hash.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Hash.setMinimumSize(preferredSize);
                Hash.setPreferredSize(preferredSize);
            }
        }
        add(Hash);
        Hash.setBounds(0, 0, 620, 590);

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
    private JPanel Hash;
    private JLabel TitleLBHASH;
    private JScrollPane HASHSCLP1;
    private JTextArea HashSource;
    private JScrollPane HASHSCLP3;
    private JTextArea HashencodeHEX;
    private JScrollPane HASHSCLP4;
    private JTextArea HashencodeHEXUP;
    private JScrollPane HASHSCLP5;
    private JTextArea HashencodeBase64;
    private JButton MD5encodebtn;
    private JLabel HASHLB1;
    private JLabel HASHLB2;
    private JLabel HASHLB3;
    private JLabel HASHLB4;
    private JButton HashfileBT;
    private JComboBox HashCBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        HashCBox.addItem("MD5");
        HashCBox.addItem("MD5-16");
        HashCBox.addItem("MD2");
        HashCBox.addItem("MD4");
        HashCBox.addItem("SHA-1");
        HashCBox.addItem("SHA-224");
        HashCBox.addItem("SHA-256");
        HashCBox.addItem("SHA-384");
        HashCBox.addItem("SHA-512");
    }
}
