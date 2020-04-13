/*
 * Created by JFormDesigner on Fri Apr 03 10:33:54 CST 2020
 */

package All_Tool_List.Encryption.Coding.MorseCoder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class MorseCoder_Form extends JPanel {
    public MorseCoder_Form() {
        initComponents();
        CBOXItemADD();
    }

    private static MorseCoder_impl MorseCoder_impl = new MorseCoder_impl('.','-');

    private void MorseEnCodeBTActionPerformed(ActionEvent e) {
        MorseDecode.setText(MorseCoder_impl.encode(MorseSource.getText(),MorseCBox.getSelectedItem().toString()));
    }//Morse code

    private void MorseDeCodeBTActionPerformed(ActionEvent e) {
        MorseDecode.setText(MorseCoder_impl.decode(MorseSource.getText(),MorseCBox.getSelectedItem().toString()));
    }//Morse code

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        morse = new JPanel();
        TitleLBMorse = new JLabel();
        morseSCLP1 = new JScrollPane();
        MorseSource = new JTextArea();
        morseSCLP2 = new JScrollPane();
        MorseDecode = new JTextArea();
        MorseEnCodeBT = new JButton();
        MorseDeCodeBT = new JButton();
        MorseCBox = new JComboBox();

        //======== this ========
        setLayout(null);

        //======== morse ========
        {
            morse.setBackground(null);
            morse.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            morse.setLayout(null);

            //---- TitleLBMorse ----
            TitleLBMorse.setText("Morse Code");
            TitleLBMorse.setFont(new Font("Jokerman", Font.PLAIN, 35));
            morse.add(TitleLBMorse);
            TitleLBMorse.setBounds(202, 35, 216, 54);

            //======== morseSCLP1 ========
            {

                //---- MorseSource ----
                MorseSource.setLineWrap(true);
                morseSCLP1.setViewportView(MorseSource);
            }
            morse.add(morseSCLP1);
            morseSCLP1.setBounds(45, 120, 530, 151);

            //======== morseSCLP2 ========
            {

                //---- MorseDecode ----
                MorseDecode.setLineWrap(true);
                morseSCLP2.setViewportView(MorseDecode);
            }
            morse.add(morseSCLP2);
            morseSCLP2.setBounds(45, 410, 530, 151);

            //---- MorseEnCodeBT ----
            MorseEnCodeBT.setText("EnCode");
            MorseEnCodeBT.addActionListener(e -> MorseEnCodeBTActionPerformed(e));
            morse.add(MorseEnCodeBT);
            MorseEnCodeBT.setBounds(104, 318, 115, 45);

            //---- MorseDeCodeBT ----
            MorseDeCodeBT.setText("DeCode");
            MorseDeCodeBT.addActionListener(e -> MorseDeCodeBTActionPerformed(e));
            morse.add(MorseDeCodeBT);
            MorseDeCodeBT.setBounds(407, 318, 115, 45);
            morse.add(MorseCBox);
            MorseCBox.setBounds(249, 321, 128, 38);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < morse.getComponentCount(); i++) {
                    Rectangle bounds = morse.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = morse.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                morse.setMinimumSize(preferredSize);
                morse.setPreferredSize(preferredSize);
            }
        }
        add(morse);
        morse.setBounds(0, 0, 620, 590);

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
    private JPanel morse;
    private JLabel TitleLBMorse;
    private JScrollPane morseSCLP1;
    private JTextArea MorseSource;
    private JScrollPane morseSCLP2;
    private JTextArea MorseDecode;
    private JButton MorseEnCodeBT;
    private JButton MorseDeCodeBT;
    private JComboBox MorseCBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void CBOXItemADD(){
        MorseCBox.addItem("  Space");
        MorseCBox.addItem("/ ");
    }
}
