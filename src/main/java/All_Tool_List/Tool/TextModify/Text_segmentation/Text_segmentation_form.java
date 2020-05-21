/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.Tool.TextModify.Text_segmentation;

import All_Tool_List.Tool.TextModify.Text_substitution.Text_substitution_impl;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author 1
 */
public class Text_segmentation_form extends JPanel {
    public Text_segmentation_form() {
        initComponents();
    }

    private Text_segmentation_impl Text_segmentation_impl = new Text_segmentation_impl();

    private void Text_segmentationBTActionPerformed(ActionEvent e) {
        Text_segmentationDESArea.setText(Text_segmentation_impl.Text_segmentation(Text_segmentationSoiurceArea.getText(),Text_segmentationSEG.getText(),(int)Text_segmentationSP.getValue()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Text_segmentation = new JPanel();
        TitleLBText_segmentation = new JLabel();
        Text_segmentationLB1 = new JLabel();
        Text_segmentationSCLP1 = new JScrollPane();
        Text_segmentationSoiurceArea = new JTextArea();
        Text_segmentationSCLP2 = new JScrollPane();
        Text_segmentationDESArea = new JTextArea();
        Text_segmentationBT = new JButton();
        Text_segmentationSP = new JSpinner();
        Text_segmentationSCLP3 = new JScrollPane();
        Text_segmentationSEG = new JTextArea();
        Text_segmentationLB2 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== Text_segmentation ========
        {
            Text_segmentation.setBackground(null);
            Text_segmentation.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Text_segmentation.setLayout(null);

            //---- TitleLBText_segmentation ----
            TitleLBText_segmentation.setText("Text Segmentation");
            TitleLBText_segmentation.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBText_segmentation.setForeground(null);
            Text_segmentation.add(TitleLBText_segmentation);
            TitleLBText_segmentation.setBounds(148, 35, 324, 54);

            //---- Text_segmentationLB1 ----
            Text_segmentationLB1.setText("SplitString");
            Text_segmentation.add(Text_segmentationLB1);
            Text_segmentationLB1.setBounds(263, 302, 62, 16);

            //======== Text_segmentationSCLP1 ========
            {

                //---- Text_segmentationSoiurceArea ----
                Text_segmentationSoiurceArea.setLineWrap(true);
                Text_segmentationSCLP1.setViewportView(Text_segmentationSoiurceArea);
            }
            Text_segmentation.add(Text_segmentationSCLP1);
            Text_segmentationSCLP1.setBounds(45, 120, 530, 151);

            //======== Text_segmentationSCLP2 ========
            {

                //---- Text_segmentationDESArea ----
                Text_segmentationDESArea.setLineWrap(true);
                Text_segmentationSCLP2.setViewportView(Text_segmentationDESArea);
            }
            Text_segmentation.add(Text_segmentationSCLP2);
            Text_segmentationSCLP2.setBounds(45, 410, 530, 151);

            //---- Text_segmentationBT ----
            Text_segmentationBT.setText("segmentation");
            Text_segmentationBT.addActionListener(e -> Text_segmentationBTActionPerformed(e));
            Text_segmentation.add(Text_segmentationBT);
            Text_segmentationBT.setBounds(427, 315, 115, 45);
            Text_segmentation.add(Text_segmentationSP);
            Text_segmentationSP.setBounds(97, 317, 95, 40);

            //======== Text_segmentationSCLP3 ========
            {
                Text_segmentationSCLP3.setViewportView(Text_segmentationSEG);
            }
            Text_segmentation.add(Text_segmentationSCLP3);
            Text_segmentationSCLP3.setBounds(262, 317, 95, 40);

            //---- Text_segmentationLB2 ----
            Text_segmentationLB2.setText("SplitString:\u9ed8\u8ba4\u4e0d\u586b\u5219\u4e3a\u7a7a\u683c\u5206\u5272");
            Text_segmentation.add(Text_segmentationLB2);
            Text_segmentationLB2.setBounds(5, 570, 195, 16);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Text_segmentation.getComponentCount(); i++) {
                    Rectangle bounds = Text_segmentation.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Text_segmentation.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Text_segmentation.setMinimumSize(preferredSize);
                Text_segmentation.setPreferredSize(preferredSize);
            }
        }
        add(Text_segmentation);
        Text_segmentation.setBounds(0, 0, 620, 590);

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
    private JPanel Text_segmentation;
    private JLabel TitleLBText_segmentation;
    private JLabel Text_segmentationLB1;
    private JScrollPane Text_segmentationSCLP1;
    private JTextArea Text_segmentationSoiurceArea;
    private JScrollPane Text_segmentationSCLP2;
    private JTextArea Text_segmentationDESArea;
    private JButton Text_segmentationBT;
    private JSpinner Text_segmentationSP;
    private JScrollPane Text_segmentationSCLP3;
    private JTextArea Text_segmentationSEG;
    private JLabel Text_segmentationLB2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
