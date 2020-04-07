/*
 * Created by JFormDesigner on Fri Apr 03 10:31:13 CST 2020
 */

package All_Tool_List.Encryption.Classical.Vigenere;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Vigenere_Form extends JPanel {
    public Vigenere_Form() {
        initComponents();
    }

    private Vigenere_impl Vigenere_impl = new Vigenere_impl();

    private void VigenereEncodeBTActionPerformed(ActionEvent e) {
        VigenereResultArea.setText(Vigenere_impl.VigenereEncryption(VigenereSorceArea.getText(),VigenereKeyArea.getText()));
    }

    private void VigenereDecoeBTActionPerformed(ActionEvent e) {
        VigenereResultArea.setText(Vigenere_impl.VigenereDecryption(VigenereSorceArea.getText(),VigenereKeyArea.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Vigenere = new JPanel();
        VigenereLB = new JLabel();
        VigenereSCLP1 = new JScrollPane();
        VigenereSorceArea = new JTextArea();
        VigenereSCLP2 = new JScrollPane();
        VigenereResultArea = new JTextArea();
        VigenereEncodeBT = new JButton();
        VigenereDecoeBT = new JButton();
        VigenereSCLP3 = new JScrollPane();
        VigenereKeyArea = new JTextArea();

        //======== this ========
        setLayout(null);

        //======== Vigenere ========
        {
            Vigenere.setBackground(null);
            Vigenere.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Vigenere.setLayout(null);

            //---- VigenereLB ----
            VigenereLB.setText("Vigenere");
            VigenereLB.setFont(new Font("Jokerman", Font.PLAIN, 35));
            VigenereLB.setForeground(null);
            Vigenere.add(VigenereLB);
            VigenereLB.setBounds(230, 35, 161, 54);

            //======== VigenereSCLP1 ========
            {

                //---- VigenereSorceArea ----
                VigenereSorceArea.setLineWrap(true);
                VigenereSCLP1.setViewportView(VigenereSorceArea);
            }
            Vigenere.add(VigenereSCLP1);
            VigenereSCLP1.setBounds(45, 120, 530, 151);

            //======== VigenereSCLP2 ========
            {

                //---- VigenereResultArea ----
                VigenereResultArea.setLineWrap(true);
                VigenereSCLP2.setViewportView(VigenereResultArea);
            }
            Vigenere.add(VigenereSCLP2);
            VigenereSCLP2.setBounds(45, 410, 530, 151);

            //---- VigenereEncodeBT ----
            VigenereEncodeBT.setText("Encrypt");
            VigenereEncodeBT.addActionListener(e -> VigenereEncodeBTActionPerformed(e));
            Vigenere.add(VigenereEncodeBT);
            VigenereEncodeBT.setBounds(76, 318, 115, 45);

            //---- VigenereDecoeBT ----
            VigenereDecoeBT.setText("Decrypt");
            VigenereDecoeBT.addActionListener(e -> VigenereDecoeBTActionPerformed(e));
            Vigenere.add(VigenereDecoeBT);
            VigenereDecoeBT.setBounds(429, 318, 115, 45);

            //======== VigenereSCLP3 ========
            {

                //---- VigenereKeyArea ----
                VigenereKeyArea.setLineWrap(true);
                VigenereSCLP3.setViewportView(VigenereKeyArea);
            }
            Vigenere.add(VigenereSCLP3);
            VigenereSCLP3.setBounds(230, 318, 160, 45);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Vigenere.getComponentCount(); i++) {
                    Rectangle bounds = Vigenere.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Vigenere.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Vigenere.setMinimumSize(preferredSize);
                Vigenere.setPreferredSize(preferredSize);
            }
        }
        add(Vigenere);
        Vigenere.setBounds(0, 0, 620, 590);

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
    private JPanel Vigenere;
    private JLabel VigenereLB;
    private JScrollPane VigenereSCLP1;
    private JTextArea VigenereSorceArea;
    private JScrollPane VigenereSCLP2;
    private JTextArea VigenereResultArea;
    private JButton VigenereEncodeBT;
    private JButton VigenereDecoeBT;
    private JScrollPane VigenereSCLP3;
    private JTextArea VigenereKeyArea;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
