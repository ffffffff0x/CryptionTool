/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.Encryption.Modern.SM4;

import All_Tool_List.Encryption.Modern.SM4.SM4_impl.SM4Utils;
import com.formdev.flatlaf.ui.FlatTableCellBorder;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author 1
 */
public class SM4_Form extends JPanel {
    public SM4_Form() {
        initComponents();
        CBOXItemADD();
    }

    private static SM4Utils sm4 = new SM4Utils();

    private void SM4EncodeBTActionPerformed(ActionEvent e) {
        sm4.secretKey = KEYField.getText();
        if(SM4CBox1.getSelectedItem().toString().equals("ECB")){
            SM4Area2.setText(sm4.encryptData_ECB(SM4Area1.getText()));
            KEYandIDCheck();
        }else{
            sm4.iv = IVField.getText();
            SM4Area2.setText(sm4.encryptData_CBC(SM4Area1.getText()));
            KEYandIDCheck();
        }
    }

    private void SM4DecodeBTActionPerformed(ActionEvent e) {
        sm4.secretKey = KEYField.getText();
        if(SM4CBox1.getSelectedItem().toString().equals("ECB")){
            SM4Area2.setText(sm4.decryptData_ECB(SM4Area1.getText()));
            KEYandIDCheck();
        }else{
            sm4.iv = IVField.getText();
            SM4Area2.setText(sm4.decryptData_CBC(SM4Area1.getText()));
            KEYandIDCheck();
        }
    }

    private void KEYFieldFocusGained(FocusEvent e) {
        String temp = KEYField.getText();
        if(temp.equals("请输入16字符密钥")) {
            KEYField.setText("");
            KEYField.setForeground(Color.LIGHT_GRAY);
        }
    }

    private void KEYFieldFocusLost(FocusEvent e) {

        //失去焦点时，没有输入内容，显示提示内容
        String temp = KEYField.getText();
        if(temp.equals("")) {
            KEYField.setForeground(Color.GRAY);
            KEYField.setText("请输入16字符密钥");
        }
    }

    private void IVFieldFocusGained(FocusEvent e) {
        String temp = IVField.getText();
        if(temp.equals("CBC模式IV值(16字符)")) {
            IVField.setText("");
            IVField.setForeground(Color.LIGHT_GRAY);
        }
    }

    private void IVFieldFocusLost(FocusEvent e) {
        //失去焦点时，没有输入内容，显示提示内容
        String temp = IVField.getText();
        if(temp.equals("")) {
            IVField.setForeground(Color.GRAY);
            IVField.setText("CBC模式IV值(16字符)");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Template = new JPanel();
        SM4LB = new JLabel();
        SM4SCLP1 = new JScrollPane();
        SM4Area1 = new JTextArea();
        SM4SCLP2 = new JScrollPane();
        SM4Area2 = new JTextArea();
        SM4DecodeBT = new JButton();
        SM4EncodeBT = new JButton();
        KEYField = new JTextField();
        SM4CBox1 = new JComboBox();
        IVField = new JTextField();

        //======== this ========
        setLayout(null);

        //======== Template ========
        {
            Template.setBackground(null);
            Template.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Template.setLayout(null);

            //---- SM4LB ----
            SM4LB.setText("SM4");
            SM4LB.setFont(new Font("Jokerman", Font.PLAIN, 35));
            SM4LB.setForeground(null);
            Template.add(SM4LB);
            SM4LB.setBounds(267, 35, 85, 54);

            //======== SM4SCLP1 ========
            {

                //---- SM4Area1 ----
                SM4Area1.setLineWrap(true);
                SM4SCLP1.setViewportView(SM4Area1);
            }
            Template.add(SM4SCLP1);
            SM4SCLP1.setBounds(45, 120, 530, 151);

            //======== SM4SCLP2 ========
            {

                //---- SM4Area2 ----
                SM4Area2.setLineWrap(true);
                SM4SCLP2.setViewportView(SM4Area2);
            }
            Template.add(SM4SCLP2);
            SM4SCLP2.setBounds(45, 410, 530, 151);

            //---- SM4DecodeBT ----
            SM4DecodeBT.setText("Decrypt");
            SM4DecodeBT.addActionListener(e -> SM4DecodeBTActionPerformed(e));
            Template.add(SM4DecodeBT);
            SM4DecodeBT.setBounds(437, 345, 115, 45);

            //---- SM4EncodeBT ----
            SM4EncodeBT.setText("Encrypt");
            SM4EncodeBT.addActionListener(e -> SM4EncodeBTActionPerformed(e));
            Template.add(SM4EncodeBT);
            SM4EncodeBT.setBounds(437, 290, 115, 45);

            //---- KEYField ----
            KEYField.setText("\u8bf7\u8f93\u516516\u5b57\u7b26\u5bc6\u94a5");
            KEYField.setForeground(Color.gray);
            KEYField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    KEYFieldFocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    KEYFieldFocusLost(e);
                }
            });
            Template.add(KEYField);
            KEYField.setBounds(225, 303, 170, KEYField.getPreferredSize().height);
            Template.add(SM4CBox1);
            SM4CBox1.setBounds(89, 326, 98, 25);

            //---- IVField ----
            IVField.setText("CBC\u6a21\u5f0fIV\u503c(16\u5b57\u7b26)");
            IVField.setForeground(Color.gray);
            IVField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    IVFieldFocusGained(e);
                }
                @Override
                public void focusLost(FocusEvent e) {
                    IVFieldFocusLost(e);
                }
            });
            Template.add(IVField);
            IVField.setBounds(225, 346, 170, IVField.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Template.getComponentCount(); i++) {
                    Rectangle bounds = Template.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Template.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Template.setMinimumSize(preferredSize);
                Template.setPreferredSize(preferredSize);
            }
        }
        add(Template);
        Template.setBounds(0, 0, 620, 590);

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
    private JPanel Template;
    private JLabel SM4LB;
    private JScrollPane SM4SCLP1;
    private JTextArea SM4Area1;
    private JScrollPane SM4SCLP2;
    private JTextArea SM4Area2;
    private JButton SM4DecodeBT;
    private JButton SM4EncodeBT;
    private JTextField KEYField;
    private JComboBox SM4CBox1;
    private JTextField IVField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        SM4CBox1.addItem("ECB");
        SM4CBox1.addItem("CBC");
    }

    private void KEYandIDCheck(){
        if(SM4CBox1.getSelectedItem().toString().equals("ECB"))
        {
            if(KEYField.getText().length()!=16)
            {
                SM4Area2.setText("KEY长度必须为16位字符");
            }
        }else{
            if(KEYField.getText().length()!=16&&IVField.getText().length()!=16)
            {
                SM4Area2.setText("KEY与IV长度必须都为16位字符");
            }
        }
    }
}
