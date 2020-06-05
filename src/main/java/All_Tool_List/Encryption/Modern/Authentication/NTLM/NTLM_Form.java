/*
 * Created by JFormDesigner on Fri Apr 03 10:36:32 CST 2020
 */

package All_Tool_List.Encryption.Modern.Authentication.NTLM;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author 1
 */
public class NTLM_Form extends JPanel {
    public NTLM_Form() {
        initComponents();
    }

    private NTLM_impl NTLM_impl = new NTLM_impl();

    private void NTLMSource1CaretUpdate(CaretEvent e) {
        NTLMencode1.setText(NTLM_impl.NTLMEncrypt(NTLMSource1.getText()));
        NTLMencode2.setText(NTLM_impl.NTLMEncrypt(NTLMSource1.getText()).toUpperCase());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        NTLM = new JPanel();
        TieleLBNTLM = new JLabel();
        NTLMSCLP1 = new JScrollPane();
        NTLMSource1 = new JTextArea();
        NTLMSCLP2 = new JScrollPane();
        NTLMencode1 = new JTextArea();
        NTLMSCLP3 = new JScrollPane();
        NTLMencode2 = new JTextArea();
        NTLMLB1 = new JLabel();
        NTLMLB2 = new JLabel();
        NTLMLB3 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== NTLM ========
        {
            NTLM.setBackground(null);
            NTLM.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            NTLM.setLayout(null);

            //---- TieleLBNTLM ----
            TieleLBNTLM.setText("NTLM-HASH");
            TieleLBNTLM.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TieleLBNTLM.setForeground(null);
            NTLM.add(TieleLBNTLM);
            TieleLBNTLM.setBounds(197, 35, 226, 54);

            //======== NTLMSCLP1 ========
            {

                //---- NTLMSource1 ----
                NTLMSource1.setLineWrap(true);
                NTLMSource1.addCaretListener(e -> NTLMSource1CaretUpdate(e));
                NTLMSCLP1.setViewportView(NTLMSource1);
            }
            NTLM.add(NTLMSCLP1);
            NTLMSCLP1.setBounds(5, 129, 611, 140);

            //======== NTLMSCLP2 ========
            {

                //---- NTLMencode1 ----
                NTLMencode1.setLineWrap(true);
                NTLMSCLP2.setViewportView(NTLMencode1);
            }
            NTLM.add(NTLMSCLP2);
            NTLMSCLP2.setBounds(85, 383, 525, 57);

            //======== NTLMSCLP3 ========
            {

                //---- NTLMencode2 ----
                NTLMencode2.setLineWrap(true);
                NTLMSCLP3.setViewportView(NTLMencode2);
            }
            NTLM.add(NTLMSCLP3);
            NTLMSCLP3.setBounds(85, 469, 525, 57);

            //---- NTLMLB1 ----
            NTLMLB1.setText("\u2191   Source");
            NTLMLB1.setBackground(new Color(51, 51, 51));
            NTLMLB1.setForeground(null);
            NTLMLB1.setFont(NTLMLB1.getFont().deriveFont(NTLMLB1.getFont().getSize() + 5f));
            NTLM.add(NTLMLB1);
            NTLMLB1.setBounds(12, 275, 98, 22);

            //---- NTLMLB2 ----
            NTLMLB2.setText("Result      \u2192");
            NTLMLB2.setForeground(null);
            NTLM.add(NTLMLB2);
            NTLMLB2.setBounds(7, 401, 77, 21);

            //---- NTLMLB3 ----
            NTLMLB3.setText("UPResult  \u2192");
            NTLMLB3.setForeground(null);
            NTLM.add(NTLMLB3);
            NTLMLB3.setBounds(7, 487, 77, 21);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < NTLM.getComponentCount(); i++) {
                    Rectangle bounds = NTLM.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = NTLM.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                NTLM.setMinimumSize(preferredSize);
                NTLM.setPreferredSize(preferredSize);
            }
        }
        add(NTLM);
        NTLM.setBounds(0, 0, 620, 590);

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
    private JPanel NTLM;
    private JLabel TieleLBNTLM;
    private JScrollPane NTLMSCLP1;
    private JTextArea NTLMSource1;
    private JScrollPane NTLMSCLP2;
    private JTextArea NTLMencode1;
    private JScrollPane NTLMSCLP3;
    private JTextArea NTLMencode2;
    private JLabel NTLMLB1;
    private JLabel NTLMLB2;
    private JLabel NTLMLB3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
