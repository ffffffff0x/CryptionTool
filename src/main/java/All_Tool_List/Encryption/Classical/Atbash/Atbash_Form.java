/*
 * Created by JFormDesigner on Fri Apr 03 10:28:41 CST 2020
 */

package All_Tool_List.Encryption.Classical.Atbash;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author 1
 */
public class Atbash_Form extends JPanel {
    public Atbash_Form() {
        initComponents();
    }

    private Atbash_impl Atbash_impl = new Atbash_impl();

    private void AtbashSourceAreaCaretUpdate(CaretEvent e) {
        AtbashDeCodeArea.setText(Atbash_impl.AtbashEnCode(AtbashSourceArea.getText()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Atbash = new JPanel();
        TitleLBAtbash = new JLabel();
        AtbashSCLP1 = new JScrollPane();
        AtbashSourceArea = new JTextArea();
        AtbashSCLP2 = new JScrollPane();
        AtbashDeCodeArea = new JTextArea();
        AtbashLB1 = new JLabel();
        AtbashLB2 = new JLabel();

        //======== this ========
        setLayout(null);

        //======== Atbash ========
        {
            Atbash.setBackground(null);
            Atbash.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Atbash.setLayout(null);

            //---- TitleLBAtbash ----
            TitleLBAtbash.setText("Atabash");
            TitleLBAtbash.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBAtbash.setForeground(null);
            Atbash.add(TitleLBAtbash);
            TitleLBAtbash.setBounds(236, 35, 148, 54);

            //======== AtbashSCLP1 ========
            {

                //---- AtbashSourceArea ----
                AtbashSourceArea.setLineWrap(true);
                AtbashSourceArea.addCaretListener(e -> AtbashSourceAreaCaretUpdate(e));
                AtbashSCLP1.setViewportView(AtbashSourceArea);
            }
            Atbash.add(AtbashSCLP1);
            AtbashSCLP1.setBounds(45, 136, 530, 151);

            //======== AtbashSCLP2 ========
            {

                //---- AtbashDeCodeArea ----
                AtbashDeCodeArea.setLineWrap(true);
                AtbashSCLP2.setViewportView(AtbashDeCodeArea);
            }
            Atbash.add(AtbashSCLP2);
            AtbashSCLP2.setBounds(45, 374, 530, 151);

            //---- AtbashLB1 ----
            AtbashLB1.setText("\u2193  Atbash");
            AtbashLB1.setFont(AtbashLB1.getFont().deriveFont(AtbashLB1.getFont().getSize() + 5f));
            AtbashLB1.setForeground(null);
            Atbash.add(AtbashLB1);
            AtbashLB1.setBounds(465, 350, 155, 23);

            //---- AtbashLB2 ----
            AtbashLB2.setText("Source  \u2191");
            AtbashLB2.setForeground(null);
            AtbashLB2.setFont(AtbashLB2.getFont().deriveFont(AtbashLB2.getFont().getSize() + 5f));
            Atbash.add(AtbashLB2);
            AtbashLB2.setBounds(65, 289, 155, 23);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < Atbash.getComponentCount(); i++) {
                    Rectangle bounds = Atbash.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = Atbash.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                Atbash.setMinimumSize(preferredSize);
                Atbash.setPreferredSize(preferredSize);
            }
        }
        add(Atbash);
        Atbash.setBounds(0, 0, 620, 590);

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
    private JPanel Atbash;
    private JLabel TitleLBAtbash;
    private JScrollPane AtbashSCLP1;
    private JTextArea AtbashSourceArea;
    private JScrollPane AtbashSCLP2;
    private JTextArea AtbashDeCodeArea;
    private JLabel AtbashLB1;
    private JLabel AtbashLB2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
