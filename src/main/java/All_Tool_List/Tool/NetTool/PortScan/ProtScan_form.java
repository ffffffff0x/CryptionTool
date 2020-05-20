/*
 * Created by JFormDesigner on Fri Apr 10 10:26:02 CST 2020
 */

package All_Tool_List.Tool.NetTool.PortScan;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.*;

/**
 * @author 1
 */
public class ProtScan_form extends JPanel {
    private String IP = "";
    private int SPortN = 1;
    private int EPortN = 65535;
    private int TCN = 2000;
    private int DelayN = 2000;

    public ProtScan_form() {
        initComponents();
    }

    private void STBTActionPerformed(ActionEvent e) {
        init(IPTF.getText(),(int)SPortSP.getValue(),(int)EPortSP.getValue(),(int)TCSP.getValue(),(int)DelaySP.getValue());

        if(isHostReachable(IP,DelayN)){
            PortArea.setText("");
            STBT.setEnabled(false);
            STATE2.setText("Running");
            PortScanRunPB.setVisible(true);
            new Progress().execute();
        }else {
            PortArea.setText("NONE Target");
        }
    }

    private void PortSortBTActionPerformed(ActionEvent e) {
        PortArea.setText(PortSort(PortArea.getText()));
    }

    private void PortFastBTActionPerformed(ActionEvent e) {
        new PortFast_form().setSize(550,645);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ProtScan = new JPanel();
        TitleLB = new JLabel();
        PortScanSCLP = new JScrollPane();
        PortArea = new JTextArea();
        STBT = new JButton();
        SPortSP = new JSpinner();
        EPortSP = new JSpinner();
        TCSP = new JSpinner();
        DelaySP = new JSpinner();
        SPort = new JLabel();
        EPort = new JLabel();
        TC = new JLabel();
        DE = new JLabel();
        IPTF = new JTextField();
        ip = new JLabel();
        STATE = new JLabel();
        STATE2 = new JTextField();
        PortSortBT = new JButton();
        PortFastBT = new JButton();
        label1 = new JLabel();
        PortScanRunPB = new JProgressBar();

        //======== this ========
        setLayout(null);

        //======== ProtScan ========
        {
            ProtScan.setBackground(null);
            ProtScan.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
            ProtScan.setLayout(null);

            //---- TitleLB ----
            TitleLB.setText("Port Scan");
            TitleLB.setFont(new Font("Jokerman", Font.PLAIN, 35));
            TitleLB.setForeground(null);
            ProtScan.add(TitleLB);
            TitleLB.setBounds(221, 15, 177, 54);

            //======== PortScanSCLP ========
            {

                //---- PortArea ----
                PortArea.setLineWrap(true);
                PortArea.setBackground(null);
                PortArea.setEditable(false);
                PortScanSCLP.setViewportView(PortArea);
            }
            ProtScan.add(PortScanSCLP);
            PortScanSCLP.setBounds(395, 90, 185, 475);

            //---- STBT ----
            STBT.setText("Start");
            STBT.addActionListener(e -> STBTActionPerformed(e));
            ProtScan.add(STBT);
            STBT.setBounds(145, 475, 115, 45);

            //---- SPortSP ----
            SPortSP.setModel(new SpinnerNumberModel(1, null, null, 1));
            ProtScan.add(SPortSP);
            SPortSP.setBounds(220, 182, 100, 30);

            //---- EPortSP ----
            EPortSP.setModel(new SpinnerNumberModel(65535, null, null, 1));
            ProtScan.add(EPortSP);
            EPortSP.setBounds(220, 238, 100, 30);

            //---- TCSP ----
            TCSP.setModel(new SpinnerNumberModel(2000, null, null, 1));
            ProtScan.add(TCSP);
            TCSP.setBounds(220, 294, 100, 30);

            //---- DelaySP ----
            DelaySP.setModel(new SpinnerNumberModel(2000, null, null, 1));
            ProtScan.add(DelaySP);
            DelaySP.setBounds(220, 350, 100, 30);

            //---- SPort ----
            SPort.setText("Start Port");
            SPort.setFont(SPort.getFont().deriveFont(SPort.getFont().getSize() + 3f));
            ProtScan.add(SPort);
            SPort.setBounds(75, 185, 110, 25);

            //---- EPort ----
            EPort.setText("End Port");
            EPort.setFont(EPort.getFont().deriveFont(EPort.getFont().getSize() + 3f));
            ProtScan.add(EPort);
            EPort.setBounds(75, 241, 110, 25);

            //---- TC ----
            TC.setText("Thread count");
            TC.setFont(TC.getFont().deriveFont(TC.getFont().getSize() + 3f));
            ProtScan.add(TC);
            TC.setBounds(75, 297, 110, 25);

            //---- DE ----
            DE.setText("Delay");
            DE.setFont(DE.getFont().deriveFont(DE.getFont().getSize() + 3f));
            ProtScan.add(DE);
            DE.setBounds(75, 353, 110, 25);

            //---- IPTF ----
            IPTF.setHorizontalAlignment(SwingConstants.LEFT);
            ProtScan.add(IPTF);
            IPTF.setBounds(160, 112, 160, IPTF.getPreferredSize().height);

            //---- ip ----
            ip.setText("Target");
            ip.setFont(ip.getFont().deriveFont(ip.getFont().getSize() + 3f));
            ProtScan.add(ip);
            ip.setBounds(85, 116, 60, 20);

            //---- STATE ----
            STATE.setText("State");
            STATE.setFont(STATE.getFont().deriveFont(STATE.getFont().getSize() + 3f));
            ProtScan.add(STATE);
            STATE.setBounds(75, 409, 110, 25);

            //---- STATE2 ----
            STATE2.setEditable(false);
            STATE2.setText("Wait");
            STATE2.setHorizontalAlignment(SwingConstants.CENTER);
            STATE2.setBackground(null);
            ProtScan.add(STATE2);
            STATE2.setBounds(223, 406, 95, STATE2.getPreferredSize().height);

            //---- PortSortBT ----
            PortSortBT.setText("S");
            PortSortBT.setHorizontalAlignment(SwingConstants.LEFT);
            PortSortBT.addActionListener(e -> PortSortBTActionPerformed(e));
            ProtScan.add(PortSortBT);
            PortSortBT.setBounds(375, 96, 34, 59);

            //---- PortFastBT ----
            PortFastBT.setText("H");
            PortFastBT.setHorizontalAlignment(SwingConstants.LEFT);
            PortFastBT.addActionListener(e -> PortFastBTActionPerformed(e));
            ProtScan.add(PortFastBT);
            PortFastBT.setBounds(375, 156, 34, 59);

            //---- label1 ----
            label1.setText("S:\u6392\u5e8f  H:\u7aef\u53e3\u5e2e\u52a9\u4fe1\u606f");
            ProtScan.add(label1);
            label1.setBounds(5, 573, 610, label1.getPreferredSize().height);

            //---- PortScanRunPB ----
            PortScanRunPB.setIndeterminate(true);
            PortScanRunPB.setBackground(new Color(102, 102, 102));
            PortScanRunPB.setVisible(false);
            ProtScan.add(PortScanRunPB);
            PortScanRunPB.setBounds(223, 440, 95, 20);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < ProtScan.getComponentCount(); i++) {
                    Rectangle bounds = ProtScan.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = ProtScan.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                ProtScan.setMinimumSize(preferredSize);
                ProtScan.setPreferredSize(preferredSize);
            }
        }
        add(ProtScan);
        ProtScan.setBounds(0, 0, 620, 590);

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
    private JPanel ProtScan;
    private JLabel TitleLB;
    private JScrollPane PortScanSCLP;
    private JTextArea PortArea;
    private JButton STBT;
    private JSpinner SPortSP;
    private JSpinner EPortSP;
    private JSpinner TCSP;
    private JSpinner DelaySP;
    private JLabel SPort;
    private JLabel EPort;
    private JLabel TC;
    private JLabel DE;
    private JTextField IPTF;
    private JLabel ip;
    private JLabel STATE;
    private JTextField STATE2;
    private JButton PortSortBT;
    private JButton PortFastBT;
    private JLabel label1;
    private JProgressBar PortScanRunPB;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void init(String ip,int sp,int ep,int tc,int de) {
        this.IP = ip;
        this.SPortN = sp;
        this.EPortN = ep;
        this.TCN = tc;
        this.DelayN = de;
    }

