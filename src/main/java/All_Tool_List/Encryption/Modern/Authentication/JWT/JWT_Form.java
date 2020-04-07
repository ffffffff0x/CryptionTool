/*
 * Created by JFormDesigner on Fri Apr 03 10:15:00 CST 2020
 */

package All_Tool_List.Encryption.Modern.Authentication.JWT;

import java.awt.*;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;

/**
 * @author 1
 */
public class JWT_Form extends JPanel {
    public JWT_Form() {
        initComponents();
    }

    private JWT_impl JWT_impl = new JWT_impl();

    private void JWTEncodeBTActionPerformed(ActionEvent e) {
        try {
            JWTTokenArea.setText(JWT_impl.JWTencode(JWTHeaderArea.getText(),JWTPayloadArea.getText(),JWTSignatureArea.getText()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

    private void JWTDecodeBTActionPerformed(ActionEvent e) {
        String[] out = JWT_impl.JWTdecode(JWTTokenArea.getText());
        JWTHeaderArea.setText(out[0]);
        JWTPayloadArea.setText(out[1]);
        JWTSignatureArea.setText(out[2]);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        JWT = new JPanel();
        TitleLBJWT = new JLabel();
        JWTSCLP1 = new JScrollPane();
        JWTHeaderArea = new JTextArea();
        JWTSCLP2 = new JScrollPane();
        JWTPayloadArea = new JTextArea();
        JWTSCLP3 = new JScrollPane();
        JWTSignatureArea = new JTextArea();
        JWTSCLP4 = new JScrollPane();
        JWTTokenArea = new JTextArea();
        JWTLB1 = new JLabel();
        JWTLB2 = new JLabel();
        JWTLB3 = new JLabel();
        JWTLB4 = new JLabel();
        JWTEncodeBT = new JButton();
        JWTDecodeBT = new JButton();

        //======== this ========
        setLayout(null);

        //======== JWT ========
        {
            JWT.setBackground(null);
            JWT.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            JWT.setLayout(null);

            //---- TitleLBJWT ----
            TitleLBJWT.setText("JWT");
            TitleLBJWT.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBJWT.setForeground(null);
            JWT.add(TitleLBJWT);
            TitleLBJWT.setBounds(264, 28, 92, 54);

            //======== JWTSCLP1 ========
            {

                //---- JWTHeaderArea ----
                JWTHeaderArea.setLineWrap(true);
                JWTSCLP1.setViewportView(JWTHeaderArea);
            }
            JWT.add(JWTSCLP1);
            JWTSCLP1.setBounds(16, 135, 180, 170);

            //======== JWTSCLP2 ========
            {

                //---- JWTPayloadArea ----
                JWTPayloadArea.setLineWrap(true);
                JWTSCLP2.setViewportView(JWTPayloadArea);
            }
            JWT.add(JWTSCLP2);
            JWTSCLP2.setBounds(221, 135, 180, 170);

            //======== JWTSCLP3 ========
            {

                //---- JWTSignatureArea ----
                JWTSignatureArea.setLineWrap(true);
                JWTSCLP3.setViewportView(JWTSignatureArea);
            }
            JWT.add(JWTSCLP3);
            JWTSCLP3.setBounds(426, 135, 180, 170);

            //======== JWTSCLP4 ========
            {

                //---- JWTTokenArea ----
                JWTTokenArea.setLineWrap(true);
                JWTSCLP4.setViewportView(JWTTokenArea);
            }
            JWT.add(JWTSCLP4);
            JWTSCLP4.setBounds(15, 415, 593, 140);

            //---- JWTLB1 ----
            JWTLB1.setText("TOKEN :");
            JWTLB1.setFont(JWTLB1.getFont().deriveFont(JWTLB1.getFont().getSize() + 5f));
            JWTLB1.setForeground(null);
            JWT.add(JWTLB1);
            JWTLB1.setBounds(19, 384, 70, 32);

            //---- JWTLB2 ----
            JWTLB2.setText("Header :");
            JWTLB2.setFont(JWTLB2.getFont().deriveFont(JWTLB2.getFont().getSize() + 5f));
            JWTLB2.setForeground(null);
            JWT.add(JWTLB2);
            JWTLB2.setBounds(19, 104, 75, 32);

            //---- JWTLB3 ----
            JWTLB3.setText("Payload :");
            JWTLB3.setFont(JWTLB3.getFont().deriveFont(JWTLB3.getFont().getSize() + 5f));
            JWTLB3.setForeground(null);
            JWT.add(JWTLB3);
            JWTLB3.setBounds(224, 104, 75, 32);

            //---- JWTLB4 ----
            JWTLB4.setText("Verify Signature :");
            JWTLB4.setFont(JWTLB4.getFont().deriveFont(JWTLB4.getFont().getSize() + 5f));
            JWTLB4.setForeground(null);
            JWT.add(JWTLB4);
            JWTLB4.setBounds(429, 104, 165, 32);

            //---- JWTEncodeBT ----
            JWTEncodeBT.setFont(JWTEncodeBT.getFont().deriveFont(Font.BOLD));
            JWTEncodeBT.setText("\u2193");
            JWTEncodeBT.addActionListener(e -> JWTEncodeBTActionPerformed(e));
            JWT.add(JWTEncodeBT);
            JWTEncodeBT.setBounds(139, 339, 130, 40);

            //---- JWTDecodeBT ----
            JWTDecodeBT.setText("\u2191");
            JWTDecodeBT.setFont(JWTDecodeBT.getFont().deriveFont(JWTDecodeBT.getFont().getStyle() | Font.BOLD));
            JWTDecodeBT.addActionListener(e -> JWTDecodeBTActionPerformed(e));
            JWT.add(JWTDecodeBT);
            JWTDecodeBT.setBounds(339, 339, 130, 40);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < JWT.getComponentCount(); i++) {
                    Rectangle bounds = JWT.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = JWT.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                JWT.setMinimumSize(preferredSize);
                JWT.setPreferredSize(preferredSize);
            }
        }
        add(JWT);
        JWT.setBounds(0, 0, 620, 590);

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
    private JPanel JWT;
    private JLabel TitleLBJWT;
    private JScrollPane JWTSCLP1;
    private JTextArea JWTHeaderArea;
    private JScrollPane JWTSCLP2;
    private JTextArea JWTPayloadArea;
    private JScrollPane JWTSCLP3;
    private JTextArea JWTSignatureArea;
    private JScrollPane JWTSCLP4;
    private JTextArea JWTTokenArea;
    private JLabel JWTLB1;
    private JLabel JWTLB2;
    private JLabel JWTLB3;
    private JLabel JWTLB4;
    private JButton JWTEncodeBT;
    private JButton JWTDecodeBT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
