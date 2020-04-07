/*
 * Created by JFormDesigner on Fri Apr 03 10:32:50 CST 2020
 */

package All_Tool_List.Encryption.Coding.Conversion;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

/**
 * @author 1
 */
public class Conversion_Form extends JPanel {
    public Conversion_Form() {
        initComponents();
        CBOXItemADD();
    }

    private static Conversion_impl Conversion_impl = new Conversion_impl();

    private void BinBTActionPerformed(ActionEvent e) {
        OctalArea.setText(Conversion_impl.BinECOtc(BinaryArea.getText()));
        DecimalArea.setText(Conversion_impl.BinECDec(BinaryArea.getText()));
        HexadecimalArea.setText(Conversion_impl.BinECHEX(BinaryArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }

    private void OctBTActionPerformed(ActionEvent e) {
        BinaryArea.setText(Conversion_impl.OctECBin(OctalArea.getText()));
        DecimalArea.setText(Conversion_impl.OctECDec(OctalArea.getText()));
        HexadecimalArea.setText(Conversion_impl.OctECHEX(OctalArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }

    private void DecBTActionPerformed(ActionEvent e) {
        BinaryArea.setText(Conversion_impl.DecECBin(DecimalArea.getText()));
        OctalArea.setText(Conversion_impl.DecECOct(DecimalArea.getText()));
        HexadecimalArea.setText(Conversion_impl.DecECHEX(DecimalArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }

    private void HexBTActionPerformed(ActionEvent e) {
        BinaryArea.setText(Conversion_impl.HEXECBin(HexadecimalArea.getText(), Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
        OctalArea.setText(Conversion_impl.HEXECOct(HexadecimalArea.getText(),Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
        DecimalArea.setText(Conversion_impl.HEXECDec(HexadecimalArea.getText(),Objects.requireNonNull(ConversionCBox.getSelectedItem()).toString()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Conversion = new JPanel();
        TitleLBConversion = new JLabel();
        ConversionSCLP1 = new JScrollPane();
        BinaryArea = new JTextArea();
        ConversionSCLP2 = new JScrollPane();
        OctalArea = new JTextArea();
        ConversionSCLP3 = new JScrollPane();
        DecimalArea = new JTextArea();
        ConversionSCLP4 = new JScrollPane();
        HexadecimalArea = new JTextArea();
        ConversionLB1 = new JLabel();
        ConversionLB2 = new JLabel();
        ConversionLB3 = new JLabel();
        ConversionLB4 = new JLabel();
        BinBT = new JButton();
        OctBT = new JButton();
        DecBT = new JButton();
        HexBT = new JButton();
        ConversionCBox = new JComboBox();

        //======== this ========
        setLayout(null);

        //======== Conversion ========
        {
            Conversion.setBackground(null);
            Conversion.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Conversion.setLayout(null);

            //---- TitleLBConversion ----
            TitleLBConversion.setText("Conversion");
            TitleLBConversion.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBConversion.setForeground(null);
            Conversion.add(TitleLBConversion);
            TitleLBConversion.setBounds(208, 10, 203, 54);

            //======== ConversionSCLP1 ========
            {

                //---- BinaryArea ----
                BinaryArea.setLineWrap(true);
                ConversionSCLP1.setViewportView(BinaryArea);
            }
            Conversion.add(ConversionSCLP1);
            ConversionSCLP1.setBounds(18, 97, 485, 80);

            //======== ConversionSCLP2 ========
            {

                //---- OctalArea ----
                OctalArea.setLineWrap(true);
                ConversionSCLP2.setViewportView(OctalArea);
            }
            Conversion.add(ConversionSCLP2);
            ConversionSCLP2.setBounds(18, 219, 485, 80);

            //======== ConversionSCLP3 ========
            {

                //---- DecimalArea ----
                DecimalArea.setLineWrap(true);
                ConversionSCLP3.setViewportView(DecimalArea);
            }
            Conversion.add(ConversionSCLP3);
            ConversionSCLP3.setBounds(18, 341, 485, 80);

            //======== ConversionSCLP4 ========
            {

                //---- HexadecimalArea ----
                HexadecimalArea.setLineWrap(true);
                ConversionSCLP4.setViewportView(HexadecimalArea);
            }
            Conversion.add(ConversionSCLP4);
            ConversionSCLP4.setBounds(18, 463, 485, 80);

            //---- ConversionLB1 ----
            ConversionLB1.setText("Oct");
            ConversionLB1.setForeground(null);
            ConversionLB1.setFont(ConversionLB1.getFont().deriveFont(ConversionLB1.getFont().getSize() + 3f));
            Conversion.add(ConversionLB1);
            ConversionLB1.setBounds(20, 193, 60, 23);

            //---- ConversionLB2 ----
            ConversionLB2.setText("Dec");
            ConversionLB2.setForeground(null);
            ConversionLB2.setFont(ConversionLB2.getFont().deriveFont(ConversionLB2.getFont().getSize() + 3f));
            Conversion.add(ConversionLB2);
            ConversionLB2.setBounds(20, 316, 60, 23);

            //---- ConversionLB3 ----
            ConversionLB3.setText("Bin");
            ConversionLB3.setForeground(null);
            ConversionLB3.setFont(ConversionLB3.getFont().deriveFont(ConversionLB3.getFont().getSize() + 3f));
            Conversion.add(ConversionLB3);
            ConversionLB3.setBounds(20, 72, 60, 23);

            //---- ConversionLB4 ----
            ConversionLB4.setText("Hex/O");
            ConversionLB4.setForeground(null);
            ConversionLB4.setFont(ConversionLB4.getFont().deriveFont(ConversionLB4.getFont().getSize() + 3f));
            Conversion.add(ConversionLB4);
            ConversionLB4.setBounds(20, 439, 60, 23);

            //---- BinBT ----
            BinBT.setText("BIN");
            BinBT.addActionListener(e -> BinBTActionPerformed(e));
            Conversion.add(BinBT);
            BinBT.setBounds(523, 118, 78, 38);

            //---- OctBT ----
            OctBT.setText("OCT");
            OctBT.addActionListener(e -> OctBTActionPerformed(e));
            Conversion.add(OctBT);
            OctBT.setBounds(523, 240, 78, 38);

            //---- DecBT ----
            DecBT.setText("DEC");
            DecBT.addActionListener(e -> DecBTActionPerformed(e));
            Conversion.add(DecBT);
            DecBT.setBounds(523, 362, 78, 38);

            //---- HexBT ----
            HexBT.setText("HEX/O");
            HexBT.addActionListener(e -> HexBTActionPerformed(e));
            Conversion.add(HexBT);
            HexBT.setBounds(523, 501, 78, 38);

            //---- ConversionCBox ----
            ConversionCBox.setMaximumRowCount(4);
            Conversion.add(ConversionCBox);
            ConversionCBox.setBounds(523, 464, 78, ConversionCBox.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Conversion.getComponentCount(); i++) {
                    Rectangle bounds = Conversion.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Conversion.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Conversion.setMinimumSize(preferredSize);
                Conversion.setPreferredSize(preferredSize);
            }
        }
        add(Conversion);
        Conversion.setBounds(0, 0, 620, 590);

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
    private JPanel Conversion;
    private JLabel TitleLBConversion;
    private JScrollPane ConversionSCLP1;
    private JTextArea BinaryArea;
    private JScrollPane ConversionSCLP2;
    private JTextArea OctalArea;
    private JScrollPane ConversionSCLP3;
    private JTextArea DecimalArea;
    private JScrollPane ConversionSCLP4;
    private JTextArea HexadecimalArea;
    private JLabel ConversionLB1;
    private JLabel ConversionLB2;
    private JLabel ConversionLB3;
    private JLabel ConversionLB4;
    private JButton BinBT;
    private JButton OctBT;
    private JButton DecBT;
    private JButton HexBT;
    private JComboBox ConversionCBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        ConversionCBox.addItem("HEX");
        for (int i = 3; i < 8; i++) ConversionCBox.addItem(String.valueOf(i));
        for (int i = 9; i < 16; i++) ConversionCBox.addItem(String.valueOf(i));
        for (int i = 17; i <= 30; i++) ConversionCBox.addItem(String.valueOf(i));
    }
}
