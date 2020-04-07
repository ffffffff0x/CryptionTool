/*
 * Created by JFormDesigner on Fri Apr 03 10:30:45 CST 2020
 */

package All_Tool_List.Encryption.Classical.ROT;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author 1
 */
public class ROT_Form extends JPanel {
    public ROT_Form() {
        initComponents();
        CBOXItemADD();
    }

    private ROT_impl ROT_impl = new ROT_impl();

    private void ROT13CBOXItemStateChanged(ItemEvent e) {
        ROT13edcode.setText(ROT_impl.ROTEncode(ROT13source.getText(), Objects.requireNonNull(ROT13CBOX.getSelectedItem()).toString()));
    }

    private void ROT13sourceCaretUpdate(CaretEvent e) {
        ROT13edcode.setText(ROT_impl.ROTEncode(ROT13source.getText(), Objects.requireNonNull(ROT13CBOX.getSelectedItem()).toString()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ROT13 = new JPanel();
        TitleLBROT = new JLabel();
        ROT13SCLP1 = new JScrollPane();
        ROT13source = new JTextArea();
        ROT13SCLP2 = new JScrollPane();
        ROT13edcode = new JTextArea();
        ROT13CBOX = new JComboBox();

        //======== this ========
        setLayout(null);

        //======== ROT13 ========
        {
            ROT13.setBackground(null);
            ROT13.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            ROT13.setLayout(null);

            //---- TitleLBROT ----
            TitleLBROT.setText("ROT");
            TitleLBROT.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBROT.setForeground(null);
            ROT13.add(TitleLBROT);
            TitleLBROT.setBounds(269, 35, 81, 54);

            //======== ROT13SCLP1 ========
            {
                ROT13SCLP1.setBackground(new Color(60, 63, 65, 160));

                //---- ROT13source ----
                ROT13source.setLineWrap(true);
                ROT13source.addCaretListener(e -> ROT13sourceCaretUpdate(e));
                ROT13SCLP1.setViewportView(ROT13source);
            }
            ROT13.add(ROT13SCLP1);
            ROT13SCLP1.setBounds(45, 120, 530, 151);

            //======== ROT13SCLP2 ========
            {

                //---- ROT13edcode ----
                ROT13edcode.setLineWrap(true);
                ROT13SCLP2.setViewportView(ROT13edcode);
            }
            ROT13.add(ROT13SCLP2);
            ROT13SCLP2.setBounds(45, 410, 530, 151);

            //---- ROT13CBOX ----
            ROT13CBOX.addItemListener(e -> ROT13CBOXItemStateChanged(e));
            ROT13.add(ROT13CBOX);
            ROT13CBOX.setBounds(248, 318, 125, 45);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ROT13.getComponentCount(); i++) {
                    Rectangle bounds = ROT13.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ROT13.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ROT13.setMinimumSize(preferredSize);
                ROT13.setPreferredSize(preferredSize);
            }
        }
        add(ROT13);
        ROT13.setBounds(0, 0, 620, 590);

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
    private JPanel ROT13;
    private JLabel TitleLBROT;
    private JScrollPane ROT13SCLP1;
    private JTextArea ROT13source;
    private JScrollPane ROT13SCLP2;
    private JTextArea ROT13edcode;
    private JComboBox ROT13CBOX;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        for(int i=13;i<=25;i++)//combobox添加node
        {
            String ii = String.valueOf(i);
            ROT13CBOX.addItem("ROT"+ii);
        }
        for (int i = 1; i < 13; i++) {
            String ii = String.valueOf(i);
            ROT13CBOX.addItem("ROT"+ii);
        }
    }
}
