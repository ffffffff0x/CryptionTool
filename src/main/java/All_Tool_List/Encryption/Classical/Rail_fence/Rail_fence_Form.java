/*
 * Created by JFormDesigner on Fri Apr 03 10:30:07 CST 2020
 */

package All_Tool_List.Encryption.Classical.Rail_fence;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1
 */
public class Rail_fence_Form extends JPanel {
    public Rail_fence_Form() {
        initComponents();
    }

    private Rail_fence_impl Rail_fence_impl = new Rail_fence_impl();

    private void Rail_fenceBT1ActionPerformed(ActionEvent e) {
        Rail_fenceDecode.setText(Rail_fence_impl.Rail_fenceEnCode(Rail_fenceSource.getText(),Integer.parseInt(Rail_fenceSpinner1.getValue().toString())));
    }

    private void Rail_fenceBT2ActionPerformed(ActionEvent e) {
        Rail_fenceDecode.setText(Rail_fence_impl.Rail_fenceDeCode(Rail_fenceSource.getText(),Integer.parseInt(Rail_fenceSpinner1.getValue().toString())));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Rail_fence = new JPanel();
        TitleLBRai_Fence = new JLabel();
        Rail_fenceSCLP1 = new JScrollPane();
        Rail_fenceSource = new JTextArea();
        Rail_fenceSCLP2 = new JScrollPane();
        Rail_fenceDecode = new JTextArea();
        Rail_fenceBT1 = new JButton();
        Rail_fenceBT2 = new JButton();
        Rail_fenceSpinner1 = new JSpinner();

        //======== this ========
        setLayout(null);

        //======== Rail_fence ========
        {
            Rail_fence.setBackground(null);
            Rail_fence.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Rail_fence.setLayout(null);

            //---- TitleLBRai_Fence ----
            TitleLBRai_Fence.setText("Rail Fence");
            TitleLBRai_Fence.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBRai_Fence.setForeground(null);
            Rail_fence.add(TitleLBRai_Fence);
            TitleLBRai_Fence.setBounds(221, 35, 178, 54);

            //======== Rail_fenceSCLP1 ========
            {

                //---- Rail_fenceSource ----
                Rail_fenceSource.setLineWrap(true);
                Rail_fenceSCLP1.setViewportView(Rail_fenceSource);
            }
            Rail_fence.add(Rail_fenceSCLP1);
            Rail_fenceSCLP1.setBounds(45, 120, 530, 151);

            //======== Rail_fenceSCLP2 ========
            {

                //---- Rail_fenceDecode ----
                Rail_fenceDecode.setLineWrap(true);
                Rail_fenceSCLP2.setViewportView(Rail_fenceDecode);
            }
            Rail_fence.add(Rail_fenceSCLP2);
            Rail_fenceSCLP2.setBounds(45, 410, 530, 151);

            //---- Rail_fenceBT1 ----
            Rail_fenceBT1.setText("Encrypt");
            Rail_fenceBT1.addActionListener(e -> Rail_fenceBT1ActionPerformed(e));
            Rail_fence.add(Rail_fenceBT1);
            Rail_fenceBT1.setBounds(104, 318, 115, 45);

            //---- Rail_fenceBT2 ----
            Rail_fenceBT2.setText("Decrypt");
            Rail_fenceBT2.addActionListener(e -> Rail_fenceBT2ActionPerformed(e));
            Rail_fence.add(Rail_fenceBT2);
            Rail_fenceBT2.setBounds(407, 318, 115, 45);

            //---- Rail_fenceSpinner1 ----
            Rail_fenceSpinner1.setModel(new SpinnerNumberModel(2, null, null, 1));
            Rail_fence.add(Rail_fenceSpinner1);
            Rail_fenceSpinner1.setBounds(263, 321, 100, 38);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Rail_fence.getComponentCount(); i++) {
                    Rectangle bounds = Rail_fence.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Rail_fence.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Rail_fence.setMinimumSize(preferredSize);
                Rail_fence.setPreferredSize(preferredSize);
            }
        }
        add(Rail_fence);
        Rail_fence.setBounds(0, 0, 620, 590);

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
    private JPanel Rail_fence;
    private JLabel TitleLBRai_Fence;
    private JScrollPane Rail_fenceSCLP1;
    private JTextArea Rail_fenceSource;
    private JScrollPane Rail_fenceSCLP2;
    private JTextArea Rail_fenceDecode;
    private JButton Rail_fenceBT1;
    private JButton Rail_fenceBT2;
    private JSpinner Rail_fenceSpinner1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
