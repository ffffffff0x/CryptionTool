/*
 * Created by JFormDesigner on Sat Apr 04 09:45:37 CST 2020
 */

package All_Tool_List.Tool.NetTool.WebDirectoryScan;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @author 1
 */
public class WebDirectoryScan_form extends JPanel {
    public WebDirectoryScan_form() {
        initComponents();
    }

    public WebDirectoryScan_impl webDirectoryScan_impl = new WebDirectoryScan_impl();

    private void DictionarySelectBTActionPerformed(ActionEvent e) {
        webDirectoryScan_impl.DirectoryGet();
        try {
            WebDirectoryScanURLArea2.setText(WebDirectoryScanURLTF.getText()+webDirectoryScan_impl.DirectoryTextGet().get(1));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        DirectiryNumberTF.setText(String.valueOf(webDirectoryScan_impl.DirectoryLineGet()));
        WebDirectoryScanDictionaryPathTF.setText(webDirectoryScan_impl.file.getPath());
    }

    private void StartBTActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Template = new JPanel();
        TitleLBWebDirectoryScan = new JLabel();
        WebDirectoryScanURLTF = new JTextField();
        WebDirectoryScanSCLP1 = new JScrollPane();
        WebDirectoryScanOutArea = new JTextArea();
        DictionarySelectBT = new JButton();
        WebDirectoryScanDictionaryPathTF = new JTextField();
        WebDirectoryScanSCLP2 = new JScrollPane();
        WebDirectoryScanStrusCodeArea = new JTextArea();
        WebDirectoryScanLB1 = new JLabel();
        TCSP = new JSpinner();
        LBTC = new JLabel();
        LBDealy = new JLabel();
        DelaySP = new JSpinner();
        StartBT = new JButton();
        LBRunTime = new JLabel();
        LBDirectiryNumber = new JLabel();
        DirectiryNumberTF = new JTextField();
        RunTimeTF = new JTextField();
        PB = new JProgressBar();
        WebDirectoryScanSCLP3 = new JScrollPane();
        WebDirectoryScanURLArea2 = new JTextArea();

        //======== this ========
        setLayout(null);

        //======== Template ========
        {
            Template.setBackground(null);
            Template.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            Template.setLayout(null);

            //---- TitleLBWebDirectoryScan ----
            TitleLBWebDirectoryScan.setText("WebDirectoryScan");
            TitleLBWebDirectoryScan.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLBWebDirectoryScan.setForeground(null);
            Template.add(TitleLBWebDirectoryScan);
            TitleLBWebDirectoryScan.setBounds(142, 15, 335, 54);

            //---- WebDirectoryScanURLTF ----
            WebDirectoryScanURLTF.setText("https://");
            Template.add(WebDirectoryScanURLTF);
            WebDirectoryScanURLTF.setBounds(40, 105, 335, 30);

            //======== WebDirectoryScanSCLP1 ========
            {

                //---- WebDirectoryScanOutArea ----
                WebDirectoryScanOutArea.setEditable(false);
                WebDirectoryScanSCLP1.setViewportView(WebDirectoryScanOutArea);
            }
            Template.add(WebDirectoryScanSCLP1);
            WebDirectoryScanSCLP1.setBounds(395, 90, 185, 475);

            //---- DictionarySelectBT ----
            DictionarySelectBT.setText("\u9009\u62e9\u5b57\u5178");
            DictionarySelectBT.addActionListener(e -> DictionarySelectBTActionPerformed(e));
            Template.add(DictionarySelectBT);
            DictionarySelectBT.setBounds(40, 147, 78, 30);

            //---- WebDirectoryScanDictionaryPathTF ----
            WebDirectoryScanDictionaryPathTF.setEditable(false);
            Template.add(WebDirectoryScanDictionaryPathTF);
            WebDirectoryScanDictionaryPathTF.setBounds(120, 147, 255, 30);

            //======== WebDirectoryScanSCLP2 ========
            {

                //---- WebDirectoryScanStrusCodeArea ----
                WebDirectoryScanStrusCodeArea.setText("200\n204\n301\n302\n307\n401\n");
                WebDirectoryScanStrusCodeArea.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
                WebDirectoryScanStrusCodeArea.setLineWrap(true);
                WebDirectoryScanSCLP2.setViewportView(WebDirectoryScanStrusCodeArea);
            }
            Template.add(WebDirectoryScanSCLP2);
            WebDirectoryScanSCLP2.setBounds(58, 263, 52, 250);

            //---- WebDirectoryScanLB1 ----
            WebDirectoryScanLB1.setText("\u54cd\u5e94\u7801:");
            Template.add(WebDirectoryScanLB1);
            WebDirectoryScanLB1.setBounds(58, 235, 51, 22);

            //---- TCSP ----
            TCSP.setModel(new SpinnerNumberModel(2000, null, null, 1));
            Template.add(TCSP);
            TCSP.setBounds(225, 238, 100, 30);

            //---- LBTC ----
            LBTC.setText("\u7ebf\u7a0b\u6570:");
            Template.add(LBTC);
            LBTC.setBounds(153, 245, 47, LBTC.getPreferredSize().height);

            //---- LBDealy ----
            LBDealy.setText("\u8d85\u65f6\u65f6\u95f4:");
            Template.add(LBDealy);
            LBDealy.setBounds(153, 300, 59, 17);

            //---- DelaySP ----
            DelaySP.setModel(new SpinnerNumberModel(2000, null, null, 1));
            Template.add(DelaySP);
            DelaySP.setBounds(225, 293, 100, 30);

            //---- StartBT ----
            StartBT.setText("\u5f00\u59cb");
            StartBT.addActionListener(e -> StartBTActionPerformed(e));
            Template.add(StartBT);
            StartBT.setBounds(175, 505, 115, 45);

            //---- LBRunTime ----
            LBRunTime.setText("\u8fd0\u884c\u72b6\u6001:");
            Template.add(LBRunTime);
            LBRunTime.setBounds(152, 410, 59, 17);

            //---- LBDirectiryNumber ----
            LBDirectiryNumber.setText("\u5b57\u5178\u6761\u76ee\u6570:");
            Template.add(LBDirectiryNumber);
            LBDirectiryNumber.setBounds(152, 355, 70, 17);

            //---- DirectiryNumberTF ----
            DirectiryNumberTF.setEditable(false);
            DirectiryNumberTF.setHorizontalAlignment(SwingConstants.CENTER);
            Template.add(DirectiryNumberTF);
            DirectiryNumberTF.setBounds(225, 348, 100, 30);

            //---- RunTimeTF ----
            RunTimeTF.setEditable(false);
            RunTimeTF.setHorizontalAlignment(SwingConstants.CENTER);
            RunTimeTF.setText("wait");
            Template.add(RunTimeTF);
            RunTimeTF.setBounds(225, 403, 100, 30);
            Template.add(PB);
            PB.setBounds(164, 457, PB.getPreferredSize().width, 20);

            //======== WebDirectoryScanSCLP3 ========
            {

                //---- WebDirectoryScanURLArea2 ----
                WebDirectoryScanURLArea2.setFont(WebDirectoryScanURLArea2.getFont().deriveFont(WebDirectoryScanURLArea2.getFont().getSize() + 3f));
                WebDirectoryScanURLArea2.setEditable(false);
                WebDirectoryScanSCLP3.setViewportView(WebDirectoryScanURLArea2);
            }
            Template.add(WebDirectoryScanSCLP3);
            WebDirectoryScanSCLP3.setBounds(41, 189, 334, 36);

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
    private JLabel TitleLBWebDirectoryScan;
    private JTextField WebDirectoryScanURLTF;
    private JScrollPane WebDirectoryScanSCLP1;
    private JTextArea WebDirectoryScanOutArea;
    private JButton DictionarySelectBT;
    private JTextField WebDirectoryScanDictionaryPathTF;
    private JScrollPane WebDirectoryScanSCLP2;
    private JTextArea WebDirectoryScanStrusCodeArea;
    private JLabel WebDirectoryScanLB1;
    private JSpinner TCSP;
    private JLabel LBTC;
    private JLabel LBDealy;
    private JSpinner DelaySP;
    private JButton StartBT;
    private JLabel LBRunTime;
    private JLabel LBDirectiryNumber;
    private JTextField DirectiryNumberTF;
    private JTextField RunTimeTF;
    private JProgressBar PB;
    private JScrollPane WebDirectoryScanSCLP3;
    private JTextArea WebDirectoryScanURLArea2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
