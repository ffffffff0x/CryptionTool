/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.Encryption.Coding.HTMLCharEntity;

import All_Tool_List.Encryption.Coding.Conversion.Conversion_impl;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author 1
 */
public class HTMLCharEntity_Form extends JPanel {
    public HTMLCharEntity_Form() {
        initComponents();
        CBOXItemADD();
    }

    private static HTMLCharEntity_impl htmlCharEntity_impl = new HTMLCharEntity_impl();

    private void HTMLCharEntityECBTActionPerformed(ActionEvent e) {
        HTMLCharEntityDesArea.setText(htmlCharEntity_impl.HTMLCharEntityEncode(HTMLCharEntitySourceArea.getText(),HTMLCharEntityCB1.getSelectedItem().toString()));
    }

    private void HTMLCharEntityDCBTActionPerformed(ActionEvent e) {
        HTMLCharEntityDesArea.setText(htmlCharEntity_impl.HTMLCharEntityDecode(HTMLCharEntitySourceArea.getText(),HTMLCharEntityCB1.getSelectedItem().toString()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        HTMLCharEntity = new JPanel();
        TitleLBHTMLCharEntity = new JLabel();
        HTMLCharEntitySCLP1 = new JScrollPane();
        HTMLCharEntitySourceArea = new JTextArea();
        HTMLCharEntitySCLP2 = new JScrollPane();
        HTMLCharEntityDesArea = new JTextArea();
        HTMLCharEntityECBT = new JButton();
        HTMLCharEntityDCBT = new JButton();
        HTMLCharEntityCB1 = new JComboBox();

        //======== this ========
        setLayout(null);

        //======== HTMLCharEntity ========
        {
            HTMLCharEntity.setBackground(null);
            HTMLCharEntity.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            HTMLCharEntity.setLayout(null);

            //---- TitleLBHTMLCharEntity ----
            TitleLBHTMLCharEntity.setText("HTML Character Entity");
            TitleLBHTMLCharEntity.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBHTMLCharEntity.setForeground(null);
            HTMLCharEntity.add(TitleLBHTMLCharEntity);
            TitleLBHTMLCharEntity.setBounds(107, 35, 406, 54);

            //======== HTMLCharEntitySCLP1 ========
            {

                //---- HTMLCharEntitySourceArea ----
                HTMLCharEntitySourceArea.setLineWrap(true);
                HTMLCharEntitySCLP1.setViewportView(HTMLCharEntitySourceArea);
            }
            HTMLCharEntity.add(HTMLCharEntitySCLP1);
            HTMLCharEntitySCLP1.setBounds(45, 120, 530, 151);

            //======== HTMLCharEntitySCLP2 ========
            {

                //---- HTMLCharEntityDesArea ----
                HTMLCharEntityDesArea.setLineWrap(true);
                HTMLCharEntitySCLP2.setViewportView(HTMLCharEntityDesArea);
            }
            HTMLCharEntity.add(HTMLCharEntitySCLP2);
            HTMLCharEntitySCLP2.setBounds(45, 410, 530, 151);

            //---- HTMLCharEntityECBT ----
            HTMLCharEntityECBT.setText("EnCode");
            HTMLCharEntityECBT.addActionListener(e -> HTMLCharEntityECBTActionPerformed(e));
            HTMLCharEntity.add(HTMLCharEntityECBT);
            HTMLCharEntityECBT.setBounds(90, 318, 115, 45);

            //---- HTMLCharEntityDCBT ----
            HTMLCharEntityDCBT.setText("DeCode");
            HTMLCharEntityDCBT.addActionListener(e -> HTMLCharEntityDCBTActionPerformed(e));
            HTMLCharEntity.add(HTMLCharEntityDCBT);
            HTMLCharEntityDCBT.setBounds(417, 318, 115, 45);
            HTMLCharEntity.add(HTMLCharEntityCB1);
            HTMLCharEntityCB1.setBounds(240, 321, 140, 38);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < HTMLCharEntity.getComponentCount(); i++) {
                    Rectangle bounds = HTMLCharEntity.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = HTMLCharEntity.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                HTMLCharEntity.setMinimumSize(preferredSize);
                HTMLCharEntity.setPreferredSize(preferredSize);
            }
        }
        add(HTMLCharEntity);
        HTMLCharEntity.setBounds(0, 0, 620, 595);

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
    private JPanel HTMLCharEntity;
    private JLabel TitleLBHTMLCharEntity;
    private JScrollPane HTMLCharEntitySCLP1;
    private JTextArea HTMLCharEntitySourceArea;
    private JScrollPane HTMLCharEntitySCLP2;
    private JTextArea HTMLCharEntityDesArea;
    private JButton HTMLCharEntityECBT;
    private JButton HTMLCharEntityDCBT;
    private JComboBox HTMLCharEntityCB1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        HTMLCharEntityCB1.addItem("NCR: &#[dec];");//numeric character reference标准,以unicode为转换介质
        HTMLCharEntityCB1.addItem("NCR: &#x[hex];");//numeric character reference标准
        HTMLCharEntityCB1.addItem("CER: &[char];");//character entity reference标准
    }
}