    public static boolean isHostReachable(String host, Integer timeOut) {
        try {
            return InetAddress.getByName(host).isReachable(timeOut);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String PortSort(String source) {
        String[] Sort = source.split("\n");
        StringBuilder sb = new StringBuilder();
        int i,j;
        for(i=0;i<Sort.length-1;i++)
        {
            for(j=0;j<Sort.length-1-i;j++)
            {
                if(Integer.parseInt(Sort[j])>Integer.parseInt(Sort[j+1]))
                {
                    String temp = Sort[j];
                    Sort[j] = Sort[j+1];
                    Sort[j+1] = temp;
                }
            }
        }
        for (String a:Sort
             ) {
            sb.append(a+"\n");
        }
        return sb.toString();
    }

class PortScan implements Runnable {
        private String address;
        private int Port;
        private int delay;

        public PortScan(String address, int Port, int delay) {
            this.address = address;
            this.Port = Port;
            this.delay = delay;
        }

        @Override
        public void run() {
            if (ScannerPort(address, Port, delay) == "OPEN") {
                //System.out.println((Port + ": open"));
                PortArea.append(Port+"\n");
            } else {
                //System.out.println(Port);
            }
        }

        public String ScannerPort(String address, int port, int delay) {
            String result = "OPEN";
            Socket socket;
            try {
                socket = new Socket();
                SocketAddress addport = new InetSocketAddress(address, port);
                socket.connect(addport, delay);
                socket.close();
            } catch (IOException e) {
                result = "CLOSE";
            }
            return result;
        }
    }

class Progress extends SwingWorker<Void, Integer> {

        @Override
        //后台任务在此方法中实现
        protected Void doInBackground() throws InterruptedException {
            ThreadRun();
            return null;
        }

        public void ThreadRun() throws InterruptedException {
            // 创建一个固定大小的线程池:
            ExecutorService es = Executors.newFixedThreadPool(TCN);
            for (int i = SPortN; i < EPortN; i++) {
                es.submit(new PortScan(IP,i,DelayN));
            }
            // 关闭线程池:
            es.shutdown();
            while (true){
                if(es.isTerminated()){
                    publish(1);//将当前进度信息加入chunks中
                    break;
                }
                Thread.sleep(3000);
            }
        }

        @Override
        //每次更新的信息
        protected void process(List<Integer> chunks) {
            STATE2.setText("Complete");
            PortScanRunPB.setVisible(false);
            STBT.setEnabled(true);
        }

        @Override
        //任务完成后返回一个信息
        protected void done() {
            //JOptionPane.showMessageDialog(null, "任务完成！");
        }
    }
}
