/*
 * Created by JFormDesigner on Mon Jun 08 08:52:43 CST 2020
 */

package ThredLocker;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.*;

/**
 * @author 1
 */
public class ThredLokerTestForm extends JFrame {
    public ThredLokerTestForm() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void setTextArea1(String testString) {
        synchronized(this) {
            textArea1.append(testString+"\n");
        }
    }

    private void button1ActionPerformed(ActionEvent e) {
        new SwingWorkerTest().execute();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setLineWrap(true);
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(4, 5, 295, 465);

        //---- button1 ----
        button1.setText("test");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(315, 15), button1.getPreferredSize()));

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
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    class SwingWorkerTest extends SwingWorker<Void, Integer>{

        @Override
        protected Void doInBackground() throws Exception {
            ExecutorService pool = Executors.newFixedThreadPool(500);
            //System.out.println("threadNum:"+threadNum);
            for (int i = 0; i < 500; i++) {
                pool.submit(new RunnableTest(i));
            }
            // 关闭线程池。
            pool.shutdown();
            return null;
        }
    }

    class RunnableTest implements Runnable {

        String b;

        public RunnableTest(int a){
            b = String.valueOf(a)+" ::234234234234";
        }

        @Override
        public void run() {
            setTextArea1(b);
        }
    }
}
