import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 09 15:55:56 CST 2020
 */



/**
 * @author 1
 */
public class test_F extends JFrame {
    public test_F() {
        initComponents();
    }

    public void Run(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        textArea1.setText("");
        textArea2.setText("");
        //textArea3.setText("开始");
        new Progress().execute();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        progressBar1 = new JProgressBar();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(204, 255, 204));
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("text");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(580, 25, 173, 455);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textArea1);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(10, 10, 225, 395);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(textArea2);
            }
            panel1.add(scrollPane2);
            scrollPane2.setBounds(265, 10, 225, 395);

            //---- progressBar1 ----
            progressBar1.setIndeterminate(true);
            panel1.add(progressBar1);
            progressBar1.setBounds(320, 430, 120, 30);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(10, 10, 775, 505);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JProgressBar progressBar1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static String ScannerPort(String address,int port,int delay){
        String result = "OPEN";
        Socket socket;
        try{
            socket=new Socket();
            SocketAddress addport=new InetSocketAddress(address, port);
            socket.connect(addport,delay);
            socket.close();
        }catch (IOException e) {
            result = "CLOSE";
        }
        return result;
    }

    class test_1 implements Runnable {
        private String address;
        private int Port;
        private int delay;

        public test_1(String address, int Port, int delay) {
            this.address = address;
            this.Port = Port;
            this.delay = delay;
        }

        @Override
        public void run() {
            if (ScannerPort(address, Port, delay) == "OPEN") {
                System.out.println((Port + ": open"));
                textArea1.append(Port+"\n");
            } else {
                System.out.println(Port);
                textArea2.append(Port+"\n");
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
            // 创建一个固定大小的线程池:
            ExecutorService es = Executors.newFixedThreadPool(5000);
            for (int i = 1; i < 65535; i++) {
                es.submit(new test_1("192.168.101.151",i,2000));
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
            return null;
        }

        @Override
        //每次更新的信息
        protected void process(List<Integer> chunks) {
            //textArea3.setText("任务完成");
        }

        @Override
        //任务完成后返回一个信息
        protected void done() {
            //JOptionPane.showMessageDialog(null, "任务完成！");
        }
    }
}
